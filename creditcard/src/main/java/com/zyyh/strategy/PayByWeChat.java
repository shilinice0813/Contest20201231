package com.zyyh.strategy;

import com.zyyh.PayStyle;

public class PayByWeChat implements PayStrategy{
    public int amount;
    public PayByWeChat(int amount){
        this.amount=amount;
    }

    @Override
    public long computePoint(boolean isVip) {
        long point = amount/20;
        if(isVip){
            point+=(long)Math.floor(point*0.5);
        }
        return point;
    }

    @Override
    public PayStyle getPayStyle() {
        return PayStyle.WECHAT;
    }

    @Override
    public int getAmount() {
        return amount;
    }
}
