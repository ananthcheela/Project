package test;

public class ArrayFifoList<T> implements FifoList<T> {
  private T[] elements;
  private int first, last;
  private T[] newArray;
  
  public static final int DEFAULT_SIZE = 10;
  
  public ArrayFifoList() {
    this(DEFAULT_SIZE);
  }
  
  public ArrayFifoList(int size) {
    first = -1;
    last = first;
    elements = (T[])(new Object[size]);
  }
  
  public void createArray()
  {
	  
	  newArray = (T[])(new Object[DEFAULT_SIZE*2]);
	  newArray = elements;
  }
  
  public void add(T ob) {
    if(isFull()) {
    	try{
      throw new FifoListOverflowException("List is already full cannot insert element.");
    	}
    	catch(FifoListOverflowException ffe)
    	{
    		System.out.println(ffe);
    		System.out.println("creating new array to insert values...");
    		createArray();
    		newArray[last] = ob;
    		System.out.println("Element is successfully inserted after creation of array");
    	}
    } 
    else if(isEmpty()) {
      first = 0; 
      last = 0;
      elements[first] = ob;
    } else { //neither full nor empty...
      last = (last + 1) % elements.length;
      elements[last] = ob;
    }
  }//add()
  
  public T removeFirst() {
    T ob = null;
    if(isEmpty()) {
    	try{
      throw new FifoListUnderflowException("There are no elements in the list");
    	}
    	catch(FifoListUnderflowException fle)
    	{
    		System.out.println(fle);
    	}
    } else {
      ob = elements[first];
      if(first == last) {
        //only one element in the structure
        first = -1;
      } else {
      first = (first + 1) % elements.length;
      }
    }
    return ob;
  }//removeFirst()
  
  public T peek() {
    if(isEmpty()) {
    	try{
      throw new FifoListUnderflowException("There are no elements in the list");
    	}
    	catch(FifoListUnderflowException fle)
    	{
    		System.out.println(fle);
    		
    	}
    } 
      return elements[first];
    
  }//peek()
  
  public boolean isEmpty() {
    return first < 0;
  }//isEmpty()
  
  public boolean isFull() {
    return (first == ((last + 1) % elements.length));
  }//isFull()
  
  @Override
  public String toString() {
    if(isEmpty()) {
      return "<empty>";
    } else {
      StringBuilder sb = new StringBuilder();
      int p = first;
      while(p != (last + 1) % elements.length) {
        sb.append(elements[p].toString() + "\n");
        p = (p + 1) % elements.length;
      }
      return sb.toString();
    }
  }//toString()
  
}//class ArrayFifoList 