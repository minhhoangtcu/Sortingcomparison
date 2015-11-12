package sorting.gui.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sorting.algorithms.MergeSort;
import sorting.algorithms.SelectionSort;
import sorting.algorithms.Sort;
import sorting.gui.Model;
import sorting.gui.View;

public class SortController extends Controller implements ActionListener {

	public SortController(Model model, View view) {
		super(model, view);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int selection = view.getSelectedSortingMethod();
		String output = null;
		
		switch (selection) {
		case Sort.SELECTION_SORT:
			output = HTMLSortingTextGenerator.getInfo(new SelectionSort<>(model.getKeys()));
			break;
		case Sort.INSERTION_SORT:
		case Sort.SHELL_SORT:
		case Sort.MERGE_SORT:
			output = HTMLSortingTextGenerator.getInfo(new MergeSort<>(model.getKeys()));
			break;
		case Sort.QUICK_SORT:
		case Sort.HEAP_SORT:
		}
		
		view.setPaneHTMLOutput(output);
	}

}
