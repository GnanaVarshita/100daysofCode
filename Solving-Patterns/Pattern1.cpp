#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter number:";
    cin>>n;
    
    int i=1;
    while(i<=n){
        int j=1;
        while(j<=n){
            cout<<j;
            //to print reverse numbers use n-j+1
            j++;
        }
        cout<<endl;
        i=i+1;
    }
}