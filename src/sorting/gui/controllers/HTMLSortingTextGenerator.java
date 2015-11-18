package sorting.gui.controllers;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;

import sorting.algorithms.HeapSort;
import sorting.algorithms.InsertionSort;
import sorting.algorithms.MergeSort;
import sorting.algorithms.QuickSort;
import sorting.algorithms.SelectionSort;
import sorting.algorithms.ShellSort;
import sorting.algorithms.SortingAlgorithm;
import sorting.algorithms.SortingMethod;
import sorting.reader.AlphanumericReader;
import sorting.reader.TemplateReader;
import sorting.reader.TemplateReader.Template;

public class HTMLSortingTextGenerator {
	
	public static <T extends Comparable<T>> String getInfo(SortingAlgorithm<T> sorting) {
		try {
			return getOneSortingAlgorithmInfoAndStats(sorting);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static SortingAlgorithm<String> getSorting(SortingMethod m, String path, int size) throws IOException {
		String[] keys = AlphanumericReader.getKeys(size, path);
		
		switch (m) {
		case HEAP:
			return new HeapSort<String>(keys);
		case INSERTION:
			return new InsertionSort<String>(keys);
		case MERGE:
			return new MergeSort<String>(keys);
		case QUICK:
			return new QuickSort<String>(keys);
		case SELECTION:
			return new SelectionSort<String>(keys);
		case SHELL:
			return new ShellSort<String>(keys);
		default:
			return null;
		}
	}
	
	public static SortingAlgorithm<String> getSorting(SortingMethod m, String[] keys, int size) throws IOException {
		keys = Arrays.copyOfRange(keys, 0, size);
		switch (m) {
		case HEAP:
			return new HeapSort<String>(keys);
		case INSERTION:
			return new InsertionSort<String>(keys);
		case MERGE:
			return new MergeSort<String>(keys);
		case QUICK:
			return new QuickSort<String>(keys);
		case SELECTION:
			return new SelectionSort<String>(keys);
		case SHELL:
			return new ShellSort<String>(keys);
		default:
			return null;
		}
	}
	
	public static String getOneSortingAlgorithmInfoAndStats(SortingAlgorithm<?> sorting) throws IOException {
		SortingMethod method = sorting.getSortingMethod();
		String html = TemplateReader.read(Template.ALGORITHM_AND_DESCRIPTION);
		String name = (method.getName() != null) ? method.getName() : "NA";
		String description = (sorting.getDescription() != null) ? sorting.getDescription() : "NA";
		String compares = (method.getSpeed() != null) ? method.getSpeed() : "NA";
		String moves = (method.getMoves() != null) ? method.getMoves() : "NA";
		html = html.replace("$name", name);
		html = html.replace("$description", description);
		html = html.replace("$compares", compares);
		html = html.replace("$moves", moves);
		return html + getSortingContentHTML(sorting);
	}
	
	public static String getSortingNameHTML(SortingMethod method, String file) throws IOException {
		String html = TemplateReader.read(Template.SORTING_NAME_TEMPLATE);
		String name = method.getName();
		html = html.replace("$name", name);
		html = html.replace("$file", file);
		return html;
	}

	public static String getSortingContentHTML(SortingAlgorithm<?> s) throws IOException {
		String pattern = "###,###.##";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		String html = TemplateReader.read(Template.CONTENT_LIST_TEMPLATE);
		int keys = s.getLength();
		int compares = s.getCompares();
		int moves = s.getMoves();
		html = html.replace("$keys", ""+ decimalFormat.format(keys));
		html = html.replace("$compares", ""+ decimalFormat.format(compares));
		html = html.replace("$moves", ""+ decimalFormat.format(moves));
		return html;
	}
	
}
