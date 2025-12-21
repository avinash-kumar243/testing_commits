// write a program to find the sum of all the digits of a number given by a user using an array and display the sum
public class SumOfDigits {
	// Generate a random number 
	public int randomNumberGeneration() {
		return (int)(Math.random() * 10000);
	}
	
	// Get the size of an array
	public int countDigit(int number) {
		int count = 0;
		while(number != 0) {
			count++;
			number /= 10;
		}
		return count;
	}
	
	// create an array and store all the digits of a number in that array
	public int[] storeDigit(int number, int size) {
		int arr[] = new int[size];
		int i = 0;
		while(number != 0) {
			int digit = number % 10;
			arr[i++] = digit;
			number /= 10;
		}
		return arr;
	}
	
	// Calculating the sum of all digits
	public int sumOfDigits(int arr[]) {
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		return sum;
	}
	
	// print all the digits of a number
	public void printDigits(int arr[]) {
		System.out.println("Digits of a number are : ");
		for(int digit : arr) {
			System.out.println(digit);
		}
	}
	
	public static void main(String args[]) {
		// Generate a number
		SumOfDigits obj = new SumOfDigits();
		int number = obj.randomNumberGeneration();
		
		// get the size of an array
		int size = obj.countDigit(number);
		
		// store all digits of a number in the array
		int digits[] = obj.storeDigit(number, size);
		
		// calculate sum of all digits
		int sum = obj.sumOfDigits(digits);
		
		// print the sum of all digits
		System.out.println("The sum of all the digits are : " + sum);
		
		// print all the digits of a number
		obj.printDigits(digits);
	}
}