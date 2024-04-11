package collection_framework;
import java.util.*;

public class Linked_list {
	public static void main (String []args)
	{
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(5);
		ll.add(6);
		ll.add(8);
		ll.add(12);
		ll.add(3, 30); // add betwen the linkedlist
		//System.out.print(ll);
		ll.addLast(200);
		//ll.forEach(n-> System.out.println(n));
		ll.addFirst(1);
		ll.forEach(n-> System.out.printf(" %d  ",n));
		System.out.println( );
//		System.out.println(ll.element());
//		ll.remove(1);
//		ll.forEach(n-> System.out.printf(" %d  ",n));
//		ll.offerFirst(5);
		//ll.forEach(n-> System.out.printf(" %d  ",n));
		//ll.pollFirst();
		//ll.forEach(n-> System.out.printf(" %d  ",n));
		//ll.pollLast();
		//ll.forEach(n-> System.out.printf(" %d  ",n));
		
	//System.out.println(ll.peekLast());
		
		
		
		ListIterator<Integer>it=ll.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		//reverse the linked list
		
			Iterator  <Integer>  x=ll.descendingIterator();
			
			while(x.hasNext())
			{
				System.out.println(x.next());
			}
	
	
		
	}
}

//--------------------**************complete-------------------******************
