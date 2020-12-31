package com.box;

/**
 * @author : shili
 * @date : 15:24 2020/12/31
 */
public class Box {
    private int num;
    private String time;
    private String hashNum;
    private String lastBoxHashNum;
    private String mysticalNum;

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

    public String getHashNum() {
        return hashNum;
    }

    public void setHashNum(String hashNum) {
        this.hashNum = hashNum;
    }

    public String getLastBoxHashNum() {
        return lastBoxHashNum;
    }

    public void setLastBoxHashNum(String lastBoxHashNum) {
        this.lastBoxHashNum = lastBoxHashNum;
    }

    public String getMysticalNum() {
        return mysticalNum;
    }

    public void setMysticalNum(String mysticalNum) {
        this.mysticalNum = mysticalNum;
    }

    @Override
    public String toString() {
        return this.num+this.time+this.lastBoxHashNum+this.mysticalNum;
    }
}
