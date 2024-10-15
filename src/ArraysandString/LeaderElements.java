package ArraysandString;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderElements {
	
	public static ArrayList<Integer> leaderelements(int[] arr)
	{
		ArrayList<Integer> a = new ArrayList<>();
	
		int max = arr[arr.length-1];
		a.add(max);
		for(int i =arr.length-2;i>=0;i--)
		{
			
			if(arr[i]>max)
			{
				max= arr[i];
				a.add(arr[i]);
				
			}
		}
		Collections.reverse(a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {16, 17, 4, 3, 5, 2};
		ArrayList<Integer> a =leaderelements(arr);
		for(int digit:a)
		{
			System.out.print(digit+" ");
		}
		
	}

}
