package sorting.algorithms;

public class Sort {
	
	public static final int SELECTION_SORT = 0;
	public static final int INSERTION_SORT = 1;
	public static final int SHELL_SORT = 2;
	public static final int MERGE_SORT = 3;
	public static final int QUICK_SORT = 4;
	public static final int HEAP_SORT = 5;
	public static final int DEFAULT = 6;
	public static final String[] SORTING_METHODS = { "Selection sort", "Insertion sort",
													"Shell sort", "Merge sort",
													"Quick sort", "Heap sort"};
	public static final String[] SORTING_SPEED_COMPARES = {"~(N^2)/2", "",
															"", "O(N*lg(N))",
															"", ""};
	public static final String[] SORTING_SPEED_MOVES = {"3N", "",
														"", "",
														"", ""};
	public static final String[] SORTING_SPEED_EXCHANGES = {"N", "",
															"", "",
															"", ""};

}
