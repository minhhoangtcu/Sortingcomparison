package sorting.algorithms;

import java.util.Arrays;

public class HeapSort<T extends Comparable<T>> extends SortingAlgorithm<T> {

	public HeapSort(T[] input) {
		super();
		T[] temp = moveArrayToRight(input);
		sort(temp);
		sortingMethod = SortingMethod.HEAP;
	}
	
	public HeapSort() {}
	
	@SuppressWarnings("unchecked")
	public T[] moveArrayToRight(T[] input) {
		T[] temp = (T[]) new Comparable[input.length+1];
		temp[0] = null;
		for (int i = 0; i < input.length; i++) {
			temp[i+1] = input[i];
		}
		return temp;
	}
	
	/**
	 * <p>Sort an n element table (input[1],...input[n]) into ascending order.
	 * Sorts by turning t into a heap and repeatedly selecting its smallest
	 * element</p>
	 * <p>Algorithm implemented from Dr. Comer's pseudo code</p>
	 */
	protected void sort(T[] input) {
		int n = input.length-1; // Heap size (not array size)
		// heapify all subtrees except the subtree containing the root
		for (int i = (n / 2); i >= 1; i--) {
			heapify(input, i, n);
		}
		
		for (int i = n-1; i >= 1; i--) {
			exchange(input, 1, i+1);
			heapify(input, 1, i);
		}
		
		output = Arrays.copyOfRange(input, 1, input.length);
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
			if (j < n) // that is, exists a right child
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
