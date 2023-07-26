package collectionDemo;

import java.util.ArrayList;

public class ArrayList_Example {

	public static void main(String[] args) 
	{
	ArrayList al = new ArrayList();
	
	System.out.println("Number of elements :" + al.size());//returns no. of elements present in al
	
	//Adding elements to array al
	al.add("Welcome");
	al.add(10);
	al.add(10.56);
	al.add('c');
	
	
	System.out.println("Number of elements in array list after adding :" + al.size());//returns no. of elements present in al
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
	}
}
