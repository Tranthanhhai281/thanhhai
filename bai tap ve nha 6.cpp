# include<stdio.h>
# include<math.h>

int main()
{
	int n, t ;
	printf (" Nhap vao n=") ;
	scanf (" %d" , &n) ;
	int m=n;
	while(m>0)
	{
		t=t*10 +m%10;
		m=m/10 ;
	}
	if(t==n)
	{
		printf (" \n %d la so thuan nghich", n) ;
	} 
	else
	{
		printf (" \n %d khong la so thuan nghich",n) ;
	}
	
	return 0 ;
	
}

 
