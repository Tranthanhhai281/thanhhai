#include<stdio.h>

int main()
{
	int n ;
	printf(" Nhap vao n=")  ;
	scanf("%d" , &n) ;
	int f0 = 1 ;
	int f1 = 0 ;
	int fn  ;
	for(int i=2; i<=n; i++)
	{
		fn = f0 + f1 ;
		f0 = f1 ;
		f1 = fn ;
	}
	
	printf(" \n So Fibonaci thu %d la: %d", n , fn) ;
	
	return 0 ;
	
}
