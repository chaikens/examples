class Lect05DemoVer1 {

  public static void main(String asdf[])
  {
    System.out.println("Hello from Lect05Demo!");
    World w; //ticket to hold where our World is in memory
    Turtle mt; //to hold where my Turtle is
    w = new World();//go to the World factory and, please, make me a World
    mt = new Turtle(w);//make a new Turtle, like mamma turtle does in her belly
    mt.setPenWidth(10);
 
      
    //Let try to move the Turtle to start in another place.
    mt.penUp();
    mt.moveTo(25, 50);
    mt.penDown();
    
    mt.drawL();
    
    mt.penUp();
    mt.moveTo(500,100);
    mt.penDown();
    
    mt.drawL();
  }

}