package com.zyyh;

import java.util.ArrayList;
import java.util.List;

public class CreditCardSystem {
    public List<User> clients=new ArrayList<>();

    public void addUser(User user){
        clients.add(user);
    }
    public void removeUser(User user){
        clients.remove(user);
    }

    public void printRecord(User user) {
        System.out.println("总分："+user.getTotalPoint());
        for (PayInfo info :user.getPayInfoList() ) {
            System.out.println(info.getDateTime()+" "+info.getPayStyleInfo()+info.getPayAmount()+",积分+"+info.getPoint());
        }
    }
}
