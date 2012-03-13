import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////


  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.forward();
  }
  public void drawL(double scale)
  {
    System.out.println("drawL called");
      
    //double scale = 3.00;  REMOVED because scale now gets its value from the CALLER
    double defTurDis = 100.0;
    
    this.turn(180.0);    //tells Turtle to turn all the way around, same effect as turning right twice.
    //The above line was YELLOWED to tell us it was the cause of a COMPILING ERROR.
    //The problem is that mt is a "ticket" belonging to main, and it is cannot be found from
    //within drawL
    //In the next version of Turtle.java, we will REPLACE this. everywhere by this.
    this.forward((int)(scale*defTurDis));
    this.setPenWidth(6);
    this.turnLeft();     //class voted to make an L by turning left
    this.forward((int)(scale*defTurDis));      //we now have two lines of the L
    this.turnLeft();
    this.forward((int)((1/3.0)*(scale*defTurDis)));    //the toe was too long, so we tried a shorter length
                       //forward() and forward(int pixels) are two "polymorphic"
                       //methods: Different methods with the SAME name but 
                       //different because of signature.
    this.turnLeft();
    this.forward(30/3);    //add a hook to the toe.  The hook was too long,
                         //so we program dividing the original length by 3
  }

} // this } is the end of class Turtle, put all new methods before this