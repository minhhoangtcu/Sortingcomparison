package sorting;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import datasets.Data;
import sorting.algorithms.SortingMethod;
import sorting.gui.controllers.HTMLSortingTextGenerator;

public class SortingApplicationTest {
	
	static SortingComparisonApp app = new SortingComparisonApp();
	
	public static void main(String[] args) throws IOException {
		app.view.setVisible(true);
		
		int[] sizes = {100, 1000, 2000, 5000};
		Map<String, String[]> keys = new HashMap<>();
		keys.put("Random" , Data.RAN_KEYS);keys.put("Ascending", Data.ASC_KEYS); keys.put("Descending", Data.DES_KEYS);  
		
		SortingMethod[] methods = { SortingMethod.SELECTION,
				SortingMethod.MERGE,
				SortingMethod.QUICK,
				SortingMethod.HEAP,
				SortingMethod.INSERTION,
				SortingMethod.SHELL};
		
		StringBuilder builder = new StringBuilder();
		builder.append("<div style='text-align: right; font-style: italic'>Results for initially testing 3 files</div>");
		for (SortingMethod method: methods) {
			for (Entry<String, String[]> entry: keys.entrySet()) {
				builder.append(HTMLSortingTextGenerator.getSortingNameHTML(method, entry.getKey()));
				for (int size: sizes) {
					builder.append(HTMLSortingTextGenerator.getSortingContentHTML(HTMLSortingTextGenerator.getSorting(method, entry.getValue(), size)));
				}
			}
		}
		app.view.setPaneHTMLOutput(builder.toString());
	}
}
