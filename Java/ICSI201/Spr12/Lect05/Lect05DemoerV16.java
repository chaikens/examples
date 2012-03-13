class Lect05DemoerV16
{
  public static void main(String asdf[])
  {
    World w; //ticket to hold where our World is in memory
    Turtle mt; //to hold where my Turtle is
    w = new World();//go to the World factory and, please, make me a World
    mt = new Turtle(w);//make a new Turtle, like mamma turtle does in her belly
    
    //We look at the documentation and see there is a setHeading method.
    //Unfortunately, G&E omitted telling you what the heading value means
    //geometrically.  We try 0.0 as an experiment.
    
    //Testing show's we are lucky!  So we follow the plan: Reset the
    //Turtle's heading to 0.0 after drawing each letter.
    
    //In Version 16, we demonstrate how to make the 2nd L bright blue.
    //Testing showed it worked!
 
    
    mt.penUp( );
    mt.moveTo( 30, 15 );
    mt.penDown( );
    
    mt.drawL(0.50);
    
    mt.setHeading(0.0);
    
    mt.penUp( );
    mt.moveTo( 200, 200 );
    mt.penDown( );
    mt.setPenColor(new java.awt.Color( 0, 0, 255 ) );
    mt.drawL(1.0);
  
    mt.hide();       //makes the Turtle's body become hidden, so the letter looks nicer.
                     
  }
}