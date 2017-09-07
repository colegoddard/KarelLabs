package lab_3.individual_lab;

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

    public void carpetRooms(){
        move();
        turnLeft();
        move();
        turnLeft();
        checkWallsAndPutBeeper();
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        checkWallsAndPutBeeper();
        turnRight();
        move();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
        checkWallsAndPutBeeper();
        reposition();
        checkWallsAndPutBeeper();
        turnRight();
        reposition();
        checkWallsAndPutBeeper();
        turnRight();
        move();
        move();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnLeft();
        checkWallsAndPutBeeper();
        turnRight();
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnLeft();
        checkWallsAndPutBeeper();
        turnRight();
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnLeft();
        checkWallsAndPutBeeper();
        turnLeft();
        move();
        turnLeft();
    }
    
    public void reposition() {
        turnRight();
        move();
        move();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void checkWallsAndPutBeeper() {
        if (!frontIsClear()) {
            turnRight();
            if (!frontIsClear()) {
                turnRight();
                if (!frontIsClear()) {
                    putBeeper();
                }
            }
        }
    }
}

