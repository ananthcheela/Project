package abstractExample;

import sample.main1;

public abstract class AbstractExample {
	
	public void add()
	{
		System.out.println(2+3);
	}
	
	public static void main(String[] args) {
		Tester t = new Tester();
		t.add();
		t.subtract();
		t.multiply();
	}
	
	public abstract void subtract();
	
	public abstract void multiply();


}

abstract class  Test extends AbstractExample{
	
	public void subtract(){
		System.out.println(5-2);
	}
}

class Tester extends Test{
	
	public void multiply(){
		System.out.println(2*3);
	}
	
}
