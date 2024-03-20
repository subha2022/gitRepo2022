package collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo 
{

	public static void main(String[] args)
	{
		//HashSet Declaration
		//HashSet mySet =new HashSet();
		//Set mySet = new HashSet();
		HashSet<Integer> mySet = new HashSet<Integer>();
		mySet.add(10);
		mySet.add(20);
		mySet.add(30);
		mySet.add(10);//in set duplicates are not allowed, it takes only once
		mySet.add(null);
		mySet.add(null);
		//Printing HashSet
		System.out.println(mySet);// Insertion order is not preserved
		//Removing Element
		mySet.remove(20);
		System.out.println(mySet);
		
		//Inserting = is not possible
		//Access specific element= not possible
		
		//Convert HashSet--->ArrayList
		ArrayList al = new ArrayList(mySet);
		System.out.println(al);
		System.out.println(al.get(2));
		
		//Read all elements using advanced for loop
		/*for(Object x:mySet)
		{
			System.out.println(x);
		}*/
		
		//Using Iterator
		Iterator<Integer> it = mySet.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
