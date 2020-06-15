package com.thoughtworks;

import org.junit.Test;

public class FizzBuzzWhizzTest {
    @Test
    public void test_One() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String noice = fizzBuzzWhizz.check(1);
        assert (noice.equals("1"));
    }

    @Test
    public void test_Three() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String noice = fizzBuzzWhizz.check(3);
        assert (noice.equals("Fizz"));
    }

    @Test
    public void test_Five() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String noice = fizzBuzzWhizz.check(5);
        assert (noice.equals("Buzz"));
    }

    @Test
    public void test_Seven() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String noice = fizzBuzzWhizz.check(7);
        assert (noice.equals("Whizz"));
    }

    @Test
    public void test_TenFive() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String noice = fizzBuzzWhizz.check(15);
        assert (noice.equals("FizzBuzz"));
    }

    @Test
    public void test_TwoOne() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String noice = fizzBuzzWhizz.check(21);
        assert (noice.equals("FizzWhizz"));
    }

    @Test
    public void test_ThreeFive() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String noice = fizzBuzzWhizz.check(35);
        assert (noice.equals("Fizz"));
    }

    @Test
    public void test_OneZeroFive() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String noice = fizzBuzzWhizz.check(105);
        assert (noice.equals("FizzBuzzWhizz"));
    }

    @Test
    public void test_IncludeThree() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String noice = fizzBuzzWhizz.check(70);
        assert (noice.equals("BuzzWhizz"));
    }
    @Test  //53 173
    public void test_FiveThree() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String noice = fizzBuzzWhizz.check(53);
        assert (noice.equals("53"));
    }

}

