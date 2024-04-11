package collection_framework;
import java.util.*;
public class Priority_queue {
	public static void main (String []args)
	{
		PriorityQueue <Integer> pq=new PriorityQueue<>();
		pq.add(10);
		pq.add(4);
		pq.add(1);
		pq.add(15);
		pq.add(2);
		pq.add(6);
	System.out.println(pq.element());
		pq.offer(5);
		System.out.println(pq.size());
		
		pq.remove();
	System.out.println();

		//System.out.print(pq);
		
		pq.forEach(n -> System.out.println(n));
		
		
	}
}


//-------------********************----------COMPLETE--------------------****************
