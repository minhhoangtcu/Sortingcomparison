package sorting.gui;

public class Model {
	
	private Control control;
	private String[] keys;

	public Model(Control control) {
		this.control = control;
	}
	
	public void setKeys(String[] keys) {
		this.keys = keys;
	}
	public String[] getKeys() {
		return keys;
	}
}
