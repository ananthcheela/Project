package exceptionhandling;



public class ExceptionHandlingOperations {
	private String name;
	private int rollno;
	
public ExceptionHandlingOperations(String name, int rollno) {
		
	this.name =name;
	this.rollno = rollno;
	}

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}




@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ExceptionHandlingOperations other = (ExceptionHandlingOperations) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (rollno != other.rollno)
		return false;
	return true;
}

	public static void main(String[] args)  {
		
		ExceptionHandlingOperations exp = new ExceptionHandlingOperations("ananth",121);
		ExceptionHandlingOperations exp1 = new ExceptionHandlingOperations("ananth",121);
		System.out.println(exp == exp1);
		System.out.println("equals:"+ exp.equals(exp1));
		
		int a[] = new int[2];
		a[0] = 5;
		a[1] = 0;
		try
		{
		int c = a[0]/a[1];
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero");
		}
		
		try{
		a[2] = 5;}
		catch(IndexOutOfBoundsException ie)
		{
			System.out.println("Index out of Bounds exception");
		}
		try
		{
		Integer i = new Integer("ten");
		}
		catch(IllegalArgumentException nfe)
		{
			System.out.println("Please pass interger argument or String");
		}
		
		
		
		
		
		}
	
	
}
