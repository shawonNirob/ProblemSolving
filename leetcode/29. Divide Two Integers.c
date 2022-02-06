#include <stdio.h>
#include <stdlib.h>
int divide (int dividend, int divisor);

int main()
{
    while(1){
    signed int d1, d2;
    printf("enter two number: ");
    scanf("%d %d", &d1, &d2);
    int r =divide(d1,d2);
    printf("result=%d\n", r);
    }
    return 0;
}
int divide (int dividend,int divisor){
    while(divisor!=0){
    if(dividend==divisor){
        return 1;
    }
    if(divisor==1){
        return dividend;
    }
    int sum=0, ans=0;
    if(dividend<0 && divisor<0){
        while(sum<dividend){
        sum=sum+divisor;
        ans++;
        if(sum>dividend){
            ans=ans-1;
            }
        }
        ans=ans*(-1);
        return ans;
    }
    if(dividend>0 && divisor>0){
         while(sum<dividend){
        sum=sum+divisor;
        ans++;
        if(sum>dividend){
            ans=ans-1;
            }
        }
    }
    return ans;
    }

}
//
#include <stdio.h>
#include <stdlib.h>
int divide (int dividend, int divisor);

int main()
{
    while(1){
    int d1, d2;
    printf("enter two number: ");
    scanf("%d %d", &d1, &d2);
    printf("d1=%d\t d2=%d\n", d1, d2);
    printf("%d/%d=%d\n", d1, d2, d1/d2);
    printf("%d*%d=%d\n", d1, d2, d1*d2);
    printf("%d-%d=%d\n", d1, d2, d1-d2);
    if(d1>d2){
      printf("%d>%d\n", d1, d2 );
    }
    }
    return 0;
}

//
#include <stdio.h>
#include <stdlib.h>
int divide (long int dividend,long int divisor);

int main()
{
    while(1){
    signed int d1, d2;
    printf("enter two number: ");
    scanf("%d %d", &d1, &d2);
    int r =divide(d1,d2);
    printf("result=%d\n", r);
    }
    return 0;
}

int divide (long int dividend,long int divisor){
    if(dividend==divisor){
        return 1;
    }
    if(divisor==1){
        return dividend;
    }
    long int sum=0, ans=0;
    if(dividend<0 && divisor<0){
        dividend=(-1)*dividend;
        divisor=(-1)*divisor;
        while(sum<dividend){
        sum=sum+divisor;
        ans++;
        if(sum>dividend){
            ans=ans-1;
            }
        }
        return ans;
    }
    if(divisor<0){
        divisor=(-1)*divisor;
        while(sum<dividend){
        sum=sum+divisor;
        ans++;
        if(sum>dividend){
            ans=ans-1;
            }
        }
        ans=ans*(-1);
        return ans;
    }
      if(dividend<0){
        dividend=(-1)*dividend;
        while(sum<dividend){
        sum=sum+divisor;
        ans++;
        if(sum>dividend){
            ans=ans-1;
            }
        }
        ans=ans*(-1);
        return ans;
    }
    if(dividend>0 && divisor>0){
         while(sum<dividend){
        sum=sum+divisor;
        ans++;
        if(sum>dividend){
            ans=ans-1;
            }
        }
        return ans;
    }
}
//
