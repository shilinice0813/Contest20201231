package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    @Test
    public void Location_AllRight_Number_AllRight(){
        GuessNumber guessNumber=new GuessNumber();
        guessNumber.answer="1234";
        String inputNumber = "1234";
        if(!guessNumber.checkFormat(inputNumber)){
            return;
        }
        String outPut = guessNumber.check(inputNumber);
        assert(outPut.equals("4A0B"));
    }
    @Test
    public void Location_NoRight_Number_NoRight(){
        GuessNumber guessNumber=new GuessNumber();
        guessNumber.answer="1234";
        String inputNumber = "5678";
        if(!guessNumber.checkFormat(inputNumber)){
            return;
        }
        String outPut = guessNumber.check(inputNumber);
        assert(outPut.equals("0A0B"));
    }
    @Test
    public void Location_PreRight_Number_PreRight() {
        GuessNumber guessNumber = new GuessNumber();
        guessNumber.answer = "1234";
        String inputNumber = "2436";
        if (!guessNumber.checkFormat(inputNumber)) {
            return;
        }
        String outPut = guessNumber.check(inputNumber);
        assert (outPut.equals("1A2B"));
    }

    @Test
    public void Location_NoRight_Number_PreRight() {
        GuessNumber guessNumber = new GuessNumber();
        guessNumber.answer = "1234";
        String inputNumber = "2789";
        if (!guessNumber.checkFormat(inputNumber)) {
            return;
        }
        String outPut = guessNumber.check(inputNumber);
        assert (outPut.equals("0A1B"));
    }
    @Test
    public void Location_PreRight_Number_NoRight() {
        GuessNumber guessNumber = new GuessNumber();
        guessNumber.answer = "1234";
        String inputNumber = "1789";
        if (!guessNumber.checkFormat(inputNumber)) {
            return;
        }
        String outPut = guessNumber.check(inputNumber);
        assert (outPut.equals("1A0B"));
    }
    @Test
    public void Location_NoRight_Number_AllRight() {
        GuessNumber guessNumber = new GuessNumber();
        guessNumber.answer = "1234";
        String inputNumber = "4321";
        if (!guessNumber.checkFormat(inputNumber)) {
            return;
        }
        String outPut = guessNumber.check(inputNumber);
        assert (outPut.equals("0A4B"));
    }
}
