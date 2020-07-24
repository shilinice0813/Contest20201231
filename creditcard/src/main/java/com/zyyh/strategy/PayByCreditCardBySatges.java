package com.zyyh.strategy;

import com.zyyh.PayStyle;

public class PayByCreditCardBySatges implements PayStrategy{
    public int amount = 0;
    public PayByCreditCardBySatges(int amount){
        this.amount=amount;
    }
    @Override
    public long computePoint(boolean isVip) {
        long point=amount/10;
        if(isVip){
            point+=(long)Math.floor(point*0.5);
        }
        long extraPoint=amount>5000?100:0;
        return point+extraPoint;
    }

    @Override
    public PayStyle getPayStyle() {
        return PayStyle.CREDITCARD_BY_STAGES;
    }

    @Override
    public int getAmount() {
        return amount;
    }
}
