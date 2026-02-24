import java.util.*;
class Bank
{
	static Scanner sc=new Scanner(System.in);
	double b=15000;
	String wD(double amount)
	{
		if(amount <=0)
		{
			return "enter valid amount";
		}
		else if(amount<=b)
		{
			b-=amount;
			return "withdrawal sucessfull";
		}
		else
		{
			return "insufficient funds";
		}
	}
	String dA(double dA)
	{
		if(dA>0)
		{
			b+=dA;
			return "deposit successfull";
		}
		else
		{
			return "improper amount";
		}
	}
	double bA()
	{
		return b;
	}
	public static void main(String [] args)
	{
		Bank obj=new Bank();
		boolean b=true;
		while(b){
			System.out.println("enter 1 for withdrawal amount");
			System.out.println("enter 2 for deposit amount");
			System.out.println("enter 3 for check balance");
			System.out.println("enter 4 for exit");
			System.out.println("enter your option:");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:	System.out.println("enter withdrawal amount:");
					System.out.println(obj.wD(sc.nextDouble()));
					break;
				case 2:	System.out.println("enter deposit amount:");
					System.out.println(obj.dA(sc.nextDouble()));
					break;
				case 3:	System.out.println("your balance is:");
					System.out.println(obj.bA());
					break;
				case 4:	b=false;
					break;
				default: System.out.println("invalid option");
			}
		}
	}	
}