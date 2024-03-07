package codes;

import java.util.Arrays;
import java.util.Scanner;

public class AssedingDesending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size =sc.nextInt();
		int[]num=new int[size];
		for(int i=0; i<size;i++)
		{
			 num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		
//		for(int i=0;i<num.length-1;i++)
//		{
//			if(num[i]>num[i+1])
//			{
//				int temp=num[i];
//				num[i]=num[i+1];
//				num[i+1]=temp;
//			}
//		}
//		System.out.println("number after swap");
		for(int data:num)
		{
			System.out.println(data);
		}
	}

}
