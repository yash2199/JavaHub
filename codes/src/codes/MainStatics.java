package codes;

import java.util.Scanner;

public class MainStatics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		// TODO Auto-generated method stub
		Statics s1=new Statics(sc.nextInt(),sc.next(),sc.nextDouble());
		System.out.println(s1);
	
		//System.out.println("name is "+s1.getName());
	}

}
