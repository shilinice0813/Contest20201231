package com.twschool.practice.web.service;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.domain.RandomAnswerGenerator;

import java.util.Arrays;
import java.util.List;

public class GameService {

    private GuessNumberGame guessNumberGame;

    public GameService() {
    }

    public String guess(String userAnswerString) {
        if(guessNumberGame == null){
            startGame();
        }
        List<String> userAnswer = Arrays.asList(userAnswerString.split(" "));
        return guessNumberGame.guess(userAnswer);
    }


    public void startGame() {
        guessNumberGame = new GuessNumberGame(new RandomAnswerGenerator());
    }
}
