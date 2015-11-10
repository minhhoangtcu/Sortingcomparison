package sorting.algorithms;

public abstract class SortingAlgorithm<T extends Comparable<T>> {
	
	protected int compares, moves;
	protected T[] output;
	protected int sortingMethod;
	
	public SortingAlgorithm() {
		compares = 0;
		moves = 0;
	}
	
	public SortingAlgorithm(T[] input) {
		compares = 0;
		moves = 0;
		sort(input);
		sortingMethod = Sort.DEFAULT;
	}
	
	protected abstract void sort(T[] input);
	public abstract String getDescription();
	
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
	
	public int getLength() {
		return output.length;
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
	public int getSortingMethod() {
		return sortingMethod;
	}
}
