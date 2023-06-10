#include<iostream>
using namespace std;

void printArray(int arr[], int size){
    cout<<"Printing the array";
     for(int i=0;i<size;i++){
        cout<<arr[i]<< " ";
    }

    cout<<"Array printed";
}

int main(){
    int n[15];
    //checking value withous assigning
    cout<<n[14];//prints some garbage value
    //checking array value of out of bounds
    cout<<endl;
    //cout<<n[20];
    int sec[3]={5,7,11};
    cout<<sec[2];

    int arr[15]={2,7};

   printArray(arr,17);

   int arrSize=sizeof(arr)/sizeof(int);
   cout<<arrSize;

   char ch[5]={'a','b','c','d','f'};
 for(int i=0;i<5;i++){
        cout<<ch[i]<< " ";
    }
   cout<<ch[4];
   return 0;
}