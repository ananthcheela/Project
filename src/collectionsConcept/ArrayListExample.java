package collectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>(100);
		System.out.println(al.size());
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(5);
		System.out.println(al.size());
		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);

		}
		System.out.println("Set");
		Set<Integer> s = new TreeSet<Integer>();
		s.add(5);
		s.add(3);
		System.out.println(s.add(5));
		Iterator<Integer> itr1 = s.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
