import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	static int n=sc.nextInt();
	void m1()
	{
		System.out.println("m1");
	}
	void m2(int a)
	{
		m1();
		System.out.println("m2");
	}
	int m3()
	{
		m2(n);
		System.out.println("m3");
		return n;
	}
	int m4(String a)
	{
		System.out.println(m3());
		System.out.println("m4");
		return n;
	}
	static void m5()
	{
		A obj=new A();
		System.out.println(obj.m4(sc.next()));
		System.out.println("m5");
	}
	static void m6(int a)
	{
		m5();
		System.out.println("m6");
	}
	static int m7()
	{
		m6(n);
		System.out.println("m7");
		return n;
	}
	static int m8(int a)
	{
		System.out.println(m7());
		System.out.println("m8");
		return n;
	}
	public static void main(String [] args)
	{
		System.out.println(m8(n));
	}
 }