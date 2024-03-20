package collectionDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example {

	public static void main(String[] args) 
	{
		//HashMap Declaration
		//Map hm= new HashMap();
		HashMap <Integer,String>hm = new HashMap<Integer,String>();
		//Adding keypairs to the hashmap
		hm.put(100,"Subha");
		hm.put(200,"Smita");
		hm.put(300,"Pabitra");
		hm.put(500,"Smita");
		
		System.out.println(hm);
		//Size of HashMap
		System.out.println(hm.size());
		//Remove Pair
		//hm.remove(200);
		//Get all the key from HashMap
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		//for(Map.Entry m:hm.entrySet())
		for(int k:hm.keySet())
		{
			System.out.println(k+"  "+hm.get(k));
		}
		hm.remove(300);
		System.out.println(hm);
	}

}
