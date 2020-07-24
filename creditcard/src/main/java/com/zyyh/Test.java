package com.zyyh;

public class Test {
    public static void main(String[] args) {
        //创建四位用户
        User user1=new User(true);
        User user2=new User(false);
        //初始化信用卡系统
        CreditCardSystem system=new CreditCardSystem();
        //用户在系统注册
        system.addUser(user1);
        system.addUser(user2);
        //下面是用户一开始购物了...
        //pos购物1000
        user1.setPayStrategy(new PayByPos(1000));
        //计算积分
        user1.computePoint();
        //微信支付购物
        user1.setPayStrategy(new PayByWeChat(223));
        user1.computePoint();
        //信用卡支付
        user1.setPayStrategy(new PayByCreditCardDirect(2312));
        user1.computePoint();
        //信用卡分期
        user1.setPayStrategy(new PayByCreditCardBySatges(5432));
        user1.computePoint();
        //下面是用户二开始购物了...
        //pos购物1000
        //pos购物1000
        user2.setPayStrategy(new PayByPos(1000));
        //计算积分
        user2.computePoint();
        //微信支付购物
        user2.setPayStrategy(new PayByWeChat(223));
        user2.computePoint();
        //信用卡支付
        user2.setPayStrategy(new PayByCreditCardDirect(2312));
        user2.computePoint();
        //信用卡分期
        user2.setPayStrategy(new PayByCreditCardBySatges(5432));
        user2.computePoint();

        system.printRecord(user1);
        system.printRecord(user2);
    }

}
