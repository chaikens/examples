public class HelloWorldTurtleAct
{
  public static void main(String[] asd)
  {
    System.out.println("Hello");
    World w = new World();
    Turtle tu = new Turtle(w);
    for(int i=20; i>0; i=i-1)
    {
      tu.forward(150);
      tu.turn(122);
      tu.forward(150);
      tu.turn(119);
      tu.forward(150);
      tu.turn(123);
    }
  
  }
}
