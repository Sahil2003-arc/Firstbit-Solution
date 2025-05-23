#include <stdio.h>
#include <math.h>
void main()
{
  float radius, area;

  printf("Enter the radius of a circle:");

  scanf("%f", &radius);

  area = 3.14*radius*radius;

  printf("Area of the circle = %.2f\n", area);  // printing upto two decimal places


}