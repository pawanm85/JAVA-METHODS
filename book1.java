import java.utol.Scanner;
class book1 
{
	String name;
	double price;
	String author;

	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) 
	{
		book1 b1=new book1();
		b1.name="A";
		b1.price=100;
		b1.author="A";
		
		book1 b2=new book1();
		b2.name="B";
		b2.price=200;
		b2.author="B";
		
		book1 b3=new book1();
		b3.name="C";
		b3.price=300;
		b3.author="C";

		book1 b4=new book1();
		b4.name="D";
		b4.price=400;
		b4.author="D";

		book1 b5=new book1();
		b5.name="E";
		b5.price=500;
		b5.author="E";
		
		System.out.println("enter price");
		if(b1.price>b1.sc.nextDouble())
		{
			System.out.println(b1.name);
		}
	}
}
