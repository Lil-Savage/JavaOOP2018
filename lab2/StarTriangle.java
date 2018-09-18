class StarTriangle {
	private int width;
	private String triangle;
	public StarTriangle(int width) {
		this.width = width;
		triangle = "";
		int i;
		for (i = 0; i < width; i++) {
			int j;
			for (j = 0; j <= i; j++) {
				triangle += "[*]";
			}
			triangle += "\n";
		}
	}
	public String toString() {
		return triangle;
	}
}