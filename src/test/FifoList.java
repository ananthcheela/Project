package test;



public interface FifoList<T> {
  void add(T ob);
  T removeFirst();
  T peek();
  boolean isEmpty();
}