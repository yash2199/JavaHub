package codes;

import java.util.Scanner;

public class min_max {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] number=new int[size];
	for(int i=0;i<size;i++)
	{
		number[i]=sc.nextInt();
	}
	int min=number[0];
	int max=number[0];
	for(int i=1;i<number.length;i++)
	{
		if(number[i]>max)
		{
			max=number[i];
		}
		else if(number[i]<min)
		{
			min=number[i];
		}
	}
	System.out.println("min number is "+min);
	System.out.println("max number is"+max);
	}

}
/*
 * 
 public class MinMaxFinder {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {3, 5, 7, 2, 8, 1, 9, 4};

        // Calling the method to find and print the min and max values
        findMinMax(numbers);
    }

    public static void findMinMax(int[] array) {
        // Check if the array is empty
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        // Initialize min and max with the first element of the array
        int min = array[0];
        int max = array[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if current element is greater
            } else if (array[i] < min) {
                min = array[i]; // Update min if current element is smaller
            }
        }

        // Print the results
        System.out.println("Minimum number in the array: " + min);
        System.out.println("Maximum number in the array: " + max);
    }
}

 */