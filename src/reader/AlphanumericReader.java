package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AlphanumericReader {

	/**
	 * <p>Take a file path and the number of lines to read. Then, the program will return
	 * an array containing all the keys(lines). 
	 * @param size number of keys/lines the method is going to read from the file
	 * @param path path to the file
	 * @return an array containing all the keys 
	 * @throws IOException error indicating that the method cannot find the file with the provided path
	 */
	public static String[] getKeys(int size, String path) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String line;
		String[] output = new String[size];
		int i = 0;
		while (((line = reader.readLine()) != null) && (i < size)) {
			output[i] = line.trim();
			i++;
		}
		reader.close();
		return output;
	}
	
}
