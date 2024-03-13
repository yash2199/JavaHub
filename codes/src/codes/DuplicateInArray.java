package codes;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateInArray {
	public static void main(String[] args)
	{
	Scanner sc =new Scanner(System.in);
	int size=sc.nextInt();
	int []array=new int[size];
	for(int i =0;i<size;i++)
	{
	array[i]=sc.nextInt();	
	}
	System.out.println("finding duplicate element from array");
	boolean isduplicate =false;
	for(int i=0;i<array.length;i++)
	{
		for(int j=i+1;j<array.length;j++)
		{
			int count=1;
			if(array[i]==array[j])
			{
				count++;
				System.out.println("duplicate element is "+array[i]);
				System.out.println("count is "+count);
				isduplicate=true;
				break;
			}
		}
	}
	if(!isduplicate)
	{
		System.out.println("no duplicate found");
	}
	}
}

