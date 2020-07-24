package com.zyyh;

public class PayInfo {
    private String dateTime;
    private PayStyle payStyle;
    private long point;
    private long payAmount;

    public PayInfo(String dateTime, PayStyle payStyle, long computePoint, int amount) {
        this.dateTime = dateTime;
        this.payStyle = payStyle;
        this.point = computePoint;
        this.payAmount = amount;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public PayStyle getPayStyle() {
        return payStyle;
    }

    public void setPayStyle(PayStyle payStyle) {
        this.payStyle = payStyle;
    }

    public long getPoint() {
        return point;
    }

    public void setPoint(long point) {
        this.point = point;
    }

    public long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(long payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayStyleInfo(){
        if(this.payStyle.equals(PayStyle.POS)){
            return "POS机消费 ";
        }else if(this.payStyle.equals(PayStyle.WECHAT)){
            return "微信支付消费 ";
        }else if(this.payStyle.equals(PayStyle.CREDITCARD_DIRECT)){
            return "快捷支付消费 ";
        }else {
            return "信用卡分期购物消费 ";
        }
    }
}
