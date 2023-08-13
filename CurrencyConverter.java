import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Rupee value!");
		double rupee=sc.nextInt();
		RupeeToDollar(rupee);
	}
	public static void RupeeToDollar(double rupee)
	{
		double dollar=rupee*0.012;
		System.out.println("RupeeToDollar"+dollar);
		DollarToEuro(dollar);
	}
	public static void DollarToEuro(double dollar)
	{
		double euro=dollar*0.93;
		System.out.println("DollarToEuro"+euro);
	}
}
