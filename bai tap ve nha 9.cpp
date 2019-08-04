#include<stdio.h>
#include<math.h>

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
	}
	
	int Tong = 0 ;
	int So_so_hang = 0 ;
	float Trung_binh_cong = 0 ;
	
	for(So_so_hang = 0 ; So_so_hang < n ; So_so_hang++)
	{
		Tong = Tong + a[So_so_hang]  ;
	}
	
	Trung_binh_cong = (float) Tong / So_so_hang ;
	
	printf("\n Trung binh cong cua mang la: %lf" , Trung_binh_cong)  ;
	
	return 0 ;
	
}
