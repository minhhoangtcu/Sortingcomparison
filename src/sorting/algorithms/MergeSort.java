package sorting.algorithms;

import java.util.ArrayList;

public class MergeSort<T extends Comparable<T>> extends SortingAlgorithm<T> {
	
	public MergeSort(T[] input) {
		super();
		sort(input);
		sortingMethod = SortingMethod.MERGE;
	}
	
	@Override
	protected void sort(T[] input) {
		sort(input, 0, input.length-1);
		output = input;
	}

	private void sort(T[] input, int low, int high) {
		if (high <= low) return;
		int mid = (low+high)/2;
		sort(input, low, mid);
		sort(input, mid+1, high);
		merge(input, low, mid, high);
	}
	
	private void merge(T[] input, int low, int mid, int high) {
		int i = low, j = mid+1;
		ArrayList<T> tempList = new ArrayList<>(high-low+1);
		
		while (i <= mid | j <= high) {
			if (i == mid+1) {
				while (j != high+1) {
					tempList.add(input[j++]);
					moves++;
				}
			}
			else if (j == high+1) {
				while (i != mid+1) {
					tempList.add(input[i++]);
					moves++;
				}
			}
			else if (less(input[i], input[j])) {
				tempList.add(input[i++]);
				moves++;
			}
			else {
				tempList.add(input[j++]);
				moves++;
			}
		}
		
		for (T in: tempList) {
			input[low++] = in;
			moves++;
		}
	}

	@Override
	public String getDescription() {
		return "Mergesort is a divide and conquer algorithm.";
	}

}
