package codes;

import java.util.Scanner;

public class UniqueNumber {
	
	public static void unique(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	        boolean isUnique = true;
	        for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
	                isUnique = false;
	                break; // Exit the inner loop as soon as a duplicate is found
	            }
	        }
	        // Check if isUnique is still true after checking all elements
	        if (isUnique) {
	            System.out.println(arr[i]);
	        }
	    }
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		int[]arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		unique(arr);
	}

}
