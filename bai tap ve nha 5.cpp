# include <stdio.h>
# include <math.h>
# include <conio.h>
int main()
{
	int n;
	int S = 0;
	printf ("\n Nhap vao n= ") ;
	scanf (" %d" , &n) ;
	for(int i=1; i<n ; i++)
	{
		if(n%i==0)
		S = S+i;
	}
	if(n==S)
	{
		printf (" \n %d la so hoan hao", n) ;
	}
	else
	{
		printf (" \n %d khong la so hoan hao", n) ;
	}
	return 0 ;
}
