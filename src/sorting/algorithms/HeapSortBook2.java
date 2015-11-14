package sorting.algorithms;

public class HeapSortBook2<T extends Comparable<T>> extends SortingAlgorithm<T> {

	public HeapSortBook2(T[] input) {
		super();
		sort(input);
		sortingMethod = SortingMethod.HEAP;
	}
	
	/**
	 * <p>Sort an n element table (input[1],...input[n]) into ascending order.
	 * Sorts by turning t into a heap and repeatedly selecting its smallest
	 * element</p>
	 * <p>Algorithm implemented from Dr. Comer's pseudo code</p>
	 */
	protected void sort(T[] input) {
		int n = input.length;
		// heapify all subtrees except the subtree containing the root
		for (int i = (n / 2); i > 0; i--) {
			heapify(input, 1, i);
		}
		
		for (int i = n-1; i > 0; i--) {
			exchange(input, 1, i+1);
			heapify(input, 1, i);
		}
		
		output = input;
	}

	/**
	 * <p>Adjust the binary tree with root i to satisfy the heap property</p>
	 * <p>Algorithm implemented from Dr. Comer's pseudo code</p>
	 * @param input
	 * @param i
	 * @param i2
	 */
	private void heapify(T[] input, int i, int n) {
		boolean notFinished = true;
		T temp = input[i];
		int j = 2*i; // j points to the left child of i
		
		// move any larger child that exceeds the root key upward one level in the tree
		while ((j <= n) && notFinished) {
			// a right child of i also exists in the tree - find max of left and right child
			if (j < n)
				if (less(input[j], input[j+1])) // set j to point to the largest child
					j = j+1;
			if (!less(temp, input[j]))
				notFinished = false; // no more keys -- siftup
			else {
				input[(int) j/2] = input[j]; // move the jth key up the tree
				j = 2*j;
			}
		}
		
		input[(int) j/2] = temp; // final placement of the root key
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}
