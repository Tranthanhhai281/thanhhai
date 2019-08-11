#include<stdio.h>
#include<string.h>

void sap_xep(char s[][20], int n){
	char t[20];
	int i,j ;
	for (i = 1; i < 5; i++) {
        for (j = 1; j < 5; j++) {
            if (strcmp(s[j - 1], s[j]) > 0) {
                strcpy(t, s[j - 1]);
                strcpy(s[j - 1], s[j]);
                strcpy(s[j], t);
            }
        }
    }
}

int main()
{
	int n; 
	printf("\n Nhap vao n= ") ;
	scanf("%d", &n) ;
	
	char s[n][20] ;
	for(int i=0; i<n; i++){
		printf("\n nhap vao chuoi s:") ;
    	scanf("%s", s[i]) ;
    }
    
    sap_xep(s,n) ;
    
   	printf("\n Chuoi da duoc sap xep la:\n") ;
   	for(int i=0; i<n; i++){
   		scanf("%s",s[i]);
	}
   
    return 0 ;
}
