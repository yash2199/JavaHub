package patterns;

import java.util.Scanner;

public  class pyramid {
 	int i;
	int j;
	int num=1;
	public  void pattern(int n)
	{
		for( i=1;i<=n;i++ )
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of lines");
		int n =sc.nextInt();
		pyramid p =new pyramid();
		p.pattern(n);
		

	}

}
