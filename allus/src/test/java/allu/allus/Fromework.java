package allu.allus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Fromework {

	
	
	public static void main(String[] args) {
		
   /*  ArrayList<Integer> hs =new ArrayList <Integer>();
     hs.add(122);
     hs.add(131);
     hs.add(18345);
     hs.add(193456);
     hs.add(122);
     
     for(Integer i: hs ) {
    	 
    	 System.out.println(i);
     }
	}*/
		
	HashMap<Integer,String> hs=new HashMap<Integer,String>();	

	hs.put(11,"arpit");
	hs.put(15, "soni");
	hs.put(16, "selenium");
	hs.put(17, "automation");
	hs.put(18,"api");
	
	 Set<Integer> allkeys= hs.keySet();
	 
	 for(Integer i: allkeys) {
		 System.out.println("key is "+i);
		 System.out.println("value is "+ hs.get(i));
		 
	 }
	
	}
	
	
	
}
