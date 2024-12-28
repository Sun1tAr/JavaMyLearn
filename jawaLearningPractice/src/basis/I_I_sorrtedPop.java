package basis;

public class I_I_sorrtedPop {

	public static void main(String[] args) {
		
		int n = 100; // кол-во значений в массиве
		
		double[] arr = new double[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Math.round(i * Math.random());
		}
		
		System.out.println("Значения неотсортированного массива: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf(arr[i] + ", ");
		}
		
		Maths.sortPop(arr);
		
		System.out.println("\n" + "Значения отсортированного массива: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
	}
	
	

}
