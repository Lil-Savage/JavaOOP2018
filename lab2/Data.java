class Data {
	private double max;
	private double average;
	private int num;
	public Data() {
		max = 0;
		average = 0;
		num = 0;
	}
	public void addData(double data) {
		if (num == 0) {
			num = 1;
			average = data;
			max = data;
		} else {
			average = (average * num + data) / ++num;
			if (data > max) max = data;
		}
	}
	public double getAverage() {
		return average;
	}
	public double getMax() {
		return max;
	}	
}