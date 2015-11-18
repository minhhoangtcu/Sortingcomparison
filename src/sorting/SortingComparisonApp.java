/**
 * Name: Sorting Algorithms Comparison
 * Author: Minh, Hoang
 * 
 * Purpose: this program enables users to load certain files with data (keys on each line) and sort these provided data. 
 * There are three main sorting algorithms: merge sort, quick sort and heap sort. 
 * However, the program also allows user to see the performance of insertion sort, selection sort and shell sort.
 * 
 */
package sorting;

import sorting.gui.Control;
import sorting.gui.Model;
import sorting.gui.View;

public class SortingComparisonApp {
	
	Control control;
	Model model;
	View view;
	
	public static void main(String[] args) {
		SortingComparisonApp app = new SortingComparisonApp();
		app.view.setVisible(true);
	}
	
	public SortingComparisonApp() {
		model = new Model(control);
		view = new View(control);
		control = new Control(model, view);
	}

}
