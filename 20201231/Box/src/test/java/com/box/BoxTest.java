package com.box;

import org.junit.Assert;
import org.junit.Test;

/**
 * 需求分析：
 * 1-10号宝箱需要逐个开启，只有开启第一个宝箱之后，才能同时找到神秘数字和该宝箱的hash值，
 * 该hash值作为下一个宝箱开启的必要输入之一才能继续开启宝箱。
 * 因此测试用例的主要点如下：
 * 1. 每一个宝箱编号、上一个宝箱的hash和神秘数字生成的hash值是否前5位数字都为0
 * 2. 找到的神秘数字是否为正整数
 * @author : shili
 * @date : 15:05 2020/12/31
 */
public class BoxTest {
    Box[] boxes=new Boxes().getBoxes();
    @Test
    public void Given_Box1_When_Now_Then_GetMysticalNum(){
        //获取神秘数字
        long mysticalNum = FindNum.findMysticalNum(boxes[0]);
        //将神秘数字赋值给宝箱
        boxes[0].setMysticalNum(mysticalNum);
        //根据得到的神秘数字计算hash
        String hash = Sha256Utils.getSHA256StrJava(boxes[0].toString());
        //把得到的hash赋值给下一宝箱
        boxes[1].setLastBoxHashNum(hash);
        //判断是否以“00000”开头
        Assert.assertEquals(FindNum.currentBeginNum,hash.substring(0,FindNum.currentBeginNum.length()));
    }
    @Test
    public void Given_Box2_When_Now_Then_GetMysticalNum(){
        Given_Box1_When_Now_Then_GetMysticalNum();
        //获取神秘数字
        long mysticalNum = FindNum.findMysticalNum(boxes[1]);
        //将神秘数字赋值给宝箱
        boxes[1].setMysticalNum(mysticalNum);
        //根据得到的神秘数字计算hash
        String hash = Sha256Utils.getSHA256StrJava(boxes[1].toString());
        //把得到的hash赋值给下一宝箱
        boxes[2].setLastBoxHashNum(hash);
        //判断是否以“00000”开头
        Assert.assertEquals(FindNum.currentBeginNum,hash.substring(0,FindNum.currentBeginNum.length()));
    }
    @Test
    public void Given_Box3_When_Now_Then_GetMysticalNum(){
        Given_Box2_When_Now_Then_GetMysticalNum();
        //获取神秘数字
        long mysticalNum = FindNum.findMysticalNum(boxes[2]);
        //将神秘数字赋值给宝箱
        boxes[2].setMysticalNum(mysticalNum);
        //根据得到的神秘数字计算hash
        String hash = Sha256Utils.getSHA256StrJava(boxes[2].toString());
        //把得到的hash赋值给下一宝箱
        boxes[3].setLastBoxHashNum(hash);
        //判断是否以“00000”开头
        Assert.assertEquals(FindNum.currentBeginNum,hash.substring(0,FindNum.currentBeginNum.length()));
    }
    @Test
    public void Given_Box4_When_Now_Then_GetMysticalNum(){
        Given_Box3_When_Now_Then_GetMysticalNum();
        //获取神秘数字
        long mysticalNum = FindNum.findMysticalNum(boxes[3]);
        //将神秘数字赋值给宝箱
        boxes[3].setMysticalNum(mysticalNum);
        //根据得到的神秘数字计算hash
        String hash = Sha256Utils.getSHA256StrJava(boxes[3].toString());
        //把得到的hash赋值给下一宝箱
        boxes[4].setLastBoxHashNum(hash);
        //判断是否以“00000”开头
        Assert.assertEquals(FindNum.currentBeginNum,hash.substring(0,FindNum.currentBeginNum.length()));
    }
    @Test
    public void Given_Box5_When_Now_Then_GetMysticalNum(){
        Given_Box4_When_Now_Then_GetMysticalNum();
        //获取神秘数字
        long mysticalNum = FindNum.findMysticalNum(boxes[4]);
        //将神秘数字赋值给宝箱
        boxes[4].setMysticalNum(mysticalNum);
        //根据得到的神秘数字计算hash
        String hash = Sha256Utils.getSHA256StrJava(boxes[4].toString());
        //把得到的hash赋值给下一宝箱
        boxes[5].setLastBoxHashNum(hash);
        //判断是否以“00000”开头
        Assert.assertEquals(FindNum.currentBeginNum,hash.substring(0,FindNum.currentBeginNum.length()));
    }
    @Test
    public void Given_Box6_When_Now_Then_GetMysticalNum(){

    }
    @Test
    public void Given_Box7_When_Now_Then_GetMysticalNum(){

    }
    @Test
    public void Given_Box8_When_Now_Then_GetMysticalNum(){

    }
    @Test
    public void Given_Box9_When_Now_Then_GetMysticalNum(){

    }
    @Test
    public void Given_Box10_When_Now_Then_GetMysticalNum(){

    }
}
