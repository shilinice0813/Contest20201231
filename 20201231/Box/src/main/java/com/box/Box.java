package com.box;

/**
 * 宝箱类
 * @author : shili
 * @date : 15:24 2020/12/31
 */
public class Box {
    /**
     * 宝箱编号
     */
    private int num;
    /**
     * 宝箱hash
     */
    private String hashNum;
    /**
     * 上一宝箱hash
     */
    private String lastBoxHashNum;
    /**
     * 打开宝箱的神秘数字
     */
    private long mysticalNum;

    public Box(int num, String lastBoxHashNum) {
        this.num = num;
        this.lastBoxHashNum = lastBoxHashNum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public long getMysticalNum() {
        return mysticalNum;
    }

    public void setMysticalNum(long mysticalNum) {
        this.mysticalNum = mysticalNum;
    }

    @Override
    public String toString() {
        return this.num+this.lastBoxHashNum+this.mysticalNum+"";
    }
}
