package codes;

import java.util.Scanner;

public class names {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of an array ");
		int size=sc.nextInt();
		
		String[] name=new String[size];
		for(int i=0;i<size;i++)
		{
			 name[i]=sc.next();
			
		}
	for(String n:name)
	{
	System.out.println("name are "+ n);	
	}
	
		

	}

}
