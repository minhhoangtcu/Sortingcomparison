package sorting.gui;

import sorting.gui.controllers.FileSelectController;
import sorting.gui.controllers.SortController;

public class Control {
	
	View view;
	Model model;

	public Control(Model model, View view) {
		this.view = view;
		this.model = model;
		
		view.getBtnChooseFile().addActionListener( new FileSelectController(model, view));
		view.getBtnSort().addActionListener(new SortController(model, view));
	}

}
