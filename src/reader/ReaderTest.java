package reader;

import java.io.IOException;

import org.junit.Test;

public class ReaderTest {
	
	public static final String ASCENDING = "Ascending.dat";
	public static final String DESCENDING = "Descending.dat";
	public static final String RANDOM = "Random.dat";

	@Test
	public void testReader() {
		try {
			for (String key: AlphanumericReader.getKeys(10, ASCENDING)) {
				System.out.println(key);
			}
		} catch (IOException e) {
			System.err.println("FILE PATH NOT FOUND");
		}
	}

}
