package sorting.algorithms;

public class SelectionSort<T extends Comparable<T>> extends SortingAlgorithm<T> {
	
	public SelectionSort(T[] input) {
		super();
		sort(input);
		sortingMethod = Sort.SELECTION_SORT;
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
	
	public String getDescription() {
		return "The algorithm divides the input list into two parts: the sublist of items already sorted, which is built up from left to right at the front (left) of the list, and the sublist of items remaining to be sorted that occupy the rest of the list. Initially, the sorted sublist is empty and the unsorted sublist is the entire input list. The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element in the unsorted sublist, exchanging (swapping) it with the leftmost unsorted element (putting it in sorted order), and moving the sublist boundaries one element to the right.";
	}
}
