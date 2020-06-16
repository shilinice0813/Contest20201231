package com.twschool.practice;

import java.util.*;

public class GuessNumber {
    public String answer;
    public void getAnswer(){
        String number = "";
        Random rd = new Random();
        while (number.length() != 4) {
            String rn = rd.nextInt(10) + "";
            if (number.length()==1){
                if ("0".equals(rn)){
                    continue;
                }
            }
            if (number.indexOf(rn) == -1){
                number += rn;
            }
        }
        this.answer=number;
    }

    public boolean checkFormat(String number) {
        //判断长度
        if(number.length()!=4){
            System.out.println("Wrong Input，Input again");
            return false;
        }
        //判断重复
        List<Character> list=new ArrayList<>();
        for (Character c : number.toCharArray()) {
            if(!list.contains(c)){
                list.add(c);
            }else{
                System.out.println("Wrong Input，Input again");
                return false;
            }
        }
        //判断是否是数字
        if(number.matches("-?[0-9]+.？[0-9]*")){
            System.out.println("Wrong Input，Input again");
            return false;
        }
        return  true;
    }

    public String check(String number) {
        int countA=0;
        int countB=0;
        //比较位置和数字是否相同
        for (int i=0;i<number.length();i++){
            if(this.answer.charAt(i)==number.charAt(i)){
                countA++;
            }
            if(this.answer.contains(number.charAt(i)+"")&&this.answer.charAt(i)!=number.charAt(i)){
                countB++;
            }
        }
        if(countA==4){
            System.out.println("Right");
        }
        String outPut=countA+"A"+ countB +"B";
        System.out.println(outPut);
        return outPut;
    }

}
