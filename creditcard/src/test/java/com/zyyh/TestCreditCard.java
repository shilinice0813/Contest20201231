package com.zyyh;

import org.junit.Assert;
import org.junit.Test;


public class TestCreditCard {
    @Test
    public void test_common_user_pos(){
        //新建用户，非VIP
        User user=new User(false);
        //初始化信用卡系统
        CreditCardSystem system=new CreditCardSystem();
        //用户在系统注册
        system.addUser(user);
        //用户使用pos消费1000
        user.setPayStrategy(new PayByPos(1000));
        //计算积分
        user.computePoint();
        Assert.assertEquals(100,user.getTotalPoint());
    }
}
