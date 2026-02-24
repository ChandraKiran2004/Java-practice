class A
{
	static int a=10;
	int b=20;
	static A obj=new A();
	static void sum()
	{
		System.out.println(a+obj.b);
	}
	static void sub()
	{
		System.out.println(a-obj.b);
	}
	static void mul(int c,int d)
	{
		System.out.println(c*d);
	}
	static void name(String e)
	{
		System.out.println(e);
	}
	public static void main(String [] args)
	{
		int e=50;
		System.out.println(e);
		mul(1,2);
		sum();
		sub();	
		name("chandu");

	}
}