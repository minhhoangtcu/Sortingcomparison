package sorting.gui.controllers;

import sorting.algorithms.SortingAlgorithm;
import sorting.algorithms.SortingMethod;

public class HTMLSortingTextGenerator {
	
	public static <T extends Comparable<T>> String getInfo(SortingAlgorithm<T> sorting) {
		SortingMethod sortingMethod = sorting.getSortingMethod();
		StringBuilder builder = new StringBuilder();
		builder.append("<h1 style='text-align: center'>" + sortingMethod.getName() + "</h1>");
		builder.append("<p style='font-style: italic; margin: 0px'>" + sorting.getDescription() + "<br>");
		builder.append(String.format("Expected compares: <b>%s</b> and moves: <b>%s</b></p><br>", sortingMethod.getSpeed(), sortingMethod.getSpeed()));
		builder.append("<p>Sorted for <b>" + sorting.getLength() + "</b> keys<br>");
		builder.append("Number of comparisons:<b> " + sorting.getCompares() + "</b><br>");
		builder.append("Number of moves:<b> " + sorting.getMoves() + "</b><br>");
		return builder.toString();
	}

}
