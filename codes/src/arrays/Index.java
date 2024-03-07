package arrays;

import java.util.Scanner;

public class Index {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int[] ary = new int[sc.nextInt()];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = sc.nextInt();
        }
        System.out.println("enter number to be found");
        int x = sc.nextInt();
        boolean found = false; // Flag to indicate if the number is found

        for (int i = 0; i < ary.length; i++) {
            if (ary[i] == x) {
                System.out.println(x + " is found at index " + i);
                found = true; // Set the flag to true since the number is found
                break; // Exit the loop once the number is found
            }
        }

        if (!found) {
            System.out.println(x + " is not present in the array.");
        }
    }
}
