package leetcode73;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = {{1,1,1,0},{0,1,1,0},{0,1,1,0}};
		
		System.out.println("Matrix: " + Arrays.deepToString(matrix));
		
		SetMatrixToZerosFunction solution = new SetMatrixToZerosFunction();
		
		solution.setZeroes(matrix);
		
		System.out.println("Solution Matrix: " + Arrays.deepToString(matrix));
	}
}
