class Lect05DemoerV13
{
  public static void main(String asdf[])
  {
    World w; //ticket to hold where our World is in memory
    Turtle mt; //to hold where my Turtle is
    w = new World();//go to the World factory and, please, make me a World
    mt = new Turtle(w);//make a new Turtle, like mamma turtle does in her belly
    
    //In Version 10, we first removed the comments: They were ONLY written
    //so students can learn the thoughts behind the software development work.
    //Then, we put the drawL method call in the code sequence so the L is
    //drawn AFTER the turtle is moved, pen up, to the upper left corner.
    
    //The drawL call parameter 3.0 was replaced by 0.5, and we see the
    //L is 1/6 it's previous size.
 
    
    mt.penUp( );
    mt.moveTo( 30, 15 );
    mt.penDown( );
    
    mt.drawL(0.50);
  
    mt.hide();       //makes the Turtle's body become hidden, so the letter looks nicer.
                     
  }
}