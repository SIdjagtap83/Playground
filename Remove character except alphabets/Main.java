#include<iostream>
#include<string>
#include<ctype.h>
using namespace std;
int main()
{
  int j=0;
  string s,o;
  getline(cin,s);
  for(int i=0;i<(s.length());i++)
  {
    if(isalpha(s[i]))
    {
        o[j]=s[i];
        j++;
    }
    
  }
  for(int i=0;i<j;i++)
  {
  cout<<o[i];

  }
  
}