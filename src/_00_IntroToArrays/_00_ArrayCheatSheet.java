package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	public static void main(String[] args) {
		int[] arrs = new int[50];
		Random rand = new Random();
		//1. make an array of 5 Strings
		String[] arr = new String[5];
		//2. print the third element in the array
		System.out.println(arr[3]);
		//3. set the third element to a different value
		arr[3] = "hello";
		//4. print the third element again
		System.out.println(arr[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "bye";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//7. make an array of 50 integers
		
		//8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = rand.nextInt(50);
		}
		
		int small=arrs[0];
		//9. without printing the entire array, print only the smallest number on the array
		for (int i = 0; i < 50; i++) {
			if(arrs[i] < small) {
			small = arrs[i];
			
		}
		}
		System.out.println("smallest is " + small);
		//10 print the entire array to see if step 8 was correct
		
		for (int i = 0; i < arrs.length; i++) {
			System.out.println(arrs[i]);
		}
		//11. print the largest number in the array.
		int largest=arrs[0];
		for (int i = 0; i < 50; i++) {
			if(arrs[i] > largest) {
			largest = arrs[i];
			
		}
		}
		System.out.println("largest is " + largest);
		//12. print only the last element in the array
		int last=arrs[49];
		for (int i = 0; i < 50; i++) {
			
			last = arrs[49];
			
		
		}
		System.out.println("last is " + last);
	}
}
