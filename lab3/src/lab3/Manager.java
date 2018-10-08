package lab3;

public class Manager extends Employee{
	private Employee[] team;
	private int bonus;
	
	public Manager(String name, double salary, int year, String insuranceNumber, Employee[] team, int bonus) {
		super(name, salary, year, insuranceNumber);
		this.team = team;
		this.bonus = bonus;
	}
	
	public boolean equals(Manager m) {
		Employee[] temp = m.getTeam();
		int i;
		for (i = 0; i < team.length; i++)
			if (!team[i].equals(temp[i])) return false;
		
		return (m.getName().equals(getName())) && (m.getBonus() == bonus);
	}
	
	public String toString() {
		String s = super.toString();
		s += "\nTeam: ";
		int i;
		for (i = 0; i < team.length - 1; i++) {
			s += "	" + team[i].toString() + ", \n";
		}
		s += "	" + team[i].toString() + "." + "\nBonus: " + bonus;
		return s;
	}

	public Employee[] getTeam() {
		return team;
	}

	public void setTeam(Employee[] team) {
		this.team = team;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
