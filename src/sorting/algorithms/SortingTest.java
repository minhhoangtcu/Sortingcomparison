package sorting.algorithms;

import org.junit.Test;

public class SortingTest {

	@Test
	public void testSelectionSort() {
		System.out.println("SELECTION SORT");
		String[] input = {"d", "c", "b", "a", "e", "f"};
		SelectionSort<String> sorting = new SelectionSort<>(input);
		sorting.show();
		System.out.println("\nCompares: " + sorting.getCompares());
		System.out.println("Moves: " + sorting.getMoves());
		
		System.out.println("\n*****");
		Integer[] input2 = {1, 10, 3, 4, 8, 5, 6};
		SelectionSort<Integer> sorting2 = new SelectionSort<>(input2);
		sorting2.show();
		
		System.out.println("\n*****");
		String[] input3 = {"z", "z", "z", "a", "e", "a", "c", "a", "b", "y"};
		sorting = new SelectionSort<>(input3);
		sorting.show();
		
		System.out.println("\n*****");
		String[] input4 = {"y", "z", "a", "b", "x", "d", "s", "a", "r", "t", "y", "u", "b", "c"};
		sorting = new SelectionSort<>(input4);
		sorting.show();
		System.out.println();
	}

	@Test
	public void testMergeSort() {
		System.out.println("MERGE SORT");
		String[] input = {"d", "c", "b", "a", "e", "f"};
		MergeSort<String> sorting = new MergeSort<>(input);
		sorting.show();
		System.out.println("\nCompares: " + sorting.getCompares());
		System.out.println("Moves: " + sorting.getMoves());
		System.out.println();
	}
	
	@Test
	public void testQuickSort() {
		System.out.println("QUICK SORT");
		String[] input = {"d", "c", "b", "a", "e", "f"};
		QuickSort<String> sorting = new QuickSort<>(input);
		sorting.show();
		System.out.println("\nCompares: " + sorting.getCompares());
		System.out.println("Moves: " + sorting.getMoves());
		System.out.println();
	}
	
	@Test
	public void testHeapSort() {
		System.out.println("HEAP SORT");
		String[] input = {"d", "c", "b", "a", "e", "f"};
		HeapSort<String> sorting = new HeapSort<>(input);
		sorting.show();
		System.out.println("\nCompares: " + sorting.getCompares());
		System.out.println("Moves: " + sorting.getMoves());
		System.out.println();
	}
}
