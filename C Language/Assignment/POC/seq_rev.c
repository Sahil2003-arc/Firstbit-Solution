#include <stdio.h>
void func(int);
void main()
{
  int n = 1;
  func(n);
}
void func(int n)
{
  printf("%d\n", n);
  if (n == 10)
    return;
  func(n + 1);
  printf("%d\n", n);
}