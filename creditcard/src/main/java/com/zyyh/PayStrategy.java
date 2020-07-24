package com.zyyh;

public interface PayStrategy {
    long computePoint(boolean isVip);
    PayStyle getPayStyle();
    int getAmount();
}
