package collection_framework;
import java.util.*;

public class Array_list {
	public static void main (String []args)
	{
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));
		al1.add(5);
		al1.add(6);
		al1.add(0, 8);
		//al1.addAll(al2);
		al1.addAll(1, al2);
		System.out.println(al1);
		//System.out.println(al1.getLast());
//		System.out.println(al1.get(5));
//		System.out.println(al1.set(2, 100));
//		System.out.println(al1.remove(5));
//		System.out.println(al1);
//		System.out.println(al1.size());
//		System.out.println(al1.removeFirst());
//		System.out.println(al1);
		
	
		// iteration m1 for loop
		
//		for(int i=0;i<al1.size();i++)
//		{
//			System.out.println(al1.get(i));
//		}
		// another
//		for(Integer x:al1)
//		{
//			System.out.println(x);
//		}
//	
		
		// method iterator using while loop
		//Iterator <Integer> i= al1.iterator();
		//ListIterator <Integer> i= al1.listIterator();
		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//			//System.out.println(i.previousIndex());
//		
//		}
		
		// using for loop
//		for(ListIterator <Integer> i= al1.listIterator(); i.hasNext(); )
//		{
//			System.out.println(i.next());
//		}
		
		// forEach method 
		
	//al1.forEach(n -> System.out.println(n));
		//or 
		//al1.forEach(System.out :: println);
		//al1.forEach(n -> show(n));
	}
	
	static void show(int n)
	{
		if(n>60)
			System.out.println(n);
	}
}
 


//-----------*****************--------complete-----------------**************