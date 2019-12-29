package tutorial;

import java.util.Scanner;

public class Matrix {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		Row_Col_2_matrix();

	}
	public static int[][] input_doubleArray(int[][] array1){

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.println("Enter the first value for: ["+i+"] ["+j+"]");
				array1[i][j] = sc.nextInt();
			}
		}
		return array1;
		
		
		
	}
	
	public static void Row_Col_2_matrix() {
		int row, Columns, row2, Columns2;
		
		do {
		System.out.println("the first array: Enter the size of Rows: ");
		row = sc.nextInt();
		System.out.println("the first array: Enter the size of Columns: ");
		Columns = sc.nextInt();
		
		System.out.println("the second array: Enter the size of Rows: ");
		row2 = sc.nextInt();
		System.out.println("the second array: Enter the size of Columns: ");
		Columns2 = sc.nextInt();

		}while(Columns != row2);
		int[][] matrix1 = new int [row][Columns];
		int[][] matrix2 = new int [row2][Columns2];
		
		if(Columns == row2) {
		input_doubleArray(matrix1);
		input_doubleArray(matrix2);
		matrix_multiply(matrix1, matrix2);
		
		}
		
		
		
		
	}
	
	public static void matrix_multiply(int[][] matrix1, int[][] matrix2) {

		final int rows1 = matrix1.length, cols1 = matrix1[0].length, cols2 = matrix2[0].length;

		int[][] result = new int[rows1][cols2];

		
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				for (int k = 0; k < cols1; k++) {
					result[i][j] += (matrix1[i][k] * matrix2[k][j]);
				}

			}

		}
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				System.out.print(result[i][j]+" \t");

			}
			System.out.println(" ");

		}

	}

}