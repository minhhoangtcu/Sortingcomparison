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
		SortingMethod[] methods = { SortingMethod.SELECTION,
				SortingMethod.MERGE,
				SortingMethod.QUICK,
				SortingMethod.HEAP,
				SortingMethod.INSERTION,
				SortingMethod.SHELL};
		
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
}
