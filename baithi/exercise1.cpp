#include<stdio.h>
#include<math.h>

int main(){
	int a;
	printf("\n Input a=") ;
	scanf("%d", &a) ;
	int b;
	printf("\n Input b=") ;
	scanf("%d", &b) ;
	
	int S;
	S = a + b ;
    printf("\n Calculate Sum: %d", S) ;

    int H ;
    H = a - b ; 
    printf("\n Calculate Substraction: %d", H) ;
    
    int T;
	T = a * b ;
	printf("\n Calculate maitiplication: %d", T) ;
	
	int F;
	F = a / b ;
	printf("\n Calculate Division: %d", F) ;
	
	
	return 0;
}
