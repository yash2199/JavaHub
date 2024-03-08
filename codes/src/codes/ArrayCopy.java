package codes;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size= sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			
			arr1[i]=sc.nextInt();
			arr2[i]=arr1[i];
			
		}
		Arrays.sort(arr2);
	System.out.println(Arrays.toString(arr2));	
	
//for(int data :arr2 )
//{
//	System.out.println("inside 2nd loop ");
//	System.out.println(data);
//	}
	
	}

}
