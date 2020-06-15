package com.thoughtworks;

public class FizzBuzzWhizz {
    public String check(int number) {
        char[] chars = (number + "").toCharArray();
        for (Character c : chars) {
            if (c == '3') {
                return "Fizz";
            }
        }
        StringBuffer result = new StringBuffer();
        if (number % 3 ==0) {
            result.append("Fizz");
        }
        if (number % 5 ==0) {
            result.append("Buzz");
        }
        if (number % 7 ==0) {
            result.append("Whizz");
        }
        if(result.length()==0){
            return number+"";
        }
        return result.toString();
    }
}
