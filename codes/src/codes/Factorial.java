package codes;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact =1;
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	if(n<0)
	{
		System.out.println("enter positive number");
	}
	else
	{
		for(int i =1;i<=n;i++)
		{
			fact=fact*i;
		//	System.out.println(fact);
		}
		System.out.println(fact);
	}
	}

}
