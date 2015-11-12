package sorting.gui.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sorting.algorithms.MergeSort;
import sorting.algorithms.SelectionSort;
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
		default:
			break;
		}
		
		view.setPaneHTMLOutput(output);
	}

}
