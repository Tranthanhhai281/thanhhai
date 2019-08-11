#include<stdio.h>
#include<string.h>

int main(){
	char s1[20] ;
	printf("\n Chuoi thu nhat la:\n") ;
	scanf("%s", s1) ;
	char s2[20] ;
	printf("\n Chuoi thu hai la:\n") ;
	scanf("%s", s2) ;
	
	int i=0; int j=0 ;
	int kiem_tra = 0;
	
	while (s1[i] != 0){
       if (s1[i] == s2[j]){
            if (s2[j] == 0){
                kiem_tra = 1;
                break;
            }
            j++;
        }
        else{
        	j = 0;
		}
        i++;
    }

    if (kiem_tra != 0){
    	printf("Chuoi thu hai nam trong chuoi thu nhat\n");
	}
    else{
    	printf("Chuoi thu hai khong nam trong chuoi thu nhat\n");
	}

	return 0;
	
}
