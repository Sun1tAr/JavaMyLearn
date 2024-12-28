package basis;

import java.util.Arrays;

public class Maths {

	public static double max(double[] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}
	
	public static double min(double[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
	
	public static double average(double[] arr) {
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum/arr.length;
	}
	
	public static double[] sortPop(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j+1]) {
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					
				}
				
			}
			
		}
		
		return arr;
	}
	
	public static void primeNumbers(int a, int b) {
		
		for (int i = a; i <= b; i++) {
			int count = 0;
			for (int j = 1; j < Integer.MAX_VALUE; j++) {
				if (i % j == 0) count++;
			}
			if (count <= 2) System.out.print(i + ", ");
			
			
		}
		
	}
	
	public static double secondarySerchMathX(double a, double b, double e, double x) {
		e = Math.abs(e);
		double x0 = (a + b)/2;
		double e0 = (b - a)/2;
		//System.out.println("Log = " + e0);
		if (e0 <= e) return x0;
		else {
			if (x > x0) a = x0;
			else b = x0;
			
			return secondarySerchMathX(a, b, e, x);
		}
	}
	
	
	
	
	
	
}
