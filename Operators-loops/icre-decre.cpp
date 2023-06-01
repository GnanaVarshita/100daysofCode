#include<iostream>
using namespace std;

int main(){
    //post increment

    int i=4;
    int a=7;
    int sum = a+(i++);
    cout<<sum<<endl;
    cout<<i;

    //pre increment

    int pre=a+(++i);
    cout<<pre<<endl;
    cout<<i;

    //post decrement

    int podec= a+(i--);
    cout<<podec<<endl;
    cout<<i;

    //pre decrement

    int prdec=a+(--i);
    cout<<prdec<<endl;
    cout<<i;
}