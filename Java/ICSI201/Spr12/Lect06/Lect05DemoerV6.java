class Lect05DemoerV6
{
  public static void main(String asdf[])
  {
    World w; //ticket to hold where our World is in memory
    Turtle mt; //to hold where my Turtle is
    w = new World();//go to the World factory and, please, make me a World
    mt = new Turtle(w);//make a new Turtle, like mamma turtle does in her belly
    
    mt.drawL(3.0);
    mt.penUp( );
    mt.moveTo( 30, 15 );
    mt.penDown( );
    
    double scale = 3.00;
    double defTurDis = 100.0;
    
    mt.turn(180.0);    //tells Turtle to turn all the way around, same effect as turning right twice. 
    mt.forward((int)(scale*defTurDis));
    mt.setPenWidth(6);
    mt.turnLeft();     //class voted to make an L by turning left
    mt.forward((int)(scale*defTurDis));      //we now have two lines of the L
    mt.turnLeft();
    mt.forward((int)((1/3.0)*(scale*defTurDis)));    //the toe was too long, so we tried a shorter length
                       //forward() and forward(int pixels) are two "polymorphic"
                       //methods: Different methods with the SAME name but 
                       //different because of signature.
    mt.turnLeft();
    mt.forward(30/3);    //add a hook to the toe.  The hook was too long,
                         //so we program dividing the original length by 3
    mt.hide();       //makes the Turtle's body become hidden, so the letter looks nicer.
                     //DONE! RELEASE IT! 1/31/2012
  }
}