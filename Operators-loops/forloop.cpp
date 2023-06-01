#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"ENter the value of n:";
    cin>>n;

    for(int i=1;i<=n;i++){
        cout<<i;
    }
    int i=1;
    for(; ;){
        if(i<=n){
            cout<<i;
        
        }
        else{
            break;
        }
        i++;
    }
           cout<<endl;
    int sum=0;
    for(int i=1;i<=n;i++){
        sum+=i;
    }

    cout<<sum;
}

//multiple initializations