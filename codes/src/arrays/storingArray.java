package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class storingArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int[]arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			System.out.println(i+" "+arr[i]);
		}
	
	}

}
