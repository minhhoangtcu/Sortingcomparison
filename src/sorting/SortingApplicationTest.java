package sorting;

import java.io.IOException;
import reader.AlphanumericReader;
import reader.ReaderTest;
import reader.TemplateReader;
import reader.TemplateReader.Template;
import sorting.algorithms.HeapSort;
import sorting.algorithms.MergeSort;
import sorting.algorithms.QuickSort;
import sorting.algorithms.SelectionSort;
import sorting.algorithms.SortingAlgorithm;
import sorting.algorithms.SortingMethod;

public class SortingApplicationTest {
	
	static SortingComparisonApp app = new SortingComparisonApp();
	
	public static void main(String[] args) throws IOException {
		app.view.setVisible(true);
		
		int[] sizes = {100, 1000, 2000, 5000};
		String[] paths = {ReaderTest.RANDOM, ReaderTest.ASCENDING, ReaderTest.DESCENDING};
		SortingMethod[] methods = { SortingMethod.SELECTION, SortingMethod.MERGE, SortingMethod.QUICK,
				SortingMethod.HEAP };
		
//		for (SortingMethod method: methods) {
//			for (String file: paths) {
//				System.out.println(method.getName() + "| " + file);
//				for (int size: sizes) {
//					printSorting(getSorting(method, file, size));
//				}
//				System.out.println();
//			}
//		}
		
		StringBuilder builder = new StringBuilder();
		for (SortingMethod method: methods) {
			for (String file: paths) {
				builder.append(getSortingNameHTML(method, file));
				for (int size: sizes) {
					builder.append(getSortingContentHTML(getSorting(method, file, size)));
				}
			}
		}
		app.view.setPaneHTMLOutput(builder.toString());
	}

	private static String getSortingNameHTML(SortingMethod method, String file) throws IOException {
		String html = TemplateReader.read(Template.SORTING_NAME_TEMPLATE);
		String name = method.getName();
		html = html.replace("$name", name);
		html = html.replace("$file", file);
		return html;
	}

	private static SortingAlgorithm<String> getSorting(SortingMethod m, String path, int size) throws IOException {
		String[] keys = AlphanumericReader.getKeys(size, path);
		
		switch (m) {
		case HEAP:
			return new HeapSort<String>(keys);
		case INSERTION:
			return null;
		case MERGE:
			return new MergeSort<String>(keys);
		case QUICK:
			return new QuickSort<String>(keys);
		case SELECTION:
			return new SelectionSort<String>(keys);
		case SHELL:
			return null;
		default:
			return null;
		}
	}
	
//	private static void printSorting(SortingAlgorithm<?> s) {
//		System.out.println("Sizes: " + s.getLength());
//		System.out.print("\tCompares: " + s.getCompares());
//		System.out.print("\tMoves: " + s.getMoves() + "\n");
//	}

	private static String getSortingContentHTML(SortingAlgorithm<?> s) throws IOException {
		String html = TemplateReader.read(Template.CONTENT_LIST_TEMPLATE);
		int sizes = s.getLength();
		int compares = s.getCompares();
		int moves = s.getMoves();
		html = html.replace("$keys", ""+sizes);
		html = html.replace("$compares", ""+compares);
		html = html.replace("$moves", ""+moves);
		return html;
	}
}
