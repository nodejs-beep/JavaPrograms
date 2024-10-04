package ArraysandString;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveduplicatefromString {
	
	//Write a java program output is abbcccdddd and input is abcd


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "programming";
		HashSet<Character> hs = new LinkedHashSet<Character>();
		for(char c:s.toCharArray())
		{
			hs.add(c);
		}
		
		Iterator<Character> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
	}

}
