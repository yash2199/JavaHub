package codes;

import java.util.Scanner;

public class IsAssending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		System.out.println("enter the elements");
		int[] numbers=new int[size];
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		boolean isAssending=false;
		for(int i=0;i<numbers.length-1;i++)
		{
			if(numbers[i]<numbers[i+1])
			{
				isAssending=true;
				//System.out.println("number is in assending order");
			}
			
		}
		if(isAssending)
		{
			System.out.println("number are in assending order");
		}
		else
			System.out.println("number is in desending order");
	}

}
