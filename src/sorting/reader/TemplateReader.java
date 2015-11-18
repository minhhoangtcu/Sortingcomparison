package sorting.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TemplateReader {
	
	public enum Template {
		CONTENT_LIST_TEMPLATE,
		SORTING_NAME_TEMPLATE,
		ALGORITHM_AND_DESCRIPTION;
	}
	
	public static String read(Template type) throws IOException {
		FileReader htmlTemplateFile;
		switch (type) {
		case CONTENT_LIST_TEMPLATE:
			htmlTemplateFile = new FileReader("templates/contentListTemplate.html");
			break;
		case ALGORITHM_AND_DESCRIPTION:
			htmlTemplateFile = new FileReader("templates/OneAlgorithm.html");
			break;
		case SORTING_NAME_TEMPLATE:
			htmlTemplateFile = new FileReader("templates/sortingNameTemplate.html");
			break;
		default:
			htmlTemplateFile = null;
		}
		return getContent(htmlTemplateFile);
	}
	
	private static String getContent(FileReader file) throws IOException {
		BufferedReader reader = new BufferedReader(file);
		StringBuilder builder = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			builder.append(line + "\n");
		}
		return builder.toString();
	}
	

}
