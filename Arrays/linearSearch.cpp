#include<iostream>
using namespace std;

void ls(int arr[],int size,int target){
       
       for(int i=0;i<size;i++){
        if(arr[i]==target){
            cout<<i;
            
        }
       }

       
}

int main(){
    int a[5]{1,2,3,4,5};
    int target=4;
    ls(a,5,target);
    return 0;
}