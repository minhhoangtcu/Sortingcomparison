package sorting.algorithms;

public class ShellSort<T extends Comparable<T>> extends SortingAlgorithm<T> {

	public ShellSort(T[] input) {
		super();
		sort(input);
		sortingMethod = SortingMethod.MERGE;
	}
	
	@Override
	protected void sort(T[] input) {
		int N = input.length;
		int h = 1;
		while (h < N/3)
			h = 3*h + 1; // get h to the every end
		while (h >= 1) { // h-sort the array
			for (int i = h; i < N; i++) {
				// Insert a[i] among a[i-h], a[i-2*h], a[i-3*h], ...
				for (int j = i; j >= h && less(input[j], input[j-1]); j -= h) {
					exchange(input, j, j-h);
				}
			}
			h = h/3;
		}
		output = input;
	}

	@Override
	public String getDescription() {
		return null;
	}

}
