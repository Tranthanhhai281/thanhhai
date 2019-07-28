# include <stdio.h>
# include <math.h>
int main()
{
	int a,b,c ;
	double P , S , C;
	printf("nhap vao a=") ;
	scanf(" %d" , &a) ;
	printf(" \n nhap vao b=") ;
	scanf(" %d" , &b) ;
	printf(" \n nhap vao c=") ;
	scanf(" %d" , &c) ;
	if((a*a<=b*b+c*c) && (b*b<=a*a+c*c) && (c*c<=b*b+a*a))
	{
		printf (" \n  day la ba canh cua tam giac") ;
		
		P=(a+b+c)/2 ;
		C=(a+b+c) ;
		printf(" \n chu vi hinh tam giac la: %lf" , C) ;
		
		S=sqrt(P*(P-a)*(P-b)*(P-c)) ;
		printf("\n dien tich hinh tam giac la : %lf" , S) ;
	}
	else
	{
		printf(" \n day khong phai la ba canh cua tam giac") ;
	}
	
	return 0 ;
	
}




