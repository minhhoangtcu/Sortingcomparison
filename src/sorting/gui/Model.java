package sorting.gui;

public class Model {
	
	Control control;
	String[] keys;

	public Model(Control control) {
		this.control = control;
	}
	
	public void setKeys(String[] keys) {
		this.keys = keys;
	}

}
