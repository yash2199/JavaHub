package codes;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int []num= {11,52,33,43,6};
	Arrays.sort(num);
	int start=0;
	int end=num.length-1;
	while(start<end)
	{
		int temp=num[start];
		num[start]=num[end];
		num[end]=temp;
		start++;
		end--;
	}
	for(int data :num)
	{
		System.out.println(data);
	}
	}

}
