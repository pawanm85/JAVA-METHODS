
import java.util.Scanner;
class  MethodReturn
{
    
	public static int add(int a,int b)
	{
		int ans=a+b;
		return ans;

	}
	
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int res=add(a,b);
			System.out.println(res);

			boolean an=prime(12);
			System.out.println(an);
	}



	public static boolean prime(int num)
{
  
   int i=2;
	while(i<num)
   {
	if(num%2==0)
      {
       break;
       }
		i++;
   }
  if(i==num)
	{
    return  true;
      }
  else
      {
    return  false;
      }
}
}



