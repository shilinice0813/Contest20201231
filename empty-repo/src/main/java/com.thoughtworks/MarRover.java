package com.thoughtworks;

import javax.swing.*;

public class MarRover {
    int x;
    int y;
    Direction direction;
    MarRover(int x,int y,Direction direction){
        this.x=x;
        this.y=y;
        this.direction=direction;
    }
    public void wake(){
        switch (this.direction){
            case E:
                x++;
            case W:
                x--;
            case S:
                y--;
            case N:
                y++;
        }
    }
    public void turnDirection(LeftOrRight leftOrRight){
        switch (this.direction){
            case E:
                if(leftOrRight.equals(LeftOrRight.L)){
                    this.direction=Direction.N;
                }else{
                    this.direction=Direction.S;
                }
                break;
            case W:
                if(leftOrRight.equals(LeftOrRight.L)){
                    this.direction=Direction.S;
                }else{
                    this.direction=Direction.N;
                }
                break;
            case S:
                if(leftOrRight.equals(LeftOrRight.L)){
                    this.direction=Direction.E;
                }else{
                    this.direction=Direction.W;
                }
                break;
            case N:
                if(leftOrRight.equals(LeftOrRight.L)){
                    this.direction=Direction.W;
                }else{
                    this.direction=Direction.E;
                }
                break;
        }
    }
    public void move(int step,LeftOrRight leftOrRight){
        for (int i=0;i<step;i++){
            wake();
        }
        turnDirection(leftOrRight);
    }
    public boolean equals(MarRover marRover) {
        return this.x==marRover.x&&this.y==marRover.y&&this.direction==marRover.direction;
    }
}
enum Direction{
    N,
    S,
    W,
    E,
}
enum LeftOrRight{
    L,
    R,
}
