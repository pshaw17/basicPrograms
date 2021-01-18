package Array;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		int array [] = {2,5,54,23,67,43,98,34};
		 Arrays.sort(array);
		System.out.println("Second largest element is " +array[array.length-2] );

	}

}
