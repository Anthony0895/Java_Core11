package lgs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main_1sortnumbers {

	public static void main(String[] args) {
		Random r = new Random();
		Integer [] array = new Integer [r.nextInt(20)];
		System.out.println("Original random array:");
		for(int i =0; i <array.length; i++)
		{
			array[i]=r.nextInt(999);
		}
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		Arrays.sort(array);
		System.out.println("Sorted array in ascending order:");
		System.out.println(Arrays.toString(array));

		System.out.println();
		Arrays.sort(array , Collections.reverseOrder());
		System.out.println("Sorted array in descending order:");
		System.out.println(Arrays.toString(array));

	}
}
