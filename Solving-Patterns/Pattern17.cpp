#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;

    int row=1;
    while(row<=n){
        
        int col=1;
        int i=n-row+1;

        while(col<=i){
            cout<<'*';
            col++;
        }
        cout<<endl;
        row++;
    }
}