#include<iostream>
using namespace std;



void reverse(int arr[],int size){
       int start=0;
       int end=size-1;
       while(start<end){
          swap(arr[start],arr[end]);
          start++;
          end--;
       }

       for(int i=0;i<size;i++){
        cout<<arr[i]<<" ";
       }
       
}

int main(){
    int a[5]={1,2,3,4,5};
    int b[6]={6,7,8,9,10,11};
    reverse(a,5);
    reverse(b,6);
    //reverse(b,6);
}