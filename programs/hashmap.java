import java.util.*;
class hashmap
{
	public static void main(String args[])
	{
		HashMap <String,String> hmap=new HashMap <String,String>();
		
		hmap.put("EM","jainam");
		hmap.put("hii","kathan");
		
		
		System.out.println(hmap);
		System.out.println("--------");
		
		System.out.println(hmap.put("hii","patudo"));//modify value
		System.out.println(hmap);
		System.out.println("--------");
		
		System.out.println("keys in hashmap");
		
		for(String s:hmap.keySet())
			System.out.println(s);
		
		System.out.println("values in hashmap");

		for(String s:hmap.values())
			System.out.println(s);
		
		System.out.println("size is" +hmap.size());
		System.out.println("remove is" +hmap.remove("hii"));
		System.out.println(hmap);
		System.out.println("--------");
		
	}
	
	
}
