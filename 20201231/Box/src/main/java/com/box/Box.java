package com.box;

/**
 * @author : shili
 * @date : 15:24 2020/12/31
 */
public class Box {
    private int num;
    private String time;
    private long hashNum;
    private long lastBoxHashNum;
    private long mysticalNum;

    public Box(int num, long lastBoxHashNum) {
        this.num = num;
        this.lastBoxHashNum = lastBoxHashNum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getHashNum() {
        return hashNum;
    }

    public void setHashNum(long hashNum) {
        this.hashNum = hashNum;
    }

    public long getLastBoxHashNum() {
        return lastBoxHashNum;
    }

    public void setLastBoxHashNum(long lastBoxHashNum) {
        this.lastBoxHashNum = lastBoxHashNum;
    }

    public long getMysticalNum() {
        return mysticalNum;
    }

    public void setMysticalNum(long mysticalNum) {
        this.mysticalNum = mysticalNum;
    }

    @Override
    public String toString() {
        return this.num+this.time+this.lastBoxHashNum+this.mysticalNum;
    }
}
