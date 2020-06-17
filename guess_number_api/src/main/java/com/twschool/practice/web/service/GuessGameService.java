package com.twschool.practice.web.service;

import com.twschool.practice.domain.GameStatus;
import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.domain.RandomAnswerGenerator;
import com.twschool.practice.web.dao.entity.Game;
import com.twschool.practice.web.dao.entity.UserInfo;
import com.twschool.practice.web.dao.impl.GameDao;
import com.twschool.practice.web.dao.impl.UserDao;
import com.twschool.practice.web.entity.DTO;
import com.twschool.practice.web.entity.ResultDTO;
import com.twschool.practice.web.entity.ResultPlayingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

@Service
public class GuessGameService {

    @Autowired
    UserDao userDao;

    @Autowired
    GameDao gameDao;

    public ResultPlayingDTO guessById(String guess, String id){
        Game playingGame = gameDao.getPlayingGame(id);
        if(null == playingGame || playingGame.isCompleted())
            playingGame = startGame(id);
        return contineGame(guess, id, playingGame);
    }

    private ResultPlayingDTO contineGame(String guess, String id, Game playingGame) {
        ResultPlayingDTO resultPlayingDTO = new ResultPlayingDTO();

        GuessNumberGame guessNumberGame = playingGame.getGuessNumberGame();
        String result = guessNumberGame.guess(Arrays.asList(guess.split(" ")));
        if(guessNumberGame.getStatus().equals(GameStatus.FAILED) || guessNumberGame.getStatus().equals(GameStatus.SUCCEED)) {
            try {
                gameDao.completeGame(id);
                calculateScore(guessNumberGame, id);
            } catch (Exception e) {
                e.printStackTrace();
                resultPlayingDTO.setErrorMsg(e.getMessage());
                resultPlayingDTO.setError(true);
            }
        }

        resultPlayingDTO.setGameStatus(guessNumberGame.getStatus().toString());
        resultPlayingDTO.setGuessResult(result);
        return resultPlayingDTO;
    }

    private void calculateScore(GuessNumberGame guessNumberGame, String id) {
        //计算增量
        int increment = 0;
        if(guessNumberGame.getStatus().equals(GameStatus.SUCCEED)) {
            int times = calculateWinTimes(id);
            increment += times>3 && times<5 ?(3+2):3;
            increment += times>=5 ?3:0;

        }else if(guessNumberGame.getStatus().equals(GameStatus.FAILED)) {
            increment = -3;
        }

        UserInfo userInfo = userDao.queryUser(id);
        userInfo.setScore(userInfo.getScore() + increment);
    }

    private int calculateWinTimes(String id) {
        Stack<Game> games = gameDao.getAllByUserId(id);
        int times = 0;
        boolean flag = false;
        do {
            Game pop = null;
            try {
                pop = games.pop();
            }catch (EmptyStackException ignored) {
            }
            if(null != pop && pop.isCompleted() && pop.getGuessNumberGame().getStatus().equals(GameStatus.SUCCEED)) {
                times ++;
                flag = true;
            }else {
                flag = false;
            }
        }while(flag);

        return times;
    }

    private Game startGame(String id) {
        GuessNumberGame guessNumberGame = new GuessNumberGame(new RandomAnswerGenerator());
        return gameDao.addOneGameByUserId(id,guessNumberGame);
    }

    public ResultDTO getUserInfo(String id) {
        UserInfo userInfo = userDao.queryUser(id);
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setUserInfo(userInfo);
        return resultDTO;
    }
}
