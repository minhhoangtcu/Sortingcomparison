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
			return "<ul><li>Number of Keys: <b>$keys</b></li><li>Number of Compares: <b>$compares</b></li><li>Number of Moves: <b>$moves</b></li></ul>";
//			htmlTemplateFile = new FileReader("templates/contentListTemplate.html");
//			break;
		case ALGORITHM_AND_DESCRIPTION:
			return "<h1 style='color: #551A8B; text-align: center'>$name</h1><div style='font-style: italic; margin: 0px'>	<p>		$description	</p><p style='text-align: center'>		Expected compares: <b>$compares</b> and moves: <b>$moves</b>	</p></div>";
//			htmlTemplateFile = new FileReader("templates/OneAlgorithm.html");
//			break;
		case SORTING_NAME_TEMPLATE:
			return "<h2 style='color: #551A8B'>$name - $file</h2>";
//			htmlTemplateFile = new FileReader("templates/sortingNameTemplate.html");
//			break;
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
