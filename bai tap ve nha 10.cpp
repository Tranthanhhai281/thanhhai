#include<stdio.h>

bool find(int a[] , int n , int value)
{
	for(int i=0 ; i < n ; i++)
	{
		if(a[i] == value)
		{
			return true;
		}
	}
	return false;
}



int main()
{
	int n;
	printf("Nhap vao n=");
	scanf("%d" , &n) ;
	
	int a[n] ;
	
	for(int i=0; i < n; i++)
	{
		printf("\n nhap cac phan tu:") ;
		scanf("%d", &a[i]) ;
		
		
		if(find(a, i, value) == true)
		{
	     	printf("\n Gia tri bi trung vui ong nhap lai") ;
	     	i-- ;
		}
		else
		a[i] = value ;
	}
	
	return 0 ;
	
}
