#include<stdio.h>

void nhap_ma_tran(int a[4][4]){
	for(int i=0; i<4; i++)
	{
		for(int j=0; j<4 ; j++)
		{
			printf(" Nhap a[%d][%d] = ", i, j) ;
			scanf("%d", &a[i][j]) ;
		}
	}
}

void xuat_ma_tran(int a[4][4]){
	for(int i=0; i<4; i++)
	{
		for(int j=0; j<4; j++)
		{
		   printf("%5d",a[i][j]) ;
		}
		printf("\n");   
	}
}

int tong_lon_nhat(int a[4][4]){
	int max = 0;
    int x = 0 ;
    for(int i=0; i<4; i++)
    {
    	int tong = 0;
    	for(int j=0; j<4; j++)
    	{
    		tong = tong + a[i][j] ;
		}
		if(i == 0){
			max = tong;
		}
		if(max < tong){
			max = tong;
			x = i  ;
		}
	}
	printf("\n Hang %d co gia tri lon nhat= %d", x, max) ;
	
	return x ;
}

int main()
{
	int a[4][4];
	nhap_ma_tran(a);
	printf("\n Ta co ma tran la:\n") ;
	xuat_ma_tran(a) ;
	
	tong_lon_nhat(a) ;

	return 0;
	
}
