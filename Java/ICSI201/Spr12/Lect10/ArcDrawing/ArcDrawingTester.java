class ArcDrawingTester 
{
  public static void main(String asdf[])
  {
    World w = new World();
    Turtle mt = new Turtle(w);
    mt.setPenWidth(5);
    mt.turn(30.0);
    mt.drawArc(200.0, 50.0);
    
    //mt.penUp();
    //mt.moveTo(w.getWidth()/2, w.getHeight()/2);
    //mt.setHeading(0.0);
    //mt.penDown();
    //mt.drawArc(100.0, 360.0);
      
  }
}

    