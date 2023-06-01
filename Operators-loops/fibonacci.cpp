//0,1,1,2,3,5,8,13...
//sum of before two numbers

#include<iostream>
using namespace std;
int main(){
    int n=10;
    int a=0;
    int b=1;
    for(int i=1;i<=n;i++){
       int nextNumber=a+b;
       cout<<nextNumber<<" ";
       a=b;
       b=nextNumber;
    }
}