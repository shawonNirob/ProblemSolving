#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n,temp,sum=0,r;
    printf("enter a number: ");
    scanf("%d", &n);

    temp=n;
    while(n>0){
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
    }
    if(sum==temp){
        printf("Palindrome");
    }
    else{
        printf("Not Palindrome");
    }
    return 0;
}
//
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

bool is4digits(int x){
    if(x==4){
        return true;
    }
    else{
        return false;
    }
}

int main(){
    int n,s;
    printf("enter a number: ");
    scanf("%d", &n);
    if(is4digits(n)==1){
        printf("Passward accepted");
    }
    else{
        printf("Passward denied");
    }
    return 0;
}

//
#include<stdio.h>
#include<stdbool.h>

bool isPalindrome(int x){
    if(x<0){
        return false;
    }
    else{
        long int sum=0;
        int r,temp;
        temp=x;
            while(x>0){
            r=x%10;
            sum=(sum*10)+r;
            x=x/10;
        }
            if(sum==temp){
                return true;
        }
            else{
                return false;
        }
    }
}
int main(){
    int n;
    printf("Please enter a number: ");
    scanf("%d", &n);
    if(isPalindrome(n)==1){
        printf("Palindrome");
    }
    else{
        printf("Not Palindrome");
    }
    return 0;
}
