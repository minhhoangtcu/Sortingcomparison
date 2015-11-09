package sorting.gui;

import sorting.gui.controllers.FileSelectController;

public class Control {
	
	View view;
	Model model;

	public Control(Model model, View view) {
		this.view = view;
		this.model = model;
		
		view.getBtnChooseFile().addActionListener( new FileSelectController(model, view));
		
	}

}
