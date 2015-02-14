import java.util.Date;
class Stopwatch
{
  private long timeStarted; //Units are milliseconds.
  public void reset()
  {
    timeStarted = new Date().getTime();
  }
  public Stopwatch()
  {
    reset();
  }
  public long elapsed()
  {
    return new Date().getTime() - timeStarted;
  }
  public void print()
  {
    System.out.println("Elapsed Time: " + elapsed()/1000.0
                        + " seconds.");
  }
}
