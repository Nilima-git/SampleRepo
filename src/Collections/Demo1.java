package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Demo1 {
	
	
	public static void main(String[] args) 
	
	{
		ArrayList al = new ArrayList ();
		
		
		al.add("Rahul");
		al.add(100);
		al.add('A');
		al.add(60.25f);
		al.add(100);
		
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		// To Verify Arraylist is empty or not
		
		System.out.println(al.isEmpty());   //false
		
		//To Verify size or capacity
		
		System.out.println(al.size());    //7
		
		//Verify Information present or not
		
		System.out.println(al.contains('A'));  // True
		
		// Add Information between Arraylist--> Right Shift Operation
		
		al.add(3,50);
		 System.out.println(al);
		 
		 //Remove information-----> Left Shift Operation
		
		 al.remove(3);
		 
		 System.out.println(al);
		 
		 //Update Info
		 
		 al.set(3, 80.15);
		 
		 System.out.println(al);
		 
		 // to find index of data
		 
		 System.out.println(al.indexOf('A'));   //2
		 
		 // To get index by providing information
		 
		 System.out.println(al.get(0));    //rahul
		 
		 
		 System.out.println("------for each loop----------");
		 
		 for (Object S1:al)  //0-->Rahul 1--->100 2--->A 3---> 60.25 4--->100
		 {
			 
			 System.out.println(S1); // Rahul 100 A 60.25 100
		 }
		 
		 System.out.println("-------iterator curser-----------");
		 
		           Iterator  Itr=al.iterator();
		           
		           while (Itr.hasNext())     // 7----> False
		           {
		        	   
		        	   System.out.println(Itr.hasNext()); // Rahul 100 A 60.25 100 null null
		           }
		 
		                ListIterator itr =al.listIterator();
		                
		                while(itr.hasNext())    // 7----> False
		                {
		                	
		                	System.out.println(itr.next());  // Rahul 100 A 60.25 100 null null
		                }
		 
	}

	
	}