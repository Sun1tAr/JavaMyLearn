package basisOOP;

public class II_II_LinkedList {

	public static void main(String[] args) {
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 10;
		}
		LinkedList mass = new LinkedList(5);
		mass.add(1,11);
		mass.add(2, 22);
		mass.add(3,33);
		mass.add(4, 44);
		mass.add(9, 5550);
		
		mass.add(3, 1454);
		
		for (int i = 0; i < mass.length(); i++) {
			System.out.println("Номер элемента: " + i + " Значение: " + mass.get(i));
		}
	}

}
