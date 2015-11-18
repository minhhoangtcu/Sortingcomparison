package sorting.reader;

import java.io.IOException;

import org.junit.Test;

public class ReaderTest {
	
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
