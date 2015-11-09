package sorting.gui.controllers;

import sorting.gui.Model;
import sorting.gui.View;

public class Controller {
	
	View view;
	Model model;
	
	public Controller(Model model, View view) {
		this.view = view;
		this.model = model;
	}
	
	public Controller(Model model) {
		this.model = model;
	}
	
	public Controller(View view) {
		this.view = view;
	}
}
