package _03_More_Array_Fun;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		
		reverseString();
		everyOtherString();
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void stringArrays() {
		String[] strings;
		strings = new String[5];
		strings[0] = "hi";
		strings[1] = "hello";
		strings[2] = "hola";
		strings[3] = "hey";
		strings[4] = "bye";
	
		for (int i = 0; i < strings.length; i++) {
		System.out.println(strings[i]);	
		}
	
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.

	public static void reverseString() {
		String[] reverse;
		reverse = new String[5];
		reverse[0] = "sentence";
		reverse[1] = "cool";
		reverse[2] = "a";
		reverse[3] = "is";
		reverse[4] = "this";
	
		for (int i = reverse.length-1; i >= 0; i--) {
		System.out.println(reverse[i]);	
		}
	
	}
	
	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	public static void everyOtherString() {
		String[]other;
		other = new String[6];
		other[0] = "one";
		other[1] = " ";
		other[2] = "two";
		other[3] = " ";
		other[4] = "three";
		other[5] = " ";
		
		for (int i = 0; i < other.length; i++) {
			if (i%2 == 0) {
				System.out.println(other[i]);
			}
			
		}
	}
	
	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

}
