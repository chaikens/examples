/************   story.h  **********************/
#ifndef __story_h_included
#define __story_h_included
int add_100max_double2nd(int x, int y);
int add_100max( int x, int y);
#endif
/**********************************************/

/************   story.c  **********************/
#include "story.h"
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
/**********************************************/

/************   main.h  **********************/
#include <stdio.h>
#include "story.h"

int main(int argc, char *argv[])
{
  int in1, in2;
  int out;
  printf("Input 2 ints:");
  scanf("%d %d", &in1, &in2);
  out = add_100max_double2nd(in1, in2);
  printf("Result=%d\n", out);
  return  0;
}
/**********************************************/
