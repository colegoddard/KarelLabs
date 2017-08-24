package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void rearrangeBeepers() {
        topPosition();
        pickUp();
        leftPosition();
        putDown();
        finalPosition();
    }
    public void topPosition() {
        turnLeft();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
    }
    public void pickUp() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    public void leftPosition() {
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
    }
    public void putDown() {
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
    public void finalPosition() {
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        turnRight();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}