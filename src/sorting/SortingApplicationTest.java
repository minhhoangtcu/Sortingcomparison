package sorting;

import java.io.IOException;

import reader.ReaderTest;
import sorting.algorithms.SortingMethod;
import sorting.gui.controllers.HTMLSortingTextGenerator;

public class SortingApplicationTest {
	
	static SortingComparisonApp app = new SortingComparisonApp();
	
	public static void main(String[] args) throws IOException {
		app.view.setVisible(true);
		
		int[] sizes = {100, 1000, 2000, 5000};
		String[] paths = {ReaderTest.RANDOM, ReaderTest.ASCENDING, ReaderTest.DESCENDING};
		SortingMethod[] methods = { SortingMethod.SELECTION, SortingMethod.MERGE, SortingMethod.QUICK,
				SortingMethod.HEAP };
		
//		for (SortingMethod method: methods) {
//			for (String file: paths) {
//				System.out.println(method.getName() + "| " + file);
//				for (int size: sizes) {
//					printSorting(getSorting(method, file, size));
//				}
//				System.out.println();
//			}
//		}
		
		StringBuilder builder = new StringBuilder();
		for (SortingMethod method: methods) {
			for (String file: paths) {
				builder.append(HTMLSortingTextGenerator.getSortingNameHTML(method, file));
				for (int size: sizes) {
					builder.append(HTMLSortingTextGenerator.getSortingContentHTML(HTMLSortingTextGenerator.getSorting(method, file, size)));
				}
			}
		}
		app.view.setPaneHTMLOutput(builder.toString());
	}
	
//	private static void printSorting(SortingAlgorithm<?> s) {
//		System.out.println("Sizes: " + s.getLength());
//		System.out.print("\tCompares: " + s.getCompares());
//		System.out.print("\tMoves: " + s.getMoves() + "\n");
//	}

	
}
