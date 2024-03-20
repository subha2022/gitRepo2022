package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Example {

	public static void main(String[] args) 
	{
		//ArrayList Declaration

		//List al=new ArrayList();
		//ArrayList al = new ArrayList();
		ArrayList<Object> al = new ArrayList<Object>();
		System.out.println("Number of elements :" + al.size());//returns no. of elements present in al

		//Adding elements to array al
		al.add("Welcome");
		al.add(10);
		al.add(10.56);
		al.add('c');
		// Size of ArrayList ,returns no. of elements present in al
		System.out.println("Number of elements in array list after adding :" + al.size());
		//printing array list
		System.out.println("Elements in array list:"+al);

		//Inserting elements in array list
		al.add(2,"Training"); //2 is describes after number of elements not position
		al.add(4,12334);

		System.out.println("Number of elements in array list after adding :" + al.size());
		System.out.println("Elements in array list:"+al);

		//Removing elements from array list
		al.remove("Welcome"); //Directly specify the value
		System.out.println("Elements in array list:"+al);

		al.remove(2); //2 describes after number of elements not exactly position
		System.out.println("Elements in array list:"+al);
		//get specific element from array list
		System.out.println(al.get(2));
		
		//Reading all elements from array list
		//apparoch-1 using normal for loop
		/*for (int i=0;i<al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}*/
		
		/*//using enhanced for loop	
		for(Object x:al)
		{
			System.out.println(x); 
		}*/
		
		//Using Iterator concept
		System.out.println("*************");
		System.out.println(al);
		
		Iterator<Object> it = al.iterator();
		while(it.hasNext()); //hasNext-it will check element is present or not
		{
			System.out.println(it.next());//next - it will call the next element
		}
		
		//remove all element from array list
		ArrayList<Object> al2 = new ArrayList<Object>();
		al2.add(122);
		al2.add('a');
		al2.add(145);
		System.out.println(al2);
		al2.clear();
		System.out.println(al2);
		
	}
}
