package com.twschool.practice.web.entity;

import lombok.Data;

@Data
public class ResultPlayingDTO extends DTO {
    private String guessResult;
    private String msg;
    private String gameStatus;
}
