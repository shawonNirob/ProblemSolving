
double myPow(double x, signed long int n){
    double result;
    if(n>0){
        result= pow(x,n);
    }
    if(n==0 || x==1){
        result= 1;
    }
    else{
        result= (1/(pow(x,n*(-1))));
    }
    return result;
}
