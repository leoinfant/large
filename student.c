#include<stdio.h>
#include<conio.h>
void main()
{
int b,n1,i,j,c=0;
clrscr();
printf("\n Enter the number of students in the kidsgarden:");
scanf("%d",&b);
n1=2*b;
for(i=0;i<n1;i++)
{
for(j=i+1;j<=n1;j++)
 {
 printf("\n%d\t%d\t\n",i,j);
 c++;
 }  }
 printf("the daily walk combination no pair is same  is %d",c);
 getch();
}
