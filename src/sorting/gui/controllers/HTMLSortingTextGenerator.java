package sorting.gui.controllers;

import sorting.algorithms.Sort;
import sorting.algorithms.SortingAlgorithm;

public class HTMLSortingTextGenerator {
	
	public static <T extends Comparable<T>> String getInfo(SortingAlgorithm<T> sorting) {
		int sortingMethod = sorting.getSortingMethod();
		StringBuilder builder = new StringBuilder();
		builder.append("<h1 style='margin: 0px; text-align: center'>" + Sort.SORTING_METHODS[sortingMethod] + "</h1>");
		builder.append(String.format("<p style='text-align: center; font-style: italic; margin: 0px'>Expected compares: %s and moves: %s</p><br>", Sort.SORTING_SPEED_COMPARES[sortingMethod], Sort.SORTING_SPEED_MOVES[sortingMethod]));
		builder.append("<p>Sorted for <b>" + sorting.getLength() + "</b> keys<br>");
		builder.append("Number of comparisons:<b> " + sorting.getCompares() + "</b><br>");
		builder.append("Number of moves:<b> " + sorting.getMoves() + "</b><br>");
		return builder.toString();
	}

}
