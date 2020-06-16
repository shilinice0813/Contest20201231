package com.thoughtworks;

import org.junit.Test;

public class MarRoverTest {
    @Test
    public void move_N(){
        MarRover marRover=new MarRover(0,0,Direction.W);
        marRover.move(5,LeftOrRight.R);
        assert (marRover.equals(new MarRover(-5,0,Direction.N)));
    }
    @Test
    public void move_E(){

    }
    @Test
    public void move_S(){

    }
    @Test
    public void move_W(){

    }
    @Test
    public void move_N_L(){

    }
    @Test
    public void move_N_R(){

    }
    @Test
    public void move_E_L(){

    }
    @Test
    public void move_E_R(){

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
