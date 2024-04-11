package collection_framework;
import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Integer> ts=new TreeSet<>();
		ts.add(4);
		ts.add(8);
		ts.add(15);
		ts.add(1);
		ts.add(8);
		//System.out.println(ts.first());
		ts.forEach(n-> System.out.println(n));
		
		//System.out.println(ts.pollLast());
//		
//		System.out.println(ts.ceiling(16));
//		System.out.println(ts.floor(0));
	//	System.out.println(ts.clone());
	//	System.out.println(ts.descendingSet()); //reverse order
		//System.out.println(ts.hashCode());
		
		
		
		System.out.println();
		Collection <String> t= new TreeSet<>();
		t.add("Ashu");
		System.out.println(t);
		
		
		
		
	}

}

//................************************complete----------------*********
