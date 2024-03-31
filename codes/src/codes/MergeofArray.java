package codes;

import java.util.Scanner;

public class MergeofArray {
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[]arr1=new int[size];
		int[]arr2=new int[size];
		System.out.println("insert into first array");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("insert in second array");
		for(int i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
	size=arr1[size]+arr2[size];
		System.out.println(size);
	}

}
