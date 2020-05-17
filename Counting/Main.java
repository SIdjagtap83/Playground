#include<iostream>
#include<ctype.h>
#include<string>
using namespace std;
int main()
{
  string str;
  int v=0,c=0,w=0,d=0,s=0;
  getline(cin,str);
  int n=str.length();
  for(int i=0;i<n;i++)
  {
        if(isdigit(str[i]))
        {
          d++;
            }else if(isspace(str[i]))
             {
            w++;
             }else if(ispunct(str[i]))
              {
             s++;
            }else if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
           {
              v++;
            }
            else /*if(str[i]!='a'||str[i]!='e'||str[i]!='i'||str[i]!='o'||str[i]!='u')*/
            {
              c++;
               }
  
  }

  cout<<"Vowels:"<<v<<endl<<"Consonants:"<<c<<endl<<"White Spaces:"<<w<<endl<<"Digits:"<<d<<endl<<"Symbols:"<<s<<endl;
  
  
  
  
}