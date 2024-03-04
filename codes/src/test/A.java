package test;

import java.util.Arrays;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String[]data=new String[sc.nextInt()];
		System.out.println("enter elements");
		for(int i=0;i<data.length;i++)
		{
			data[i]=sc.next();
		}
//		for(int d : data) {
//			System.out.println(d);
//		}
		System.out.println(Arrays.toString(data));
	}

}
