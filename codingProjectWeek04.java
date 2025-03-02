package week04;

import java.util.stream.IntStream;

public class codingProjectWeek04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Create an array of int called ages that contains the following values: 3,
		 * 9, 23, 64, 2, 8, 28, 93.
		 * 
		 * 
		 * a. Programmatically subtract the value of the first element in the array from
		 * the value in the last element of the array (i.e. do not use ages[7] in your
		 * code). Print the result to the console.
		 * 
		 * b. Create a new array of int called ages2 with 9 elements (ages2 will be
		 * longer than the ages array, and have more elements).
		 * 
		 * i. Make sure that there are 9 elements of type int in this new array.
		 * 
		 * ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the
		 * value of the first element in the new array ages2 from the last element of
		 * ages2).
		 * 
		 * iii. Show that using the index values for the elements is dynamic (works for
		 * arrays of different lengths).
		 */

		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		int[] ages2 = { 5, 7, 4, 8, 9, 3, 1, 45, 55, 66, 77 };

		int result = ages[0] - ages[ages.length - 1];
		int result2 = ages2[0] - ages2[ages2.length - 1];
		System.out.println(result);
		System.out.println(result2);

		/*
		 * c. Use a loop to iterate through the array and calculate the average age.
		 * Print the result to the console.
		 */
		double result3 = 0;
		for (int i = 0; i < ages.length; i++) {
			result3 += Double.valueOf(ages[i]);
		}
		double average = result / ages.length;
		System.out.println(average);
		System.out.println("--------------");
		/*
		 * 2. Create an array of String called names that contains the following values:
		 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 * 
		 * a. Use a loop to iterate through the array and calculate the average number
		 * of letters per name. Print the result to the console.
		 * 
		 * b. Use a loop to iterate through the array again and concatenate all the
		 * names together, separated by spaces, and print the result to the console.
		 */
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		int averageLettters = 0;
		double countedLength = 0;

		for (int i = 0; i < names.length; i++) {
			countedLength += names[i].length();
		}
		double average2 = countedLength / names.length;

		System.out.println(average2);
		System.out.println("-----------------------------");

		/* for (int i = 0 ; i <names.length ; i++) { */
		String separator = "-";
		String result4 = String.join(separator, names);
		System.out.println(result4);
		System.out.println("------------------------------");

		/* 3. How do you access the last element of any array? */
		
		// String.length-1// System.out.println(names.length-1);//

		// 4. How do you access the first element of any array?
		
		// String[0]// Zero is always the first index element of an Array.

		// 5. Create a new array of int called nameLengths.
		// Write a loop to iterate over the previously created names array and add the
		// length of each name to the
		// nameLengths array.

		int[] nameLengths = new int [names.length];
		for (int i = 0; i < names.length; i ++ ) {
			nameLengths[i] = names[i].length();
			//System.out.println(names[i].length());
		}

		/*
		 * 6. Write a loop to iterate over the nameLengths array and calculate the sum
		 * of all the elements in the array. Print the result to the console.
		 */
        System.out.println("-----------------------------------");
		int sum3 = 0;
		for (int i =0; i < nameLengths.length; i++) {
			sum3 += nameLengths[i];
			System.out.println(sum3);
		}
		
		
		/*
		 * 7. Write a method that takes a String, word, and an int, n, as arguments and
		 * returns the word concatenated to itself n number of times. (i.e. if I pass in
		 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */
		// System.out.println(wordConcatenated);

		// 8. Write a method that takes two Strings,
		// firstName and lastName, and returns a full name
		// (the full name should be the first and the last name as a String separated by
		// a space).

		// 9. Write a method that takes an array of int and returns true if the sum of
		// all the ints in the array is greater than 100.

		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

		//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	}

	// 7
	public static String wordConcatenated(String word, int n) {
		String result7 = word.repeat(n);
		return result7;

	}

	// 8
	public static String fullName(String firstName, String lastName) {
		String result8 = (firstName + " " + lastName);
		return result8;
	}

	// 9
	public static boolean greaterThan(int[] sum) {
		int sum1 = 0;
		for (int i = 0; i > sum.length; i++) {
			sum1 += sum[i];

		}
		return sum1 > 100;

	}
	//10
	public static double result10(double[] avg) {
		double avg2 = 0;
		for (int i =0 ;i > avg.length; i++) {
			avg2 += avg[i];
			
			
		}
		return avg2 / avg.length;
		
		
	}
	//11
	public static boolean tF(double[] one, double[] two) {
		double one1 =0;
		double two2 =0;
		for (int i =0;i > one.length; i++) {
			one1 += one[i];
		}
		for (int i =0; i > two.length; i++) {
			two2 = two[i];
		}
		return one1 > two2;
		
	
	}
	
	//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	//13 A program that helps me find my lowest grade.
	public static int lowestGrade(int[] grades ) {
		int lowest = grades[0];
		for (int grade : grades) {
			if (grade < lowest) {
				lowest = grade;
			}
		}
		return lowest;
	} 
	

}
