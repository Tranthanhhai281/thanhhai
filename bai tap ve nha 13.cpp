#include<stdio.h>

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
	
	printf("\n Ma tran a la:\n")  ;
	
	for(int i=0; i<4; i++)
	{
		for(int j=0; j<3; j++)
		{
		   printf("%5d",a[i] [j]) ;
		}
		printf("\n");   
	}
	
	printf("\n Ma tran chuyen vi cua a la:\n") ;
	
	int b[4][3]  ;
	for(int i=0; i<4; i++)
	{
		for(int j=0; j<3; j++)
		{
			b[i][j] = a[j][i]  ;
	    }
    }
    
    for(int i=0; i<4; i++)
	{
		for(int j=0; j<3; j++)
		{
		   printf("%5d",b[i] [j]) ;
		}
		printf("\n");   
	}
    
    return 0 ;
    
}
