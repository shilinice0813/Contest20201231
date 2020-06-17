package com.twschool.practice.web.dao.entity;

import com.twschool.practice.domain.GuessNumberGame;
import lombok.Data;

@Data
public class Game {
    private GuessNumberGame guessNumberGame;
    private boolean completed;
}
