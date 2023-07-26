package collectionDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example {

	public static void main(String[] args) {
		HashMap <Integer,String>hm = new HashMap<Integer,String>();
		//Adding keypairs to the hashmap
		hm.put(100,"Subha");
		hm.put(200,"Smita");
		hm.put(300,"Pabitra");
		
		System.out.println(hm);
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		hm.remove(300);
		System.out.println(hm);
	}

}
