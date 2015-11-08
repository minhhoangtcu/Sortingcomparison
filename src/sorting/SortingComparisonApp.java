package sorting;

import sorting.gui.Control;
import sorting.gui.Model;
import sorting.gui.View;

public class SortingComparisonApp {
	
	Control control;
	Model model;
	View view;
	
	public static void main(String[] args) {
		SortingComparisonApp app = new SortingComparisonApp();
		app.view.setVisible(true);
	}
	
	public SortingComparisonApp() {
		control = new Control(model, view);
		model = new Model(control);
		view = new View(control);
	}

}
