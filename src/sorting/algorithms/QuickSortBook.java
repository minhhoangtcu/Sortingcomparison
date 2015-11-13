package sorting.algorithms;

public class QuickSortBook<T extends Comparable<T>> extends SortingAlgorithm<T> {
	
	public QuickSortBook(T[] input) {
		super();
		sort(input);
		sortingMethod = SortingMethod.QUICK;
	}

	@Override
	protected void sort(T[] input) {
		sort(input, 0, input.length-1);
		output = input;
	}
	
	private void sort(T[] input, int min, int max) {
		if (max <= min) return;
//		show(input);
		int pivot = findPartition(input, min, max);
		sort(input, min, pivot-1);
		sort(input, pivot+1, max);
	}
	
	private int findPartition(T[] input, int min, int max) {
		System.out.println();
		for (int i = min; i <= max; i++) {
			System.out.print(input[i] + " ");
		}
		
		int left, right;
		T temp, partitionElement;
		int mid = (min + max)/2;
		
		partitionElement = input[mid];
		left = min;
		right = max;
		
		while (left < right) {
			while (input[left].compareTo(partitionElement)<=0 && (left < right)) {
				left++;
				compares++;
			}
			while (input[right].compareTo(partitionElement)>0) {
				right--;
				compares++;
			}
			
			if (left < right) {
				temp = input[left];
				input[left] = input[right];
				input[right] = temp;
			}
		}
		
		temp = input[min];
		input[min] = input[right];
		input[right] = temp;
		
		System.out.println();
		for (int i = min; i <= max; i++) {
			System.out.print(input[i] + " ");
		}
		
		return right;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
