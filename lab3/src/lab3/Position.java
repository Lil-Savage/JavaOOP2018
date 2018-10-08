package lab3;

public class Position {
	public int x;
	public int y;
	
	public Position(char x, int y) {
		this.x = x - 64;
		this.y = y;
	}
}
