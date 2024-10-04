package ArraysandString;

public class Pattern1 {
	
	//Write a java program output is abbcccdddd and input is abcd


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		for(char c:s.toCharArray())
		{
			int i = s.indexOf(c)+1;
			while(i>0)
			{
				System.out.print(c);
				i--;
				
			}
		}
	}

}
