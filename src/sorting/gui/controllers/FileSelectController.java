package sorting.gui.controllers;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import reader.AlphanumericReader;
import sorting.gui.Model;
import sorting.gui.View;

public class FileSelectController extends Controller {

	public FileSelectController(Model model, View view) {
		super(model, view);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser fc = new JFileChooser();
		fc.setDialogTitle("Choose a file with keys to sort");

		int returnVal = fc.showOpenDialog(view);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fc.getSelectedFile();
			String path = selectedFile.getAbsolutePath();
			setKeysOnModel(path);
			view.setLblFile(selectedFile.getName());
			view.enableInputs();
		}
	}
	
	private void setKeysOnModel(String path) {
		String[] output;
		try {
			output = AlphanumericReader.getKeys(path);
			model.setKeys(output);
		} catch (IOException e) {
			view.setLblFeedBack("File not found!");
		}
	}
}
