#include<stdio.h>
#include<math.h>

int main()
{
	int a[4] [3] ;
	
	for(int i=0; i<4; i++)
	{
		for(int j=0; j<3; j++)
		{
			printf("Nhap a[%d] [%d]=", i, j) ;
			scanf("%d", &a[i] [j]) ; 
		}
	}
	
	for(int i=0; i<4; i++)
	{
		for(int j=0; j<3; j++)
		{
		   printf("%5d",a[i] [j]) ;
		}
		printf("\n");   
	}
	
	
	int b[4] [3]  ;
	
	for(int m=0; m<4; m++)
	{
		for(int n=0; n<3; n++)
		{
			printf("Nhap b[%d] [%d]=", m, n) ;
			scanf("%d", &b[m] [n]) ; 
		}
    }
	
	for(int m=0; m<4; m++)
	{
		for(int n=0; n<3; n++)
		{
		   printf("%5d",b[m] [n]) ;
		}
		printf("\n");   
	}
	
	int tong_a = 0 ;
	for(int i=0; i<4; i++)
	{
		for(int j=0; j<3; j++)
		{
			tong_a+=a[i][j];
		}
	}
	
	int tong_b = 0 ;
	for(int m=0; m<4; m++)
	{
		for(int n=0; n<3; n++)
		{
			tong_b+=b[m][n];
		}
	}
	
	int Tong = 0;
	Tong = tong_a + tong_b ; 
	
	printf("\n Tong hai ma tran la:%d", Tong) ;
	
	int Hieu = 0 ;
	Hieu = tong_a - tong_b ;
	
	printf("\n Hieu hai ma tran la:%d", Hieu) ; 
	
	
    return 0   ;
	
}
	
	
