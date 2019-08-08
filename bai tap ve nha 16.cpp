#include<stdio.h>

void nhap_mang(int a[], int n){
    for(int i=0; i<n; i++){
        printf("\n Nhap vao phan tu a[%d] la:", i) ;
        scanf("%d", &a[i]) ; 
	}
}

void xuat_mang(int a[], int n){
	printf("\n Ta co mang la:\n") ;
	for(int i=0; i<n; i++){
		printf("%5d", a[i]) ;
	}
	printf("\n")  ;
}

void tim_so_gan_lon_nhat(int a[], int n){
	int max = 0 ; 
	for(int i=1; i<n; i++){
		if(max < a[i]){
			max = a[i]  ;
		}
	}
	int max2 = 0 ;
	for(int i=0; i<n; i++){
		if(max2<max && max!=a[i] && max2<a[i]){
			max2 = a[i]  ;
		}
	}
	printf("\n Gia tri gan lon nhat cua mang la: %d", max2) ;
}

int main(){
	int n;
	printf("\n Nhap vao n=") ;
	scanf("%d", &n)  ;
	int a[n] ;
	nhap_mang(a,n) ;
	xuat_mang(a,n) ;
    tim_so_gan_lon_nhat(a,n) ;
	
	return 0 ; 
}
