package com.box;

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
    @Test
    public void Given_Boxes_When_Now_Then_Pass(){

    }
}
