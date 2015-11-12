package sorting.gui.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sorting.gui.Model;
import sorting.gui.View;

public abstract class Controller implements ActionListener {
	
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

	@Override
	public abstract void actionPerformed(ActionEvent e);
	
}
