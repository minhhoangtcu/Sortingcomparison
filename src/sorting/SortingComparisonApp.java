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
		model = new Model(control);
		view = new View(control);
		control = new Control(model, view);
	}

}
