import java.util.Scanner;
class Facebook 
{
	String name;
	String pass;

	Scanner sc=new Scanner(System.in);
	{
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter pass");
		pass=sc.next();
	}
	public void disply()
	{
		System.out.println("name : "+name);
		System.out.println("Pass : "+pass);
	}

	public static void main(String[] args) 
	{
		Facebook f1=new Facebook();
		Facebook f2=new Facebook();
		Facebook f3=new Facebook();
		Facebook f4=new Facebook();
		Facebook f5=new Facebook();
		
		f1.disply();
		f2.disply();
		f3.disply();
		f4.disply();
		f5.disply();
		//System.out.println("Hello World!");
	}
}
