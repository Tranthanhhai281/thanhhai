#include<stdio.h>
#include<math.h>

int main(){
	int a;
	printf("\n Nhap vao a=") ;
	scanf("%d", &a) ;
	int b;
	printf("\n Nhap vao b=") ;
	scanf("%d", &b) ;
	
	int S;
	S = a + b ;
    printf("\n Tong cua hai so la: %d", S) ;

    int H ;
    H = a - b ; 
    printf("\n Hieu cua hai so la: %d", H) ;
    
    int T;
	T = a * b ;
	printf("\n Tich cua hai so la: %d", T) ;
	
	int F;
	F = a / b ;
	printf("\n Thuong cua hai so la: %d", F) ;
	
	
	return 0;
}
