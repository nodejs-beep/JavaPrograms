package ArraysandString;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Movezeroestoend {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,0,3,0,2,9,8,0};
		int index = 0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[index]=arr[i];
				index++;
			}
		}
		
		while(index<arr.length)
		{
			arr[index]=0;
			index++;
		}
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

}
}
