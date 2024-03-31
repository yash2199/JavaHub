package codes;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int no=sc.nextInt();
		
		int temp;
		int sum=0;
		int a,b;
		temp=no;
		while(no>0)
		{
			a=no%10;
			
			no=no/10;
			sum=(sum*10)+a;
		}
		if(temp==sum)
		{
			System.out.println("number is pallindrome");
		}
		else
			System.out.println("not pallindrome");
	}

}
