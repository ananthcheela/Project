package sample;

public class ListDeque<T> implements Deque<T> {
	  private Node<T> first, last;
	  
	  public class Node<T> {
	    public Node<T> prev, next;
	    private final T data;
	    
	    public Node(T obj) {
	      data = obj;
	    }
	    
	  }//class node
	  
	 public void add(T element){
	    Node<T> n = new Node<T>(element);
	    if(last == null) {
	      last = n;
	      first = last;
	    } else {
	      last.next = n;
	      n.prev = last;
	      last = n;
	    }
	  }//add()
	  
	  public T removeFirst(){
	    Node<T> p = first;
	    first = p.next;
	    p.next = null;
	    if(first != null)
	    {
	    	first.prev = null;
	    }
	    return p.data;
	  }
	  
	  public T removeLast(){
	     Node<T> p = last;
	     last = last.prev;
	     last.next = null;
	     p.prev = null;
	     return p.data;
	  }
	  
	  public T peekFirst(){
		  Node<T> p = first;
		  return p.data;
	  }
	  
	  public T peekLast(){
		  
		  Node<T> p = last;
		  return p.data;
	  }
	  
	  
	   public String toString() {
		   if (first == null){
	            return "Empty Deque";
	        }
	        Node<T> temp = first;
	        String str = "[";
	        while(temp.next != null){
	            str += temp.data + ",";
	            temp = temp.next;
	        }
	        str += temp.data;
	        return str + "]";
		   //return String.valueOf(temp.data);
		  
	  }
	  
	  
	}//class ListDeque