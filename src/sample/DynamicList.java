package sample;

public class DynamicList {
	
	private Object[] elements;
	  private int numElements;
	  private static int STARTSIZE = 4;
	  
	  DynamicList(int startSize) { 
	    elements = new Object[startSize];
	    numElements = 0;
	  }
	  
	  DynamicList() {
	    this(STARTSIZE);
	  }
	  
	  int addElement(Object element) {
	    //add the element at the end of the elements array
	    if(numElements >= elements.length) {
	      growSize();
	    }
	    elements[numElements] = element;
	    return numElements++;
	  }
	  
	  int addElement(Object element, int index) {
	    //add the element at the indicated index, if valid
	    // otherwise return -1, do nothing
		  return index;
	  }
	  
	  Object removeElement(int index) {
	    //return null if invalid index
	    return index;
	  }
	  
	  Object removeFirst() {
	    if(numElements == 0) {
	      return null;
	    }
	    Object rval = elements[0];
	    numElements--;
	    for(int i = 0; i < numElements; i++) {
	      elements[i] = elements[i+1];
	    }
	    return elements;
	  }
	  
	  Object removeLast() {
	    /* Object rval = elements[numElements-1];
	    numElements--;
	    return rval;
	    */
	    //this is more elegant perhaps...
	    if(numElements == 0) {
	      return null;
	    }
	    return elements[--numElements];
	  }
	  
	  Object getElement(int index) {
	    //returns a reference, but does not remove the object
		  return index;
	  }
	  
	  private void growSize() {
	    //if structure is full, double the size
	  }
	  
	  private void shrinkSize() {
	    //if structure is bigger than STARTSIZE and under half utilized
	    // shrink by 50%
	  }
	  
	  int getNumberOfElements(int elements[]) {
	    //how many elements in the array
		  return elements.length;
	  }	

}
