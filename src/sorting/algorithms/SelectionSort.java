package sorting.algorithms;

public class SelectionSort<T extends Comparable<T>> {
	
	
	private int compares, moves;
	private T[] output;
	
	public SelectionSort(T[] input) {
		compares = 0;
		moves = 0;
		sort(input);
	}
	
	private void sort(T[] input) {
		int length = input.length;
		for (int i = 0; i < length; i++) {
			//Exchange input[i] with the smallest element with index min in the array
			int min = i;
			for (int j = i+1; j < length; j++) {
				if (less(input[j], input[min])) {
					min = j;
				}
			}
			exchange(input, i, min);
		}
		output = input;
	}
	
	public void show() {
		for (T element: output) {
			System.out.print(element + "  ");
		}
	}
	
	private boolean less(T a, T b) {
		compares++;
		return a.compareTo(b)<0;
	}
	
	private void exchange(T[] array, int index1, int index2) {
		T temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		moves += 3;
	}

	public T[] getOutput() {
		return output;
	}
	public int getCompares() {
		return compares;
	}
	public int getMoves() {
		return moves;
	}

}
