package sorting.algorithms;

import org.junit.Test;

public class SortingTest {

	@Test
	public void testSelectionSort() {
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
	}

}