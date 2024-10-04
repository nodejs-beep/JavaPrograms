package ArraysandString;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
	/*	int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("Enter a number ");
			arr[i]=sc.nextInt();
			
		}*/
		
		int[] arr= {1,0,7,8,9,2,3,4,5,6};
		//Arrays.sort(arr);
		//System.out.println(arr[arr.length-2]);
		int max= 0;
		int secondmax=0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>max)
				
			{
				secondmax = max;
				max = arr[i];
				
			}
		
		}
		
		System.out.println(secondmax);

	}

}
