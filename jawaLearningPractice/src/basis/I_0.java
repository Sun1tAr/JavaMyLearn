package basis;

public class I_0 {

	public static void main(String[] args) {
		
		int n = 100; // кол-во значений в массиве
		
		double[] arr = new double[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = i * Math.random();
		}
		
		System.out.println(	"Максимальное значение массива: " + Maths.max(arr) + "\n" +
							"Минимальное значение массива: " + Maths.min(arr) + "\n" +
							"Среднее значение массива: " + Maths.average(arr) + "\n" );
	}

}
