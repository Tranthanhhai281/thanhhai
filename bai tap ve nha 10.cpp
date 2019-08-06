#include<stdio.h>


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
		int j = 0 ;
		while(j < i)
		{
			if(a[j]==a[i])
			{
			  printf("\n Phan tu trung nhau!vui long nhap lai:") ;
			  scanf("%d", &a[i]) ;
			  j= 0 ;
		    }
			else
			  j++ ;
		}
	}
	
	return 0 ;
	
}
