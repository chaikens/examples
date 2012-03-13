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
  
  /**
   * Draw an arc.  The Turtle's heading and position will determine
   * the tangent direction and the starting point of the arc.
   * 
   * @param R radius.
   * @param AA amount of arc in degrees.
   */
  public void drawArc(double R, double AA)
  {
    double Xstart = this.getXPos();
    double Ystart = this.getYPos();
    double H      = this.getHeading();
    System.out.println("We'll try to draw an arc");
    System.out.println("Radius of " + R);
    System.out.println("Arc Amount of " + AA + " degrees.");
    AA = 2.0*Math.PI*AA/360.0;
    System.out.println("Arc Amount of " + AA + " radians.");
    System.out.println("Xstart is " + Xstart);
    System.out.println("Ystart is " + Ystart);
    System.out.println("Heading is " + H + " degrees.");
    
    //this.forward((int) (R*AA) );
    //Our first try was to draw a straight line the length of the arc.
    int nParts = 4;
    //Our second try was to divide the drawing into a number of parts.
    for( int i = 0; i < nParts ; i=i+1)
    {
      //The body of the loop will run nParts times.
      this.forward((int)
               ((R*AA)/nParts) ) ;
      //Our second try still resulted in a straight line!
      //After seeing this, we realize that the turtle has to
      //turn a little bit after each part.
      //this.turn( (AA/nParts) ); //the arc still looks like a straight line!
      this.turn( (AA/nParts)*(360.0/(2.0*Math.PI)) );
      //Without the radian-to-degree conversion, each turn
      //was much too small, so the arc was practically straight.
    }
    //Experimentation done by sdc is below.
    /*int nParts = 315; //314 OK for circle.
    double eachLength = (R*AA)/nParts;
    double eachAA     = AA/nParts;
    for(int i=0; i<nParts; i=i+1)
    {
      this.forward((int)eachLength);
      this.turn(eachAA*360.0/(2.0*Math.PI));
    }
    */
  }
  


  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.forward();
  }

} // this } is the end of class Turtle, put all new methods before this