#include <stdio.h>
#include <math.h>

int main ()
{
	int n, t ;
	printf(" Nhap vao n= ") ;
	scanf("%d", &n) ;
	for(int i=1; i<n;i++)
	{
		int m=i;
		while(m>0)
		{
			t=t*10 + m%10;
			m=m/10 ;
		}
		if(t==i)
		printf("\n So thuan nghich nho hon %d la: %d", n, i) ;
		t=0;
	}
	
	return 0 ; 
	
}
