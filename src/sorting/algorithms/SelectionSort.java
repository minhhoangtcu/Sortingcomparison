package sorting.algorithms;

public class SelectionSort<T extends Comparable<T>> extends SortingAlgorithm<T> {
	
	public SelectionSort(T[] input) {
		super();
		sort(input);
	}
	
	protected void sort(T[] input) {
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
}
