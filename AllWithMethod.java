import java.util.Scanner;
class AllWithMethod
{


public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.println("enter your choice..1.reverse a number 2.lcm 3.hcf 4.check palindrome num 5.starpattern ");
int choice=sc.nextInt();
switch(choice)
	{
case 1:
		{
System.out.println("ENter a number for reverse");
int a=sc.nextInt();
reverse(a);
		}
	
case 2:
	{
System.out.println("enter two no for lcm");
int n1=sc.nextInt();
int n2=sc.nextInt();
lcm(n1,n2);
	}

	case 3:
	{
System.out.println("enter two no for hcf");
int h1=sc.nextInt();
int h2=sc.nextInt();
hcf(h1,h2);
	}
	case 4:
	{
System.out.println("Enter a num for check it is a palindrome or not");
int num=sc.nextInt();
palindrome(num);
	}

	case 5:
	{
System.out.println("printing a star pattern");
starpattern1();
	}
}
}
         //reverse
public static void reverse(int a)
{
int b=a;
int rev=0;
while(b>0)
{
int rem=b%10;
rev=(rev*10)+rem;
b/=10;
}
System.out.println(rev);
}

        //lcm
public static void lcm(int a,int b)
{

int n1= a;
int n2= b;

int lcm=n1>n2?n1:n2;

while(true)
{
if(lcm%n1==0 && lcm%n2==0)
{
System.out.println("lcm is : "+lcm);
break;
}
lcm++;
}
}

           //hcf
public static void hcf(int a,int b)
{
int n1= a;
int n2= b;

int hcf=n1<n2?n1:n2;

while(true)
{
if(n1%hcf==0 && n2%hcf==0)
{
System.out.println("hcf is : "+hcf);
break;
}
hcf++;
}
}

         //palindrome
public static void palindrome(int p)
{
  
  int num=p;
  int rev=0;
  int a=num;
	while(a>0)
{
	int rem=a%10;
 	rev=rev*10+rem;
      a/=10;
}
System.out.println(rev);
if(rev==num)
{System.out.println("its palindrome");}
else
	{System.out.println("its not palindrome");}
}

        //starpattern1
public static void starpattern1()
{

for(int i=0;i<4;i++)
{
if(i<2)
{
	for(int k=0;k<4;k++)
	{
  	System.out.print("*"+" ");
	}
	System.out.println();
	}
else
{
for(int k=0;k<4;k++)
{
  System.out.print("#"+" ");
}
System.out.println();
}
}
}







}
