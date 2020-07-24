package com.zyyh;

public class PayByPos implements PayStrategy{
    public int amount;
    public PayByPos(int amount){
        this.amount=amount;
    }

    @Override
    public long computePoint(boolean isVip) {
        long point=amount/10;
        if(isVip){
            point+= (long) Math.floor(point*0.5);
        }
        return point;
    }
    @Override
    public PayStyle getPayStyle(){
        return PayStyle.POS;
    }
    @Override
    public int getAmount() {
        return amount;
    }
}
