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
    t1.drawL();
  }
  
  public void drawL( )
  {
    System.out.println("Turtle's drawL method was called.");
      //The code to make the Turtle do her dance and draw the trail starts here.   
    double scale;
    scale = 0.50;    
    double defFwdDist = 100.0; //Default Forward Distance, length of line drawn by forward(  )
                               //We know this from code and java-docs in SimpleTurtle.java.
    
    
 
    this.turn(180);    //tells Turtle to turn all the way around, same effect as turning right twice. 
    this.forward((int)(scale*defFwdDist));
    this.turnLeft();     //class voted to make an L by turning left
    this.forward((int)(scale*defFwdDist));      //we now have two lines of the L
    this.turnLeft();
    this.forward((int)(scale*defFwdDist*0.3));    //the toe was too long, so we tried a shorter length
                       //forward() and forward(int pixels) are two "polymorphic"
                       //methods: Different methods with the SAME name but 
                       //different because of signature.
    this.turnLeft();
    this.forward((int)(scale*defFwdDist*0.1));    //add a hook to the toe.  The hook was too long,
                         //so we program dividing the original length by 3
    this.hide();       //makes the Turtle's body become hidden, so the letter looks nicer.
                     //RELEASE!
  }
  

} // this } is the end of class Turtle, put all new methods before this