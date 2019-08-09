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
	
	printf("\n Ma tran A la:\n") ;
	for(int i=0; i<4; i++)
	{
		for(int j=0; j<3; j++)
		{
		   printf("%5d",a[i] [j]) ;
		}
		printf("\n");   
	}
	
	int b[3][4] ;
	for(int i=0; i<3; i++){
		for(int j=0; j<4; j++){
			b[i][j] = a[j][i] ;
		}
	}
	
	printf("\n Ma tran chuyen vi la:\n") ;
	for (int i = 0; i < 3; ++i)
	{
		for (int j = 0; j < 4; ++j)
		{
			printf("%5d", b[i][j]);
		}
		printf("\n");
    }
	
	return 0 ; 
	
}


