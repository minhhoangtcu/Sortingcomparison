
package sorting.algorithms;

public class QuickSort<T extends Comparable<T>> extends SortingAlgorithm<T> {
	
	public QuickSort(T[] input) {
		super();
		sort(input);
		sortingMethod = SortingMethod.QUICK;
	}

	@Override
	protected void sort(T[] input) {
		sort(input, 0, input.length-1);
		output = input;
	}

	private void sort(T[] input, int lo, int hi) {
		if (hi <= lo) return;
		int pivot = partition(input, lo, hi);
		sort(input, lo, pivot-1);
		sort(input, pivot+1, hi);
	}

	/**
	 * <p>Partition the input array into a[lo..i-1], a[i], a[i+1..hi]<br></p>
	 * <p>The program is going to keep a as a pivot. And, it will
	 * run two pointer, one from the left, one from the right into the middle. While the pointers
	 * do not cross each other, exchange variables that the left pointer found larger than the pivot, 
	 * and the right pointer found smaller than the pivot. <br></p>
	 * <p>For the case of <b>[c, e, g, a, b]</b>, the pivot is going to be <b>c</b>. The left pointer will point to <b>e</b>,
	 * and e is truly larger than <b>c</b>. The right pivot find <b>b</b>, which is lower than <b>c</b>. Exchange <b>e</b> with <b>b</b>.
	 * After that, both the pointers will increase. The left find <b>g</b> and right find <b>a</b>, they both satisfy the
	 * requirement. We make an exchange. Again, the pointers will increase; however, this time,
	 * they cross each other. The loop is broken. The program put the pivot in the middle and return it.<br>
	 * The resulting array is <b>[b, a, c, g, e]</b></p>
	 * 
	 * @param input an array that we want to take partition
	 * @param lo the lower bound of the array
	 * @param hi the higher bound of the array
	 * @return the index of the pivot
	 */
	private int partition(T[] input, int lo, int hi) {
		int i = lo, j = hi+1; // left and right pointers
		T v = input[lo];
		while (true) {
			while (less(input[++i], v))
				if (i == hi) break;
			while (less(v, input[--j]))
				if (j == lo) break;
			if (i >= j) // If the 2 pointers cross each other, then no other exchanges can be made.
				break;
			exchange(input, i, j);
		}
		exchange(input, lo, j);
		return j;
	}

	@Override
	public String getDescription() {
		return "Quicksort is a fast sorting algorithm, which is used not only for educational purposes, but widely applied in practice.";
	}
}
