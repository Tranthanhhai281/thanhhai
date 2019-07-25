#include<stdio.h>
int main()
{
	int a ;
	printf( " nhap vao a= ") ;
	scanf("%d", &a) ;
	int b ;
	printf("\n nhap vao b= ") ;
	scanf ("%d" ,&b) ;
	
	if (a>b)
	{
		if(b=0)
		{
			printf("khong the thuc hien duoc phep tinh \n");
		}
		else
		{
			printf ("thuong cua hai so la: %d / %d = %d", a, b, a/b) ;
		}
	}
	else 
	{
		printf (" tich cua hai so la: %d * %d = %d", a, b, a*b) ;
	}
	
	return 0 ;

}
