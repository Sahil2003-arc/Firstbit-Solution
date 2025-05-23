#include <stdio.h>
void main() {
  int totalMinutes=72;
  int hrs,min;
  
  hrs=totalMinutes / 60;         
  min=totalMinutes % 60;       
  printf("%d minutes is equal to %d hours and %d minutes.\n",totalMinutes,hrs,min);

}