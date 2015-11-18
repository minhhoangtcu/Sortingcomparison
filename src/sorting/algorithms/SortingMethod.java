package sorting.algorithms;

public enum SortingMethod {
	SELECTION("Selection sort", "N^2/2", "3N", "N"), 
	INSERTION("Insertion sort", "N^2/4", "(3/4)*N^2", "N^2/4"), 
	SHELL("Shell sort", "N*lg(N) to N^2"), 
	MERGE("Merge sort", "O(N*lg(N))"), 
	QUICK("Quick sort", "~2N*lnN", "N*lnN","~(N*lnN)/3"), 
	HEAP("Heap sort", "O(N*lg(N))");

	String name, speed, moves, exchanges;

	private SortingMethod(String name, String speed, String moves, String exchanges) {
		this.name = name;
		this.speed = speed;
		this.moves = moves;
		this.exchanges = exchanges;
	}
	
	private SortingMethod(String name, String speed) {
		this.name = name;
		this.speed = speed;
	}

	private SortingMethod(String name) {
		this.name = name;
	}

	private SortingMethod() {
	}
	
	public static SortingMethod valueAt(int index) {
		return SortingMethod.values()[index];
	}
	public static String[] getAllNames() {
		String[] output = new String[SortingMethod.values().length];
		int i = 0;
		for (SortingMethod method: SortingMethod.values()) {
			output[i++] = method.getName();
		}
		return output;
	}
	public String getSpeed() {
		return speed;
	}
	public String getName() {
		return name;
	}
	public String getMoves() {
		return moves;
	}
	public String getExchanges() {
		return exchanges;
	}
}
