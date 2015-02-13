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
