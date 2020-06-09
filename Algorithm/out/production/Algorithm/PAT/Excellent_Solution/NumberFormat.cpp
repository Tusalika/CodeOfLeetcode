#include <iostream>
#include <stack>

using namespace std;

int main(){
    int a, b, d;
    scanf("%d %d %d", &a, &b, &d);
    stack<int> s;
    int tmp = a + b;
    int rest;
    do{
        s.push(tmp %d);
        tmp /= d;
    }while(tmp != 0);
    while(!s.empty()){
        printf("%d", s.top());
        s.pop();
    }
    printf("%c", '\n');
    return 0;
}