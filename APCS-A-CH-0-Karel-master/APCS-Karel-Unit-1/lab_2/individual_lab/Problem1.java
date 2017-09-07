package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        move();
        putBeeper();
        advanceLine();
        advanceLine();
        advanceLine();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        putBeeper();
        advanceLine();
        advanceLine();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        putBeeper();
        advanceLine();
        turnLeft();
        move();
        move();
        putBeeper();
        move();
    }
    
    public void advanceLine() {
        turnRight();
        move();
        turnLeft();
        move();
        putBeeper();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
