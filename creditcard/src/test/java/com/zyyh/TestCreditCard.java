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

    @Test
    public void test_common_user_wechat(){
        //新建用户，非VIP
        User user=new User(false);
        //初始化信用卡系统
        CreditCardSystem system=new CreditCardSystem();
        //用户在系统注册
        system.addUser(user);
        //用户使用微信消费1000
        user.setPayStrategy(new PayByWeChat(1000));
        //计算积分
        user.computePoint();
        Assert.assertEquals(50,user.getTotalPoint());
    }
    @Test
    public void test_common_user_creditcard_direct_in_100(){
        //新建用户，非VIP
        User user=new User(false);
        //初始化信用卡系统
        CreditCardSystem system=new CreditCardSystem();
        //用户在系统注册
        system.addUser(user);
        //用户使用pos消费1000
        user.setPayStrategy(new PayByCreditCardDirect(1000));
        //计算积分
        user.computePoint();
        Assert.assertEquals(150,user.getTotalPoint());
    }
    @Test
    public void test_common_user_creditcard_direct_out_100(){
        //新建用户，非VIP
        User user=new User(false);
        //初始化信用卡系统
        CreditCardSystem system=new CreditCardSystem();
        //用户在系统注册
        system.addUser(user);
        //用户使用pos消费1000
        user.setPayStrategy(new PayByCreditCardDirect(3000));
        //计算积分
        user.computePoint();
        Assert.assertEquals(400,user.getTotalPoint());
    }
    @Test
    public void test_common_user_creditcard_by_stages_in_5000(){
        //新建用户，非VIP
        User user=new User(false);
        //初始化信用卡系统
        CreditCardSystem system=new CreditCardSystem();
        //用户在系统注册
        system.addUser(user);
        //用户使用pos消费1000
        user.setPayStrategy(new PayByCreditCardBySatges(3000));
        //计算积分
        user.computePoint();
        Assert.assertEquals(300,user.getTotalPoint());
    }
}
