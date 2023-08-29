class CondiFour
{
public static void main(String[]args)
{
  int a=100; 
  int b=110;
  int c=120;
  int d=130;
  int e=140;
  int f=150;
  int s1;
  int s2;
  int s3;
int ans= f>(s3=e>(s2=d>(s1=c>(a>b?a:b)?c:(a>b?a:b))?d:s1)?e:s2)?f:s3;
System.out.println(ans);
}
}