package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AlphanumericReader {

	/**
	 * 
	 * @param size
	 * @param path
	 * @return
	 * @throws IOException 
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
