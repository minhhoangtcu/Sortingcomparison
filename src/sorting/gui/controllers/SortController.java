package sorting.gui.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

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
		if (view.isSizeValid()) {
			int inputSize = view.getTextFieldSize();
			if (inputSize <= model.getKeys().length) {
				String[] keys = Arrays.copyOfRange(model.getKeys(), 0, inputSize);
				SortingMethod selection = SortingMethod.valueAt(view.getSelectedSortingMethodIndex());
				String output = null;
				
				switch (selection) {
				case SELECTION:
					output = HTMLSortingTextGenerator.getInfo(new SelectionSort<>(keys));
					break;
				case MERGE:
					output = HTMLSortingTextGenerator.getInfo(new MergeSort<>(keys));
					break;
				case QUICK:
					output = HTMLSortingTextGenerator.getInfo(new QuickSort<>(keys));
					break;
				case HEAP:
					output = HTMLSortingTextGenerator.getInfo(new HeapSort<>(keys));
					break;
				case INSERTION:
					output = HTMLSortingTextGenerator.getInfo(new InsertionSort<>(keys));
					break;
				case SHELL:
					output = HTMLSortingTextGenerator.getInfo(new ShellSort<>(keys));
				default:
					break;
				}
				
				view.setPaneHTMLOutput(output);
			}
			else {
				view.setLblFeedBack("Size cannot be higher than number of keys: " + model.getKeys().length);
			}
		}
		else {
			view.setLblFeedBack("Enter Valid Size!");
		}
	}
}
