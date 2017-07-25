package sample;

public interface Deque<T> {
	  void add(T element);
	  T removeFirst();
	  T removeLast();
	  T peekFirst();
	  T peekLast();  
	}
