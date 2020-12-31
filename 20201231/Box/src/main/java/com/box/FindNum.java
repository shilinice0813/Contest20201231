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
        System.out.println(box.toString());
        System.out.println(Sha256Utils.getSHA256StrJava(box.toString()));
        return mysticalNum;
    }

    /**
     * 方法运行主类：求10个宝箱的神秘数字
     * @param args
     */
    public static void main(String[] args) {
        //初始化10个宝箱
        Box[] boxes=new Boxes().getBoxes();
        //初始化神秘数字
        long mysticalNum=0;
        //循环求解10个宝箱的神秘数字，打开宝箱
        for (int i=0;i<boxes.length;i++){
            //求当前宝箱的神秘数字
            mysticalNum=findMysticalNum(boxes[i]);
            //计算出当前宝箱的hash值并赋值
            boxes[i].setHashNum(Sha256Utils.getSHA256StrJava(boxes[i].toString()));
            //给下一宝箱的"上一宝箱hash值"属性赋值，注意第10个宝箱不需要
            if(i<9){
                boxes[i+1].setLastBoxHashNum(boxes[i].getHashNum());
            }
            System.out.println((i+1)+"号宝箱："+boxes[i].getMysticalNum()+"   "+boxes[i].getHashNum());
        }
    }
}
