package lab_10;

import java.util.Scanner;

public class Exe_10 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// ------------------EXE_ 1------------------
		System.out.println("Enter the First String: ");
		String str = sc.nextLine();
		System.out.println("Enter the second String: ");
		String sub = sc.nextLine();
		System.out.println(valueLetter(str, sub));

		// ------------------EXE_2-------------------
		System.out.println("Enter how much Strings you want: ");
		int sizeArray = sc.nextInt(); sc.nextLine();
		String[] array = new String[sizeArray];
		
		for(int i =0; i < array.length; i++) {
			
			System.out.println("Enter something: ["+i+"]");
			array[i] = sc.nextLine();	
		}
		System.out.println(arrayStrings(array));

		// -----------------EXE_3--------------------
		System.out.println("Enter a String: ");
		String string = sc.nextLine();
		System.out.println("Enter a Char: ");
		char ch = sc.next().charAt(0);
		System.out.println(valueOfChar(string, ch));

		// -----------------EXE_4---------------------
		System.out.println("Enter a String: ");
		String strPol = sc.nextLine();
		System.out.println(combinationOfPolindrom(strPol));

	}// main

	// ---------------------EXE_1--------------------
	public static int valueLetter(String str, String sub) {

		for (int i = str.length(); i >= 0; i--) {
			for (int j = 0; j < i; j++) {

				if (sub.equals(str.substring(j, i))) {
					return j;

				}

			}
		}

		return -1;
	}

	// ---------------------EXE_2--------------------
	public static boolean arrayStrings(String[] strArray) {
		boolean bool = true;
		for(int i = 1; i < strArray.length;i++) {
			bool = ha(strArray[i], strArray[i-1]);
		}
		return bool;
	}
	
	// ----------------------EXE_3--------------------
	public static boolean ha(String str1, String str2) {
			boolean bool = false;
		for(int i =str1.length(); i >= 0; i-- ) {
			for(int j = 0; j < i; j ++) {
				
				if((str2.equals(str1.substring(j,i)))) {
					bool =  true;
				}
				
			}
		}
		return bool;
		
		
	}
	
	public static int valueOfChar(String str1, char ch) {

		int counter = 0;

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == ch) {
				counter++;
			}

		}

		return counter;
	}

	// ----------------------EXE_4--------------------
	public static int combinationOfPolindrom(String str1) {

		for (int i = 0; i < str1.length() / 2; i++) {

			if (str1.charAt(i) != str1.charAt(str1.length() - i - 1)) 
				return -1;
		}
		if (str1.length() % 2 != 0)
			return 1;
		
		return 0;

	}

}// class
