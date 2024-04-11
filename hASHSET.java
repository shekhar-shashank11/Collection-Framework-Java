package collection_framework;
import java.util.*;

public class hASHSET {

	public static void main(String[] args) {
		HashSet <Integer> hs=new HashSet <>();
      hs.add(4);
      hs.add(6);
		hs.add(88);
		hs.add(9);
		hs.add(15);
		hs.add(35);
		
		Iterator <Integer> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
//		hs.remove(15);
//		hs.remove(88);
		
		System.out.print(hs);
		System.out.println();
		System.out.print(hs.contains(15));
		System.out.println();
		System.out.println(hs.hashCode());
	

	}

}

//------------------***************------------------	COMPLETE---------------------*******************
