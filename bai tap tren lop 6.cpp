// nhap n.tim so nguyen to nho hon n.
#include <stdio.h>
#include <math.h>
 int main()
 {
 	int n;
 	printf(" Nhap vao n=") ;
 	scanf("%d", &n) ;

 	for(int i=1; i<=n; i++)
 	{
 		int t=0;
 		for(int j=1; j<=i; ++j)
 		{
 			if(i%j==0)
 			t++ ; 
		}
		if(t==2)
		printf(" So nguyen to be hon %d la: %d \n" , n , i) ;
		
	}
	
	return 0;
 	
 }
