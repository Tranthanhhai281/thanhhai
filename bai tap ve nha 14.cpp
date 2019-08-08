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

void tang_dan(int a[], int n){
	for(int i=0; i<n; i++){
		int j= i-1;
		int tmp = a[i] ;
		while((j >= 0 ) && (tmp < a[j])){
			a[j+1] = a[j] ;
			j-- ; 
		}
		a[j+1] = tmp;
	}
	printf("\n Mang tang dan la:\n") ;
	for(int i=0; i<n; i++){
		printf("%5d",a[i]) ;
	}
}

void giam_dan(int a[], int n){
	for(int i=0; i<n;i++){
		int j= i-1;
		int tmp = a[i] ;
		while((j >= 0 ) && (tmp > a[j])){
			a[j+1] = a[j] ;
			j-- ; 
		}
		a[j+1] = tmp;
	}
	printf("\n Mang giam dan la:\n") ;
	for(int i=0; i<n; i++){
		printf("%5d",a[i]) ;
	}
}

int main()
{
	int n;
	printf("\n Nhap vao n=") ;
	scanf("%d", &n) ;
	int a[n] ;
	nhap_mang(a,n) ;
	xuat_mang(a,n) ;
	tang_dan(a,n)  ;
	giam_dan(a,n)  ;

	return 0 ;
		
}
