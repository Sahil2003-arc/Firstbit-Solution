#include <stdio.h>
void triangle();
void main(){
  triangle();
}

void triangle(){
    int side1, side2, side3;

  printf("Enter the lengths of the three sides of the triangle: ");
  scanf("%d %d %d", &side1, &side2, &side3);

  if (side1 == side2 && side2 == side3) {
    printf("Equilateral triangle\n");
  } else if (side1 == side2 || side1 == side3 || side2 == side3) {
    printf("Isosceles triangle\n");
  } else {
    printf("Scalene triangle\n");
  }
}