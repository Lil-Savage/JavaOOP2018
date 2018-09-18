class Time {
	int hour, minute, second;
	public Time(int hour, int minute, int second) {
		correct(hour, minute, second);
	}

	private void correct(int hour, int minute, int second) {
		int tm = 0, th = 0;
		
		tm = second / 60;
		this.second = second % 60;
		
		th = (minute + tm) / 60;
		this.minute = (minute + tm) % 60;
		this.hour = (hour + th) % 24;
	}

	public void add(Time temp) {
		correct(this.hour + temp.hour, this.minute + temp.minute, this.second + temp.second);
	}

	public static void add(Time temp1, Time temp2) {
		temp1.add(temp2);
	}

	public String toUniversal() {
		String s = "";
		if (hour < 10) s += "0";
		s += hour + ":";
		if (minute < 10) s += "0";
		s += minute + ":";
		if (second < 10) s += "0";
		s += second;
		return s;
	}

    public String toStandard() {
		boolean flag = false;
		String s = "";
		if (hour < 10) s += "0";
		if (hour > 11) {
			s += hour % 12 + ":";
			flag = true;
		} else
			s += hour + ":";
		if (minute < 10) s += "0";
		s += minute + ":";
		if (second < 10) s += "0";
		s += second;
		if (flag) s += " PM"; else s += " AM";
		return s;
	}                    
}