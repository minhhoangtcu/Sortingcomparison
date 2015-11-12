package sorting.algorithms;

public class MergeSortBook<T extends Comparable<T>> extends SortingAlgorithm<T> {
	
	public MergeSortBook(T[] input) {
		super();
		sort(input);
		sortingMethod = SortingMethod.MERGE;
	}

	@Override
	protected void sort(T[] input) {
		sort(input, 0, input.length-1);
		output = input;
	}
	
	@SuppressWarnings("unchecked")
	private void sort(T[] data, int min, int max) {
		T[] temp;
		int index1, left, right;
		
		// return on list of length one
		if (min == max)
			return;
		
		// find the length and the midpoint of the list
		int size = max - min + 1;
		int pivot = (min + max) / 2;
		temp = (T[]) (new Comparable[size]);
		
		sort(data, min, pivot);
		sort(data, pivot + 1, max);
		
		for (index1 = 0; index1 < size; index1++) {
			temp[index1] = data[min+index1];
			moves++;
		}
		
		left = 0;
		right = pivot - min + 1;
		for (index1 = 0; index1 < size; index1++) {
			if (right <= max - min)
				if (left <= pivot - min)
					if (less( temp[right], temp[left]))
						data[index1 + min] = temp[right++];
					else
						data[index1 + min] = temp[left++];
				else
					data[index1 + min] = temp[right++];
			else
				data[index1 + min] = temp[left++];
			moves++;
		}
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
