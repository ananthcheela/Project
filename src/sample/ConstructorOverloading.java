package sample;

public class ConstructorOverloading {

	public ConstructorOverloading() {
		System.out.println("This is a constructor");
	}
	
	public ConstructorOverloading(int a) {
		System.out.println("This is a one argument constructor" + a);
	}


	public void add()
	{
		System.out.println("add method");
	}
	
	public int subtract(int a,int b)
	{
		return a+b;
	}
	
	public void subtract(double a , double b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		ConstructorOverloading co = new ConstructorOverloading();
		co.add();
		ConstructorOverloading co1 = new ConstructorOverloading(5);
		int x =co1.subtract(2,5);
		System.out.println(x);
		co1.subtract(5.0,6);
		
	}
	
	

}
