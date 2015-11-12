package sorting;

import java.io.IOException;
import reader.AlphanumericReader;
import reader.ReaderTest;

public class SortingApplicationTest {
	
	public static void main(String[] args) throws IOException {
		SortingComparisonApp app = new SortingComparisonApp();
		app.view.setVisible(true);
		int size = 1000;
		String path = ReaderTest.RANDOM;
		app.model.setKeys(AlphanumericReader.getKeys(size, path));
		app.view.setLblFile(path);
	}

}
