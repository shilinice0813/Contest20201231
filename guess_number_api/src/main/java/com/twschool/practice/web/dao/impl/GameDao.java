package com.twschool.practice.web.dao.impl;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.web.dao.entity.Game;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class GameDao {
    private Map<String, Stack<Game>> usersGames = new ConcurrentHashMap<>();

    public Game addOneGameByUserId(String userId, GuessNumberGame guessNumberGame) {
        Game userGame = new Game();
        userGame.setGuessNumberGame(guessNumberGame);
        userGame.setCompleted(false);
        Stack<Game> games = usersGames.computeIfAbsent(userId, k -> new Stack<>());
        games.push(userGame);
        return userGame;
    }

    public void completeGame(String userId) throws Exception {
        Stack<Game> games = usersGames.get(userId);
        if(games == null)
            throw new Exception("操作异常");
        Game game = games.peek();
        game.setCompleted(true);
    }

    public Game getPlayingGame(String userId) {
        Stack<Game> games = usersGames.get(userId);
        if(null == games)
            return null;
        Game peek = games.peek();
        if(!peek.isCompleted())
            return peek;
        return null;
    }

    public Stack<Game> getAllByUserId(String userId) {
        return (Stack<Game>) usersGames.get(userId).clone();
    }



    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        strings.push("1");
        strings.push("2");
        strings.push("3");
        strings.push("4");


        Stack<String> clone = (Stack<String>)strings.clone();
        System.out.println(clone.peek());
    }

}
