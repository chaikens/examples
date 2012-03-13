class Lect05DemoerV9
{
  public static void main(String asdf[])
  {
    World w; //ticket to hold where our World is in memory
    Turtle mt; //to hold where my Turtle is
    w = new World();//go to the World factory and, please, make me a World
    mt = new Turtle(w);//make a new Turtle, like mamma turtle does in her belly
    
    mt.drawL(3.0);
    //We finished coding the parametrized method call and
    //we finished coding the definition of the called method in Turtle.java
    //We also TESTED that the 2 .java files COMPILE together, and
    //when drawL is called, we know the call worked because we saw the
    //"drawL called" message get printed out.
    
    //In Version 8, we cut the code to actually draw the L OUT
    //of the main method and paste it INTO the drawL method
    //in Turtle.java
    //Compiling again is successful.
    //Running shows the World pop up, the drawL called greeting, and now,
    //nothing drawn on the World, as expected.
    //In Version 9, we just fixed Turtle.java and now a big L is drawn,
    //starting in the middle.  Success!
    mt.penUp( );
    mt.moveTo( 30, 15 );
    mt.penDown( );
  
    mt.hide();       //makes the Turtle's body become hidden, so the letter looks nicer.
                     
  }
}