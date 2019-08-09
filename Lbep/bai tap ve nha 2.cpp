#include<stdio.h>

int main()
{
	int a,b,c ;
	printf (" nhap vao a= ") ;
	scanf ("%d", &a) ;
	printf ("\n nhap vao b=") ;
	scanf (" %d" , &b) ;
	printf("\n nhap vao c=") ;
	scanf(" %d" , &c) ;
	
	if(a>b)
	{
		if (a>c)
		{
			if (b>c)
			{
				printf ( " %d la so lon nhat, %d la so nho nhat", a, c) ;
			}
			else
			{
				printf ( " %d la so lon nhat , %d la so nho nhat", a, b) ;
			}
		}
		else
		{
			printf (" %d la so lon nhat, %d la so nho nhat", c, b) ;
		}
	}
	else
	{
		if(a>c)
		{
	     	printf (" %d la so lon nhat , %d la so nho nhat" , b, c) ;
		}
		else
		{
			if(b>c)
			{
				printf (" %d la so lon nhat, %d la so nho nhat", b, a) ;
			}
			else
			{
				printf (" %d la so lon nhat, %d la so nho nhat", c, a ) ;
			}
		}
	}
	
	return 0 ;
	
	
	}

