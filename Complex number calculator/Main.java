#include<iostream>
using namespace std;
struct calc
{
    float real;
    float img;
}s1,s2;

int main()
{
    float a,b;
    int ch;
    cin>>ch;
    cin>>s1.real;
    cin>>s1.img;
    cin>>s2.real;
    cin>>s2.img;
    float f1,f2,f3,f4;
  f1=s1.real;
  f2=s1.img;
  f3=s2.real;
  f4=s2.img;
    switch(ch)
    {
        case 1:
        {
            	a=f1+f3;
            	b=f2+f4;
            	
            	if(b<0)
            	{
            	    cout<<a<<b<<"i";
            	}
            	else
            	    cout<<a<<"+"<<b<<"i";
          break;
        }
        
        case 2:
        {
            	a=f1-f3;
                b=f2-f4;
            	
            	if(b<0)
            	{
            	    cout<<a<<b<<"i";
            	}
            	else
            	    cout<<a<<"+"<<b<<"i";
          break;
        }
        
        case 3:
        {
            	a=(f1*f3)-(f2*f4);
                b=(f1*f4)+(f3*f2);
            	
            	if(b<0)
            	{
            	    cout<<a<<b<<"i";
            	}
            	else
            	    cout<<a<<"+"<<b<<"i";
          break;
        }
      default:
        {
          cout<<"Invalid choice";
          break;
        }
    }
}