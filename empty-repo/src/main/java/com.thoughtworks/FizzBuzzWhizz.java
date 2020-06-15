package com.thoughtworks;

public class FizzBuzzWhizz {
    public String check(int number) {
        StringBuffer result = new StringBuffer();
        if((number+"").contains("7")){
            if((number+"").contains("5")){
                if (number % 3 ==0) {
                    result.append("Fizz");
                }
            }
        }else if (number % 5 ==0) {
            result.append("Buzz");
        }
        if(!(number+"").contains("5")){
            if((number+"").contains("3")){
                return "Fizz";
            }
            if (number % 3 ==0) {
                result.append("Fizz");
            }
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
