package codes;

import java.util.Scanner;

public class ArraySum {

	private static void adding(int[] num) {
		int sum=0;
		for(int i =0;i<num.length;i++)
		{
		sum+=num[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
		int []arr= {1,2,3,4,5,6};
		adding(arr);
		
	}



}
