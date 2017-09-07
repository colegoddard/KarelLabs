package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        move();
        turnLeft();
        move();
        turnLeft();
        checkWallsAndPutBeeper();
        repositionRobot();
        checkWallsAndPutBeeper();
        turnRight();
        repositionRobot();
        checkWallsAndPutBeeper();
        turnRight();
        repositionRobot();
        checkWallsAndPutBeeper();
        turnLeft();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnLeft();
        checkWallsAndPutBeeper();
        turnRight();
        repositionRobot();
        checkWallsAndPutBeeper();
        repositionRobot();
        checkWallsAndPutBeeper();
        turnRight();
        repositionRobot();
        checkWallsAndPutBeeper();
        turnLeft();
        move();
        turnLeft();
    }

    public void repositionRobot() {
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
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