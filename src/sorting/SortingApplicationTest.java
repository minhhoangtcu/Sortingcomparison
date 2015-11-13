package sorting;

import java.io.IOException;

import reader.AlphanumericReader;
import reader.ReaderTest;
import sorting.algorithms.MergeSort;
import sorting.algorithms.SortingAlgorithm;

public class SortingApplicationTest {
	
	static SortingComparisonApp app = new SortingComparisonApp();
	
	public static void main(String[] args) throws IOException {
		app.view.setVisible(true);
		
		String pathRandom = ReaderTest.RANDOM;
		
		// 5000; Merge; Random
		int size = 5000;
		app.model.setKeys(AlphanumericReader.getKeys(size, pathRandom));
		String[] keys = app.model.getKeys();
		MergeSort<String> mS = new MergeSort<>(keys);
		System.out.println("Merge Sort");
		System.out.println("Sizes: " + size);
		System.out.print("\tCompares: " + mS.getCompares());
		System.out.print("\tMoves: " + mS.getMoves());
		
		// 2000; Merge; Random
		size = 2000;
		app.model.setKeys(AlphanumericReader.getKeys(size, pathRandom));
		keys = app.model.getKeys();
		mS = new MergeSort<>(keys);
		System.out.println("Merge Sort");
		System.out.println("Sizes: " + size);
		System.out.print("\tCompares: " + mS.getCompares());
		System.out.print("\tMoves: " + mS.getMoves());
		
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

	
	
	public static void printSorting(SortingAlgorithm s, int size, String path) throws IOException {
		System.out.println(s.getSortingMethod().getName());
		System.out.println("Sizes: " + size);
		System.out.print("\tCompares: " + s.getCompares());
		System.out.print("\tMoves: " + s.getMoves());
	}

}
