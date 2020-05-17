#include <algorithm>
#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s1,s2;
  getline(cin,s1);
  getline(cin,s2);
  reverse(s1.begin(), s1.end());
  (s2==s1)?cout<<"It is correct":cout<<"It is wrong";
}