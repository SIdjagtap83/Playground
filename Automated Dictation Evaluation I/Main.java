#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str1,str2;
  getline(cin,str1);
  getline(cin,str2);
  str1.compare(str2)?cout<<"It is wrong":cout<<"It is correct";
}