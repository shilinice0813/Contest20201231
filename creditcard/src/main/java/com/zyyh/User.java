package com.zyyh;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class User {
    private boolean isVIP;
    private List<PayInfo> payInfoList=new ArrayList<>();
    private String id= UUID.randomUUID().toString();
    private long totalPoint;
    private PayStrategy payStrategy;

    public User(boolean isVIP){
        this.isVIP=isVIP;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    public List<PayInfo> getPayInfoList() {
        return payInfoList;
    }

    public void setPayInfoList(List<PayInfo> payInfoList) {
        this.payInfoList = payInfoList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(long totalPoint) {
        this.totalPoint = totalPoint;
    }

    public PayStrategy getPayStrategy() {
        return payStrategy;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void computePoint(){
        if(payStrategy==null){
            return;
        }
        PayInfo payInfo=new PayInfo(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()),payStrategy.getPayStyle(),
                payStrategy.computePoint(isVIP),payStrategy.getAmount());

        payInfoList.add(payInfo);
        totalPoint+=payInfo.getPoint();
    }

    @Override
    public boolean equals(Object obj) {
        User user=(User)obj;
        return this.id.equals(user.id);
    }
}
