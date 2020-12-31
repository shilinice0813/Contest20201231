package com.box;

/**
 * 寻找神秘数字的类
 * @author : shili
 * @date : 15:27 2020/12/31
 */
public class FindNum {
    /**
     * 正确hash的数字头
     */
    public static final String currentBeginNum="00000";

    /**
     * 寻找神秘数字
     * @param box 宝箱
     * @return 神秘数字
     */
    public static long findMysticalNum(Box box){
        //0不是正整数
        long mysticalNum=1;
        box.setMysticalNum(mysticalNum);
        while(!currentBeginNum.equals(Sha256Utils.getSHA256StrJava(box.toString()).substring(0,currentBeginNum.length()))){

            box.setMysticalNum(++mysticalNum);
        }
        System.out.println(mysticalNum);
        return mysticalNum;
    }

}
