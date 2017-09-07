package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void writeHELLO() {
        writeH();
        writeE();
        writeL();
        writeL();
        writeO();
    }
    
    public void writeH() {
        verticalLine();
        repositionMiddle();
        horizontalLine();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnRight();
        turnRight();
        move();
        move();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    
    public void writeE() {
        turnLeft();
        move();
        move();
        turnLeft();
        verticalLine();
        turnRight();
        horizontalLine();
        pickBeeper();
        turnRight();
        move();
        move();
        turnRight();
        horizontalLine();
        pickBeeper();
        turnLeft();
        move();
        move();
        turnLeft();
        horizontalLine();
        pickBeeper();
    }
    
    public void writeL() {
        horizontalLine();
        turnRight();
        turnRight();
        move();
        move();
        turnRight();
        pickBeeper();
        verticalLine();
        turnRight();
        move();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        move();
        turnLeft();
    }
    
    public void writeO() {
        
    }
    
    public void repositionMiddle() {
        turnRight();
        turnRight();
        move();
        move();
        turnLeft();
    }
    
    public void horizontalLine() {
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    
    public void verticalLine() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
