package ArraysandString;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Reverseeachwordinstring {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="I love Java programming";
		String[] str = s.split(" ");
		String s1="",s2="";
		for(int i =0;i<str.length;i++)
		{
			StringBuilder sb = new StringBuilder(str[i]);
			sb.reverse().append(" ");
			s1=sb.toString();
			if(Character.isUpperCase(s1.charAt(s1.length()-1)))
			{
				s1.toLowerCase();
				s1.substring(0, 1).toUpperCase();
				s2=s2+s1;
				System.out.println(s2);
			}
		}
		System.out.println(s1);
}
}
