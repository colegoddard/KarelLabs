package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        bottomLoop();
        reposition();
        topLoop();
        finalPosition();
    }
    public void bottomLoop() {
        turnLeft();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
    }
    public void reposition() {
        move();
        turnRight();
        move();
        move();
    }
    public void topLoop() {
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
    }
    public void finalPosition() {
        move();
        move();
        turnRight();
        move();
        turnRight();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}