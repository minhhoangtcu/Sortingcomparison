package sorting.algorithms;

public class HeapSort<T extends Comparable<T>> extends SortingAlgorithm<T> {
	
	public HeapSort(T[] input) {
		super();
		sort(input);
		sortingMethod = SortingMethod.HEAP;
	}

	@Override
	protected void sort(T[] a) {
		buildHeap(a);
		int i = a.length-1;
		while (i >= 1) {
			exchange(a, 1, i);
			i--;
			heapify(a, 1);
		}
		output = a;
	}
	
	private void buildHeap(T[] a) {
		int n = a.length;
		for (int i = (int) Math.floor(n/2); i >= 1; i--) {
			heapify(a, i);
		}
	}
	
	private void heapify(T[] a, int i) {
		int left = 2*i, right = 2*i + 1;
		int n = a.length;
		int max;
		if (left <= n && (a[left].compareTo(a[i])>0))
			max = left;
		else
			max = i;
		
		if (right <= n && (a[right].compareTo(a[max])>0))
			max = right;
		
		if (max != i)
			exchange(a, i, max);
			heapify(a, max);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
