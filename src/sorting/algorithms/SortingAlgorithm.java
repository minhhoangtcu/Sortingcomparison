package sorting.algorithms;

import java.util.Arrays;

public class SortingAlgorithm<T extends Comparable<T>> {
	
	protected int compares, moves;
	protected T[] output;
	
	public SortingAlgorithm() {
		compares = 0;
		moves = 0;
	}
	
	public SortingAlgorithm(T[] input) {
		compares = 0;
		moves = 0;
		sort(input);
	}
	
	protected void sort(T[] input) {
		Arrays.sort(input);
		output = input;
	}
	
	public void show() {
		for (T element: output) {
			System.out.print(element + "  ");
		}
	}
	
	protected boolean less(T a, T b) {
		compares++;
		return a.compareTo(b)<0;
	}

	protected void exchange(T[] array, int index1, int index2) {
		T temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		moves += 3;
	}
	
	public T[] getOutput() {
		return output;
	}
	public int getCompares() {
		return compares;
	}
	public int getMoves() {
		return moves;
	}
}
