int add_100max( int x, int y)
{
  int temp;
  temp = x + y; //suffers from overflow bug!
  if( temp > 100 )
    {
      return 100;
    }
  else
    {
      return temp;
    }
}

int add_100max_double2nd(int x, int y)
{
  int temp;
  temp = add_100max(x, y);
  temp = add_100max(temp, y);
  return temp;
}

