package basisOOP;

public class LinkedList {

	
	private int[] array;
	
	
	public LinkedList() {
		this.array = new int[1];
	}
	
	public LinkedList(int length) {
		
		this.array = new int[length];
	}
	
	public int length() {
		return array.length;
	}
	
	public void add(int position, int element) {
		int count = 0;
		if (position > array.length) {
			count = position - array.length + 1;
		} else {
			count = 0;
		}
		int[] temp_array = new int[array.length + count];
		for (int i = 0; i < array.length; i++) {
			 if (i < position) temp_array[i] = array[i];
			 if (i == position) temp_array[i] = element;
			 if (i > position) temp_array[i] = array[i];
		}
		if (temp_array.length - 1 == position) temp_array[position] = element;
		
		this.array = temp_array;
					
	}
	
	public int get(int position) {
		return array[position];
	}
	
}
