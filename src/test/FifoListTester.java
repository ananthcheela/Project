package test;

import static java.lang.System.out;

public class FifoListTester {
  
  public static void main(String[] args) {
   
    ArrayFifoList<String> afl = new ArrayFifoList<>();
    
    afl.add(new String("one"));
    afl.add(new String("two"));
    afl.add(new String("three"));
    afl.add(new String("four"));
    afl.add(new String("one"));
    afl.add(new String("two"));
    afl.add(new String("three"));
    afl.add(new String("four"));
    afl.add(new String("one"));
    afl.add(new String("two"));
    afl.add(new String("three"));
   
    
    out.println("\n\nAFL toString(): ");
    out.println(afl);
    
    out.println("\n\nAFL:");
    out.println(afl.removeFirst());
    out.println(afl.removeFirst());
    out.println(afl.removeFirst());
      
   
    
  }//main()
  
}//class