class Lect05DemoerV14
{
  public static void main(String asdf[])
  {
    World w; //ticket to hold where our World is in memory
    Turtle mt; //to hold where my Turtle is
    w = new World();//go to the World factory and, please, make me a World
    mt = new Turtle(w);//make a new Turtle, like mamma turtle does in her belly
    
    //In version 14, we try to move the Turtle to the middle and make it
    //draw a second L.  The second L we expect to be a bit bigger, twice the
    //size of the first.
    
    //Testing shows yes, two figures, but one is WRONG..it is rotated
    //counter clockwise so it's on its back!!  Also, the nice variation
    //of line thickness is gone.
 
    
    mt.penUp( );
    mt.moveTo( 30, 15 );
    mt.penDown( );
    
    mt.drawL(0.50);
    
    mt.penUp( );
    mt.moveTo( 200, 200 );
    mt.penDown( );
    
    mt.drawL(1.0);
  
    mt.hide();       //makes the Turtle's body become hidden, so the letter looks nicer.
                     
  }
}