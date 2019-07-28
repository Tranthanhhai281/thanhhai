#include<stdio.h>
#include <math.h>

int main()
{
	float a, b, c, d, x1, x2 ;
	printf(" nhap vao a= ") ;
	scanf ("%f" , &a) ;
	printf(" \n nhap vao b= ") ;
	scanf("%f" , &b) ;
	printf(" \n nhap vao c= ") ;
	scanf("%f" , &c) ;
	if(a==0) 
	{
		if (b==0)
		{
			if (c==0) printf(" \n Phuong trinh vo so nghiem")  ;
			else printf(" \n Phuong trinh vo nghiem")  ;
		}
		else
		{
			x1=-b/c;
			printf(" \n Phuong trinh co 1 nghiem: %f", x1)   ;
		}
	}
	else
	{
		d = b*b-4*a*c ;
		if (d<0) printf(" \n Phuong trinh vo nghiem")   ;
		if (d==0)
		{
			x1=-b/(2*a);
			printf(" \n Phuong trinh da nghiem kep:%f",x1)   ;
		}
		if (d>0)
		{
			x1=(-b+sqrt(d))/(2*a);
			x2=(-b-sqrt(d))/(2*a);
			printf(" \n Phuong trinh co 2 nghiem phan biet:")   ;
			printf(" \n %f", x1);
			printf(" \n %f", x2);
		}
	}
	return 0 ;
	
}
