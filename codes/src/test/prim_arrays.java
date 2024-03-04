package test;

import java.util.Scanner;

public class prim_arrays {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("how many doubles you want to enter");
		double[]data=new double[sc.nextInt()];
		System.out.println("double data");
		for(double d : data)
		{
			System.out.println(d);
		}
		System.out.println(sc.getClass());
		for(int i=0;i<data.length;i++)
		{
			data[i]=sc.nextDouble();
		}
		for(double d :data)
		{
			System.out.println(d);
		}
		sc.close();
	}

}
