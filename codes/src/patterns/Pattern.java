package patterns;

import java.util.Scanner;

public class Pattern {
public static void printpattern(int n)
{
for(int i=0;i<n;i++)
{
System.out.print("*");
}
for(int i=0;i<n+1;i++)
{
System.out.print("#");	
}
}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
	printpattern(n);
		sc.close();
	}

}
