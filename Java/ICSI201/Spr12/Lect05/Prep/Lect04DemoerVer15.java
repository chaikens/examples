class Lect04DemoerVer15
{
  public static void main(String asdf[])
  {
    World w; //ticket to hold where our World is in memory
    Turtle mt; //to hold where my Turtle is
    w = new World();//go to the World factory and, please, make me a World
    mt = new Turtle(w);//make a new Turtle, like mamma turtle does in her belly
    mt.setPenWidth(10);
 
      
    //Let try to move the Turtle to start in another place.
    mt.penUp();
    mt.moveTo(25, 50);
    mt.penDown();
    
    //The code to make the Turtle do her dance and draw the trail starts here.   
    double scale;
    scale = 0.50;    
    double defFwdDist = 100.0; //Default Forward Distance, length of line drawn by forward(  )
                               //We know this from code and java-docs in SimpleTurtle.java.
    
    
 
    mt.turn(180);    //tells Turtle to turn all the way around, same effect as turning right twice. 
    mt.forward((int)(scale*defFwdDist));
    mt.turnLeft();     //class voted to make an L by turning left
    mt.forward((int)(scale*defFwdDist));      //we now have two lines of the L
    mt.turnLeft();
    mt.forward((int)(scale*defFwdDist*0.3));    //the toe was too long, so we tried a shorter length
                       //forward() and forward(int pixels) are two "polymorphic"
                       //methods: Different methods with the SAME name but 
                       //different because of signature.
    mt.turnLeft();
    mt.forward((int)(scale*defFwdDist*0.1));    //add a hook to the toe.  The hook was too long,
                         //so we program dividing the original length by 3
    mt.hide();       //makes the Turtle's body become hidden, so the letter looks nicer.
                     //RELEASE!
  }
}