package sorting.gui.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sorting.algorithms.HeapSort;
import sorting.algorithms.InsertionSort;
import sorting.algorithms.MergeSort;
import sorting.algorithms.QuickSort;
import sorting.algorithms.SelectionSort;
import sorting.algorithms.ShellSort;
import sorting.algorithms.SortingMethod;
import sorting.gui.Model;
import sorting.gui.View;

public class SortController extends Controller implements ActionListener {

	public SortController(Model model, View view) {
		super(model, view);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		SortingMethod selection = SortingMethod.valueAt(view.getSelectedSortingMethodIndex());
		String output = null;
		
		switch (selection) {
		case SELECTION:
			output = HTMLSortingTextGenerator.getInfo(new SelectionSort<>(model.getKeys()));
			break;
		case MERGE:
			output = HTMLSortingTextGenerator.getInfo(new MergeSort<>(model.getKeys()));
			break;
		case QUICK:
			output = HTMLSortingTextGenerator.getInfo(new QuickSort<>(model.getKeys()));
			break;
		case HEAP:
			output = HTMLSortingTextGenerator.getInfo(new HeapSort<>(model.getKeys()));
			break;
		case INSERTION:
			output = HTMLSortingTextGenerator.getInfo(new InsertionSort<>(model.getKeys()));
			break;
		case SHELL:
			output = HTMLSortingTextGenerator.getInfo(new ShellSort<>(model.getKeys()));
		default:
			break;
		}
		
		view.setPaneHTMLOutput(output);
	}

}
