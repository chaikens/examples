public class CircleOfGolfClubDrawer
{
  public static 
    void main(
              String[]a 
             )
  {
    Turtle tu = 
      new Turtle 
      ( new World() );
    
    tu.forward( 100 );
    tu.turn(30);
    tu.setPenWidth( 5 );
    tu.forward( 10 );
    tu.forward( -10 );
    tu.setPenWidth( 1 );
    tu.turn( -30 );
    tu.forward( -100 );
    
    tu.turn( 45 );
    
    tu.forward( 100 );
    tu.turn(30);
    tu.setPenWidth( 5 );
    tu.forward( 10 );
    tu.forward( -10 );
    tu.setPenWidth( 1 );
    tu.turn( -30 );
    tu.forward( -100 );
    
    tu.turn( 45 );
  }
  
}
