package collection_framework;
import java.util.*;
public class comprator {
		public static void main (String []args)
		{
			Comparator<Integer> co=new  Comparator<Integer>()
			{
				public int compare(Integer i,Integer j)
				{
					// sort the element by last no
					if(i%10 >j%10)
						return 1; // means swap
					else
						return -1;
				}
			};
			List <Integer> li=new ArrayList<>();
			li.add(45);
			li.add(59);
			li.add(66);
			li.add(55);
//			System.out.println(li);
//			
//			System.out.println("ELEment are sorted");
//			Collections.sort(li,co);
//			System.out.println(li);
			
//			Comparator<String> srt=new Comparator<String>() {
//				public int compare(String i,String j)
//				{
//					// sort the string of length according to their size
//					if(i.length()>j.length())
//						return 1; // means swap
//					else
//						return -1;
//				}
//				
//			};
			// using lmda expresssion and tertiary operator
			Comparator<String> com=(i,j) -> i.length()>j.length()?1:-1;
			
			List<String> sr=new ArrayList<>();
			sr.add("Hello world");
			sr.add("OKKKKKKKKKKKK");
			sr.add("gduyefdefgwi3");
			sr.add("go8dhu9ti0yehgdihey9");
			sr.add("dbhu");
			//Collections.sort(sr,srt);
			Collections.sort(sr,com);
			System.out.println(sr);
				
		}
}

//***********--------------------*******************