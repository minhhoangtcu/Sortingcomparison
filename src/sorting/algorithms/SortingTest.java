package sorting.algorithms;

import org.junit.Test;

public class SortingTest {

	@Test
	public void testSelectionSort() {
		System.out.print("SELECTION SORT");
		String[] input = {"d", "c", "b", "a", "e", "f"};
		SelectionSort<String> sorting = new SelectionSort<>(input);
		sorting.show();
		System.out.println("\nCompares: " + sorting.getCompares());
		System.out.print("Moves: " + sorting.getMoves());
		
		Integer[] input2 = {1, 10, 3, 4, 8, 5, 6};
		SelectionSort<Integer> sorting2 = new SelectionSort<>(input2);
		sorting2.show();
		
		String[] input3 = {"z", "z", "z", "a", "e", "a", "c", "a", "b", "y"};
		sorting = new SelectionSort<>(input3);
		sorting.show();
		
		String[] input4 = {"y", "z", "a", "b", "x", "d", "s", "a", "r", "t", "y", "u", "b", "c"};
		sorting = new SelectionSort<>(input4);
		sorting.show();
		System.out.println();System.out.println();
	}

	@Test
	public void testMergeSort() {
		System.out.print("MERGE SORT");
		String[] input = {"d", "c", "b", "a", "e", "f"};
		MergeSort<String> sorting = new MergeSort<>(input);
		sorting.show();
		System.out.println("\nCompares: " + sorting.getCompares());
		System.out.println("Moves: " + sorting.getMoves());
		System.out.println();
	}
	
	@Test
	public void testQuickSort() {
		System.out.print("QUICK SORT");
		String[] input = {"d", "c", "b", "a", "e", "f"};
		QuickSort<String> sorting = new QuickSort<>(input);
		sorting.show();
		System.out.println("\nCompares: " + sorting.getCompares());
		System.out.println("Moves: " + sorting.getMoves());
		System.out.println();
	}
	
	@Test
	public void testHeapSort() {
		System.out.print("HEAP SORT");
		String[] input = {"d", "c", "b", "a", "e", "f"};
		HeapSort<String> sorting = new HeapSort<>(input);
		sorting.show();
		System.out.println("\nCompares: " + sorting.getCompares());
		System.out.println("Moves: " + sorting.getMoves());
		System.out.println();
	}
	
	@Test
	public void testInsertionSort() {
		System.out.print("INSERTION SORT");
		String[] input = {"d", "c", "b", "a", "e", "f"};
		InsertionSort<String> sorting = new InsertionSort<>(input);
		sorting.show();
		System.out.println("\nCompares: " + sorting.getCompares());
		System.out.println("Moves: " + sorting.getMoves());
		System.out.println();
	}
	
	@Test
	public void testShellSort() {
		System.out.print("SHELL SORT");
		String[] input = {"d", "c", "b", "a", "e", "f"};
		ShellSort<String> sorting = new ShellSort<>(input);
		sorting.show();
		System.out.println("\nCompares: " + sorting.getCompares());
		System.out.println("Moves: " + sorting.getMoves());
		System.out.println();
	}
}
