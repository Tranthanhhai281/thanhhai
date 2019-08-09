// nhap 1 so nguyen n.kiem tra so minh vua nhap co phai so nguyen to hay khong?
#include<stdio.h>
#include<math.h>

int main()
{
	int n ;
    int f=1;
	do
	{
		printf("Nhap vao n=") ;
		scanf("%d",&n);
		if(n<0)
		{
			printf(" %d khong la so nguyen to. Xin vui long nhap lai:\n", n);
		}
		else
		{
			break;
		}
		
	}while(n<0);
	
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				f=0;
		}
		if(f==1)
			printf("\n  %d la so nguyen to", n);
		else
			printf("\n  %d khong phai la so nguyen to", n);
	
    return 0;
	
	
}
