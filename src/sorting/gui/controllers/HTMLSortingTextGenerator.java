package sorting.gui.controllers;

import sorting.algorithms.Sort;
import sorting.algorithms.SortingAlgorithm;

public class HTMLSortingTextGenerator {
	
	public static <T extends Comparable<T>> String getInfo(SortingAlgorithm<T> sorting) {
		int sortingMethod = sorting.getSortingMethod();
		StringBuilder builder = new StringBuilder();
		builder.append("<h1>" + Sort.SORTING_METHODS[sortingMethod] + "</h1><br>");
		builder.append("<b>Compares:</b> " + sorting.getCompares() + "<br>");
		builder.append("<b>Moves:</b> " + sorting.getMoves() + "<br>");
		return builder.toString();
	}

}
