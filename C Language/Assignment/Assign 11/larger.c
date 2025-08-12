#include<stdio.h>
#include<string.h>
int main()
{
    char str1[10];
    char str2[20];   
    int i,len1=0,len2=0;
   
   printf("enter first string:");
   fgets(str1, sizeof(str1),stdin);
  
   printf("enter second string:");
   fgets(str2, sizeof(str2),stdin);

   for(i=0;str1[i]!='\0';i++)
   {
      if(str1[i]=='\n')break;
        len1++;  
   }
   for(i=0;str2[i]!='\0';i++)
   {
      if(str2[i]=='\n')break;
        len2++;  
   }

   if(len1>len2)
    printf("larger string first  %s",str1);
   else if(len2>len1)
    printf("larger string first %s",str2);
  else
  printf("both strings are equal"); 
  return 0;
}