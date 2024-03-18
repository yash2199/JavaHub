package patterns;

import java.util.Scanner;

public class HollowSquare {
	public static void HollowSquare(int n) {
		int i;
		int j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == 0 || j == 0|| i==n-1||j == n - 1 ) {
					System.out.print(" * ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of lines");
		int n = sc.nextInt();
		HollowSquare(n);

	}

}
