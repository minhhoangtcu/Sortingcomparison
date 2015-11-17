package sorting.algorithms;

public class InsertionSort<T extends Comparable<T>> extends SortingAlgorithm<T> {

	public InsertionSort(T[] input) {
		super();
		sort(input);
		sortingMethod = SortingMethod.INSERTION;
		output = input; 
	}

	@Override
	protected void sort(T[] input) {
		int N = input.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0 && less(input[j], input[j-1]); j--) {
				exchange(input, j, j-1);
			}
		}
	}

	@Override
	public String getDescription() {
		return "insertion sort is the algorithm of choice either when the data is nearly sorted (because it is adaptive) or when the problem size is small (because it has low overhead). For these reasons, and because it is also stable, insertion sort is often used as the recursive base case (when the problem size is small) for higher overhead divide-and-conquer sorting algorithms, such as merge sort or quick sort.";
	}
}
