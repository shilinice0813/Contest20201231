package com.box;

/**
 * 宝箱类集合
 * @author : shili
 * @date : 15:25 2020/12/31
 */
public class Boxes {
    private Box[] boxes=new Box[10];

    /**
     * 初始化10个箱子，1号宝箱上一hash为0，其他宝箱也默人为0，
     */
    public Boxes() {
        boxes[0]=new Box(1,"0");
        boxes[1]=new Box(2,"0");
        boxes[2]=new Box(3,"0");
        boxes[3]=new Box(4,"0");
        boxes[4]=new Box(5,"0");
        boxes[5]=new Box(6,"0");
        boxes[6]=new Box(7,"0");
        boxes[7]=new Box(8,"0");
        boxes[8]=new Box(9,"0");
        boxes[9]=new Box(10,"0");
        this.boxes = boxes;
    }

    public Box[] getBoxes() {
        return boxes;
    }

    public void setBoxes(Box[] boxes) {
        this.boxes = boxes;
    }
}
