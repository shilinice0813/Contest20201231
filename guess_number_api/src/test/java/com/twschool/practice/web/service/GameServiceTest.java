package com.twschool.practice.web.service;

import com.twschool.practice.domain.Answer;
import com.twschool.practice.domain.RandomAnswerGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class GameServiceTest {
    @Test
    public void should_start_game_test_guess_once() throws Exception {
        //given
        RandomAnswerGenerator mock = Mockito.mock(RandomAnswerGenerator.class);
        Answer answer = new Answer(Arrays.asList("1", "2", "3", "4"));
        Mockito.when(mock.generateAnswer()).thenReturn(answer);

        GameService gameService = Mockito.spy(new GameService());
        String userGuess = "1 2 3 4";

        //when
        String guessResult = gameService.guess(userGuess);
        //then
        Assert.assertNotNull(guessResult);

        Mockito.verify(gameService, Mockito.times(1)).startGame();
    }

    @Test
    public void should_start_game_once_only_test_guess_twice() throws Exception {
        //given
        RandomAnswerGenerator mock = Mockito.mock(RandomAnswerGenerator.class);
        Answer answer = new Answer(Arrays.asList("1", "2", "3", "4"));
        Mockito.when(mock.generateAnswer()).thenReturn(answer);

        GameService gameService = Mockito.spy(new GameService());
        String userGuess = "1 2 3 5";
        //when
        String guessResult = gameService.guess(userGuess);
        guessResult = gameService.guess(userGuess);

        //then
        Assert.assertNotNull(guessResult);

        Mockito.verify(gameService, Mockito.times(1)).startGame();
    }
}
