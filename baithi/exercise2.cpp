#include<stdio.h>

int main()
{
	int n;
	printf("\n Input n=") ;
	scanf("%d", &n);
	
	int a[n];
	for(int i=0; i<n; i++){
		printf("\n Number %d:",i) ;
		scanf("%d", &a[i]) ;
	}
	printf("\n Mang:\t") ;
	for(int i=0; i<n; i++){
		printf("%5d", a[i]) ;
	}
	
	for(int i=0; i<=n/2; i++){
        int temp=a[i];
        a[i]=a[n-1-i];
        a[n-1-i]=temp;
    }
    printf("\n Mang dao nguoc la:\t ");
    for(int i=0;i<n;i++){
        printf("%d \t",a[i]);
    } 
	

	return 0;
}
