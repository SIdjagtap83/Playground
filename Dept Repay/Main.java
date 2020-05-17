#include<iostream>
using namespace std;
int main()
{
int x,y,r,SI,total;
  std::cin>>x>>y>>r;
  SI=x*y*r/100;
  total=SI+x;
  cout<<SI<<endl;
  cout<<total<<endl;
  cout<<((float)SI/50)<<endl;
 cout<<((float)total-((float)SI/50))<<endl;
}