#include<stdio.h>
int main()
{
    int a;
    float b;
    scanf("%d",&a);
    scanf("%f",&b);
    if((a+0.5)<=b && a%5==0)
    printf("%.2f\n",b-a-0.5);
    else
    printf("%.2f\n",b);
    return 0;
}