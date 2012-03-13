class Lect04DemoerVer1 
{
  public static void main(String asdf[])
  {
    World w; //ticket to hold where our World is in memory
    Turtle mt; //to hold where my Turtle is
    w = new World();//go to the World factory and, please, make me a World
    mt = new Turtle(w);//make a new Turtle, like mamma turtle does in her belly
    mt.turnRight();
    mt.turnRight();
    mt.forward();
    
  }
}