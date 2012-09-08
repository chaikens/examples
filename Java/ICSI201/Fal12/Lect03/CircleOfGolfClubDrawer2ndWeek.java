public class CircleOfGolfClubDrawer2ndWeek
{
  public static 
    void main(
              String[]a 
             )
  {
    Turtle tu = 
      new Turtle 
      ( new World() );
    
    //for( int numClubsLeft = 7;
      //  numClubsLeft > 0;
      //  numClubsLeft = numClubsLeft - 1 )  /*head of a for loop*/
    int numClubsLeft; //Makes a variable.
    numClubsLeft = 7;
    while( numClubsLeft
            > 0)
    {
      tu.forward( 100 );
      tu.turn(30);
      tu.setPenWidth( numClubsLeft );
      tu.forward( 10 );
      tu.forward( -10 );
      tu.setPenWidth( 1 );
      tu.turn( -30 );
      tu.forward( -100 );
    
      tu.turn( 45 );
      
      numClubsLeft =
        numClubsLeft-1;
    }

  }
  
}
