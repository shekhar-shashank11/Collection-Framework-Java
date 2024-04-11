package collection_framework;
import java.util.*;

public class Array_deque {
	public static void main(String[] args)
	{
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		dq.addLast(4);
		dq.addLast(5);
		dq.addLast(6);
		dq.addFirst(1);
		dq.addFirst(2);
		dq.addFirst(3);
		
		//dq.forEach(n-> System.out.println(n));
//		System.out.println(dq.peek());
//		System.out.println(dq.pollFirst());
//		dq.removeFirst();
//		dq.removeLast();
//		System.out.println();
//		dq.forEach(n-> System.out.println(n));
		
//		dq.addLast(4);
//		dq.addLast(5);
//		dq.addLast(6);
//		dq.addLast(7);
//		dq.forEach(n-> System.out.println(n));
//		System.out.println();
//		//it work like stack
//		System.out.println(dq.removeLast());
//		System.out.println(dq.removeLast());
//		
		
		for(Iterator  <Integer>  x=dq.iterator(); x.hasNext(); )
		{
			System.out.println(x.next());
		}
		
		//reverse deque
		System.out.println();
		Iterator  <Integer> y=dq.descendingIterator();
		while(y.hasNext())
		{
			System.out.println(y.next());
		}
		
	
		
		
	}
}

//-----**-*--------------complete-------------*************


