package com.twschool.practice;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    @Test
    public void Location_AllRight_Number_AllRight(){
        GuessNumber guessNumber=new GuessNumber();
        guessNumber.answer="1234";
        String inputNumber = "1234";
        guessNumber.check(inputNumber);
    }








}
