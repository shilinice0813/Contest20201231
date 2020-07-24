package com.zyyh;

public class PayByCreditCardDirect implements PayStrategy{
    public int amount = 0;
    public PayByCreditCardDirect(int amount){
        this.amount=amount;
    }

    @Override
    public long computePoint(boolean isVip) {
        long point=amount/10;
        if(isVip){
            point+=(long)Math.floor(point*0.5);
        }
        int extraPoint=amount/100*5;
        extraPoint = extraPoint>=100?100:extraPoint;
        return point+extraPoint;
    }

    @Override
    public PayStyle getPayStyle() {
        return PayStyle.CREDITCARD_DIRECT;
    }
    @Override
    public int getAmount() {
        return amount;
    }
}
