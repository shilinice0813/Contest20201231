package com.thoughtworks;

import org.junit.Test;

public class MarRoverTest {
    @Test
    public void move_N(){
        MarRover marRover=new MarRover(0,0,Direction.N);
        marRover.move("M");
        assert (marRover.equals(new MarRover(0,1,Direction.N)));
    }
    @Test
    public void move_E(){
        MarRover marRover=new MarRover(0,0,Direction.E);
        marRover.move("M");
        assert (marRover.equals(new MarRover(1,0,Direction.E)));
    }
    @Test
    public void move_S(){
        MarRover marRover=new MarRover(0,0,Direction.S);
        marRover.move("M");
        assert (marRover.equals(new MarRover(0,-1,Direction.S)));
    }
    @Test
    public void move_W(){
        MarRover marRover=new MarRover(0,0,Direction.W);
        marRover.move("M");
        assert (marRover.equals(new MarRover(-1,0,Direction.W)));
    }
    @Test
    public void move_N_L(){
        MarRover marRover=new MarRover(0,0,Direction.N);
        marRover.move("L");
        assert (marRover.equals(new MarRover(0,0,Direction.W)));
    }
    @Test
    public void move_N_R(){
        MarRover marRover=new MarRover(0,0,Direction.N);
        marRover.move("R");
        assert (marRover.equals(new MarRover(0,0,Direction.E)));
    }
    @Test
    public void move_E_L(){
        MarRover marRover=new MarRover(0,0,Direction.E);
        marRover.move("L");
        assert (marRover.equals(new MarRover(0,0,Direction.N)));
    }
    @Test
    public void move_E_R(){
        MarRover marRover=new MarRover(0,0,Direction.E);
        marRover.move("R");
        assert (marRover.equals(new MarRover(0,0,Direction.S)));
    }
    @Test
    public void move_S_L(){

    }
    @Test
    public void move_S_R(){

    }
    @Test
    public void move_W_L(){

    }
    @Test
    public void move_W_R(){

    }
}
