package sorting;

import java.io.IOException;

import reader.AlphanumericReader;
import reader.ReaderTest;
import sorting.algorithms.HeapSortBook;
import sorting.algorithms.MergeSort;
import sorting.algorithms.QuickSort;
import sorting.algorithms.SelectionSort;
import sorting.algorithms.SortingAlgorithm;
import sorting.algorithms.SortingMethod;

public class SortingApplicationTest {
	
	static SortingComparisonApp app = new SortingComparisonApp();
	
	public static void main(String[] args) throws IOException {
		app.view.setVisible(true);
		
		int[] sizes = {100, 1000, 2000, 5000};
		String[] paths = {ReaderTest.RANDOM, ReaderTest.ASCENDING, ReaderTest.DESCENDING};
		SortingMethod[] methods = {SortingMethod.INSERTION, SortingMethod.MERGE, SortingMethod.QUICK};
		
		for (SortingMethod method: methods) {
			for (String file: paths) {
				System.out.println(method.getName() + "| " + file);
				for (int size: sizes) {
					printSorting(getSorting(method, file, size));
				}
				System.out.println();
			}
		}
	}

	public static SortingAlgorithm<String> getSorting(SortingMethod m, String path, int size) throws IOException {
		String[] keys = AlphanumericReader.getKeys(size, path);
		
		switch (m) {
		case HEAP:
			return new HeapSortBook<String>(keys);
		case INSERTION:
		case MERGE:
			return new MergeSort<String>(keys);
		case QUICK:
			return new QuickSort<String>(keys);
		case SELECTION:
			return new SelectionSort<String>(keys);
		case SHELL:
		default:
			return null;
		}
	}
	
	
	public static void printSorting(SortingAlgorithm<?> s) {
		System.out.println("Sizes: " + s.getLength());
		System.out.print("\tCompares: " + s.getCompares());
		System.out.print("\tMoves: " + s.getMoves() + "\n");
	}

}
