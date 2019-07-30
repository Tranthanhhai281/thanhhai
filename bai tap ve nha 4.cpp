# include <stdio.h>
# include <math.h>
# include <conio.h>
int main()
{
	int a,b,c ;
	
	do
	{
		printf(" \n nhap vao a=") ;
	    scanf(" %d" , &a) ;
	    printf(" \n nhap vao b=") ;
	    scanf(" %d" , &b) ;
	    printf(" \n nhap vao c=") ;
	    scanf(" %d" , &c) ;
	
	 if((a*a>b*b+c*c) || (b*b>a*a+c*c) || (c*c>b*b+a*a))
	{
		printf (" \n  Day khong la ba canh cua tam giac. Vui long nhap lai") ;
    }
	else 
	     break;
    }
	while((a*a>b*b+c*c) || (b*b>a*a+c*c) || (c*c>a*a+b*b)) ;
		
		
		printf(" \n Day la ba canh cua tam giac")  ; 
	
	
	
	
	 return 0 ;
    
}



	

	

	
