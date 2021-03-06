import java.util.Scanner;

public class Assigment_11 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// ------------EXE_1--------------
		System.out.println("------------EXE_1---------------");
		System.out.println("hello ! print a number: ");
		int numExe1 = sc.nextInt();
		System.out.println("the num is: "+numExe1);
		System.out.println("The condition is: " + recIsAscendingDigitsNum(numExe1));

		// ------------EXE_2--------------
		System.out.println("\n------------EXE_2---------------");
		System.out.println("Enter size of array: ");
		int sizeEx2 = sc.nextInt();
		int[] arrayEx2 = new int[sizeEx2];
		for(int i = 0; i < sizeEx2; i ++) {
			System.out.println("the value in ["+i+"] place.");
			arrayEx2[i] = sc.nextInt();
		}
		for(int i = 0; i < sizeEx2; i ++) 
			System.out.print(arrayEx2[i]+", ");

		System.out.println(" ");
		System.out.println("The sum Value: "+ HelpRec(arrayEx2) );

		// ------------EXE_3--------------
		System.out.println("\n------------EXE_3---------------");
		System.out.println("enter a number: ");
		int valueEx3 = sc.nextInt();
		System.out.println("the input is: "+valueEx3);
		System.out.println("The value of even digits is: "+ helpRecExe3(valueEx3));

		// ------------EXE_4--------------
		System.out.println("------------EXE_4---------------");
		System.out.println("Enter the size of array: ");
		int sizeEx4 = sc.nextInt();
		System.out.println("Please Enter a letter: ");
		char chEx4 = sc.next().charAt(0);
		char[] arrayEx4 = new char [sizeEx4];
		for(int y = 0; y < sizeEx4; y ++) {
			System.out.println("the value in ["+y+"] place.");
			arrayEx4[y] = sc.next().charAt(0);
		}
		for(int y = 0; y < sizeEx4; y ++) 
			System.out.print(arrayEx4[y]+" \t");
		System.out.println(" ");
		System.out.println("the numbers of same letter is: "+ helpRecExe4(arrayEx4, chEx4));

		// ------------EXE_5--------------
		System.out.println("------------EXE_5---------------");
		System.out.println("enter a Size for print : ");
		int sizeEx5 = sc.nextInt();
		helpRecEx5(sizeEx5);

	}

	// ---------------EXE_1---------------
	public static boolean recIsAscendingDigitsNum(int num) {
		boolean bool = true;
		int digit1, divide;
		if (num != 0) {
			digit1 = num % 10;
			divide = (num / 10) % 10;
			if (digit1 > divide)
				return recIsAscendingDigitsNum(num / 10);
			else if (digit1 < divide)
				return false;
		}
		return bool;

	}

	// ---------------EXE_2---------------
	public static int HelpRec(int[] array) {
		int i = 0, min = array[0], max = array[0];
		return recSumMinMaxArr(array, i, min, max);
	}

	public static int recSumMinMaxArr(int arr[], int i, int min, int max) {

		if (i < arr.length) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
			return recSumMinMaxArr(arr, i + 1, min, max);
		}
		return min + max;
	}

	// ---------------EXE_3---------------
	public static int helpRecExe3(int number) {
		int sum = 0;
		return recSumEvenDigits(number, sum);
	}

	public static int recSumEvenDigits(int number, int sum) {
		int digit;
		if (number != 0) {
			digit = number % 10;
			if (digit % 2 == 0)
				sum += digit;

			return recSumEvenDigits(number / 10, sum);

		}
		return sum;

	}

	// ---------------EXE_4---------------
	public static int helpRecExe4(char[] array, char letter) {
		int counter = 0, i = 0;
		return recCountCharsInArray(array, letter, counter, i);
	}

	public static int recCountCharsInArray(char[] array, char letter, int counter, int i) {

		if (i < array.length) {
			if (array[i] == letter)
				counter++;
			return recCountCharsInArray(array, letter, counter, i + 1);
		}
		return counter;
	}

	// ---------------EXE_5---------------
	public static void helpRecEx5(int number) {
		int n = 1, helpNum= number;
		triangular(number, n);
		System.out.println(" ");
		timeTriangular(number, n, helpNum);
		return;
	}

	public static void triangular(int number, int n) {

		if (number != 0) {
			for (int i = 0; i < n; i++) {
				System.out.print("* ");
			}
			System.out.println(" ");
			triangular(number - 1, n + 1);
		}
		return;
	}

	public static void timeTriangular(int number, int n, int value) {
		
		if (number != 0) {
			for (int i = 1; i <= number; i++) {
				System.out.print("* ");
			}
			System.out.println(" ");
			timeTriangular(number - 1, n, value);
		}
		else
		triangular(value, n);

	}

}
