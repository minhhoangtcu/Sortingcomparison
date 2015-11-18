/**
 * Run this class if you want to test out the program, else run SortingComparisonApp
 */
package sorting;

import java.io.IOException;
import reader.AlphanumericReader;
import sorting.algorithms.SortingMethod;
import sorting.gui.controllers.HTMLSortingTextGenerator;

public class SortingApplicationTest {
	
	static SortingComparisonApp app = new SortingComparisonApp();
	
	public static void main(String[] args) throws IOException {
		app.view.setVisible(true);
		
		int[] sizes = {100, 1000, 2000, 5000};
		String[] paths = {AlphanumericReader.RANDOM, AlphanumericReader.ASCENDING, AlphanumericReader.DESCENDING};
		SortingMethod[] methods = { SortingMethod.SELECTION,
				SortingMethod.MERGE,
				SortingMethod.QUICK,
				SortingMethod.HEAP,
				SortingMethod.INSERTION,
				SortingMethod.SHELL};
		
		StringBuilder builder = new StringBuilder();
		builder.append("<div style='text-align: right; font-style: italic'>Results for initially testing 3 files</div>");
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
