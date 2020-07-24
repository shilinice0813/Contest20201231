package com.zyyh.strategy;

import com.zyyh.PayStyle;

public interface PayStrategy {
    long computePoint(boolean isVip);
    PayStyle getPayStyle();
    int getAmount();
}
