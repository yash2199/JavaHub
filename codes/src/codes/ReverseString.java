package codes;

public class ReverseString {
	
	public static String reverse(String input)
	{
		char[] rev=input.toCharArray();
		int start=0;
		int end= rev.length-1;
		while(start<end)
		{
			char temp=rev[start];
			rev[start]=rev[end];
			rev[end]= temp;
			start++;
			end--;
		}
		return new String(rev);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String orginalString="Hello,Wolrd";
String revString= reverse(orginalString);
System.out.println(orginalString);
System.out.println(revString);
	}

}

