#include<stdio.h>
#include<math.h>

int main()
{
	int a[4] [4] ;
	
	for(int i=0; i<4; i++)
	{
		for(int j=0; j<4; j++)
		{
			printf("Nhap a[%d] [%d]=", i, j) ;
			scanf("%d", &a[i] [j]) ; 
		}
	}
	
	for(int i=0; i<4; i++)
	{
		for(int j=0; j<4; j++)
		{
		   printf("%5d",a[i] [j]) ;
		}
		printf("\n");   
	}
	
	float tong = 0;
	float Trung_binh_cong = 0 ;
	for(int i=0; i<4; i++)
	{
		tong = tong + a[i][i] ;
	}
	
	Trung_binh_cong = tong / 4 ;
	
	printf("\n Trung binh cong duong cheo cua mang la:%lf", Trung_binh_cong) ;
	
	return 0 ;
	
}
	
	
