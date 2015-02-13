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

	.file	1 "story.c"
	.text
	.align	2
	.globl	add_100max
	.ent	add_100max
add_100max:
	.frame	$sp,0,$31		# vars= 0, regs= 0/0, args= 0, extra= 0
	.mask	0x00000000,0
	.fmask	0x00000000,0
	addu	$4,$4,$5
	slt	$2,$4,101
	.set	noreorder
	.set	nomacro
	beq	$2,$0,$L1
	li	$3,100			# 0x64
	.set	macro
	.set	reorder

	move	$3,$4
$L1:
	.set	noreorder
	.set	nomacro
	j	$31
	move	$2,$3
	.set	macro
	.set	reorder

	.end	add_100max
	.align	2
	.globl	add_100max_double2nd
	.ent	add_100max_double2nd
add_100max_double2nd:
	.frame	$sp,24,$31		# vars= 0, regs= 2/0, args= 16, extra= 0
	.mask	0x80010000,-4
	.fmask	0x00000000,0
	subu	$sp,$sp,24
	sw	$31,20($sp)
	sw	$16,16($sp)
	.set	noreorder
	.set	nomacro
	jal	add_100max
	move	$16,$5
	.set	macro
	.set	reorder

	move	$4,$2
	.set	noreorder
	.set	nomacro
	jal	add_100max
	move	$5,$16
	.set	macro
	.set	reorder

	lw	$31,20($sp)
	lw	$16,16($sp)
	#nop
	.set	noreorder
	.set	nomacro
	j	$31
	addu	$sp,$sp,24
	.set	macro
	.set	reorder

	.end	add_100max_double2nd
