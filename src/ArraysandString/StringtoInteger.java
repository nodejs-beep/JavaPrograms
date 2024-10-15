package ArraysandString;

public class StringtoInteger {
	//convert String to Integer without using Integer.parseInt
	
	public void conversion(String s)
	{
		int num =0;
		for(int i=0;i<s.length();i++)
		{
			num = num*10+ (int)(s.charAt(i)-48);
		}
		
		System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringtoInteger sti = new StringtoInteger();
		sti.conversion("123");
	}

}
