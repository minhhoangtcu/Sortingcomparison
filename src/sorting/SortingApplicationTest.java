package sorting;

import java.io.IOException;

import reader.AlphanumericReader;
import reader.ReaderTest;
import sorting.algorithms.HeapSort;
import sorting.algorithms.MergeSort;
import sorting.algorithms.QuickSort;
import sorting.algorithms.SelectionSort;
import sorting.algorithms.SortingAlgorithm;
import sorting.algorithms.SortingMethod;

public class SortingApplicationTest {
	
	static SortingComparisonApp app = new SortingComparisonApp();
	
	public static void main(String[] args) throws IOException {
		app.view.setVisible(true);
		
		String pathRandom = ReaderTest.RANDOM;
		
		// 5000; Merge; Random
		SortingAlgorithm<String> sA = getSorting(SortingMethod.MERGE, pathRandom, 5000);
		printSorting(sA);
		
		// 2000; Merge; Random
		
		// 1000; Merge; Random
		size = 1000;
		app.model.setKeys(AlphanumericReader.getKeys(size, pathRandom));
		keys = app.model.getKeys();
		mS = new MergeSort<>(keys);
		System.out.println("Merge Sort");
		System.out.println("Sizes: " + size);
		System.out.print("\tCompares: " + mS.getCompares());
		System.out.print("\tMoves: " + mS.getMoves());
		
		// 100; Merge; Random
		size = 100;
		app.model.setKeys(AlphanumericReader.getKeys(size, pathRandom));
		keys = app.model.getKeys();
		mS = new MergeSort<>(keys);
		System.out.println("Merge Sort");
		System.out.println("Sizes: " + size);
		System.out.print("\tCompares: " + mS.getCompares());
		System.out.print("\tMoves: " + mS.getMoves());
		
		app.view.setLblFile(pathRandom);
	}

	public static SortingAlgorithm<String> getSorting(SortingMethod m, String path, int size) throws IOException {
		String[] keys = AlphanumericReader.getKeys(size, path);
		
		switch (m) {
		case HEAP:
			return new HeapSort<String>(keys);
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
		System.out.println(s.getSortingMethod().getName());
		System.out.println("Sizes: " + s.getLength());
		System.out.print("\tCompares: " + s.getCompares());
		System.out.print("\tMoves: " + s.getMoves());
	}

}
