class Lect04DemoerVer2 
{
  public static void main(String asdf[])
  {
    World w; //ticket to hold where our World is in memory
    Turtle mt; //to hold where my Turtle is
    w = new World();//go to the World factory and, please, make me a World
    mt = new Turtle(w);//make a new Turtle, like mamma turtle does in her belly
    mt.turn(180.0);    //tells Turtle to turn all the way around, same effect as turning right twice. 
    mt.forward();
    mt.turnLeft();     //class voted to make an L by turning left
    mt.forward();      //we now have two lines of the L
    
  }
}