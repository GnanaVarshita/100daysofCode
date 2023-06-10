#include<iostream>
using namespace std;

void maxmin(int arr[],int size){
    int min=arr[0];
    int max=arr[0];

    for(int i=0;i<size;i++){
        if(arr[i]<min){
            min=arr[i];
        }

        if(max<arr[i]){
            max=arr[i];
        }
    }

    cout<<"Minimum:"<<min<<endl;
    cout<<"Maximum"<<max<<endl;
}

int main(){
    int a[5]={5,25,54,36,86};
    maxmin(a,5);
    return 0;

}