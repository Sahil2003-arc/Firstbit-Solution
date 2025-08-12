#include <stdio.h>

void main() {
  int a,b,c;

  printf("Enter three sides of triangle: ");
  scanf("%d %d %d", &a, &b, &c);

  if (a == b && b == c) {
    printf("It is Equilateral triangle");
  } 
  else if (a == b || b == c || a == c)
  {
    printf("It is Isosceles triangle");
  } 
  else 
  {
    printf("It is Scalene triangle");
  }
}