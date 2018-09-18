class Student {
	private String name;
	private int id;
	private int year_of_study = 1;
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void incYear() {
		year_of_study++;
	}
}