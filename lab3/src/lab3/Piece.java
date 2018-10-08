package lab3;

public abstract class Piece {
	private Position p;
	private char color;
	
	public Piece(char c) {
		p = null;
		color = c;
	}
	
	public Piece(char c, Position p) {
		this.p = p;
		color = c;
	}

	public Position getP() {
		return p;
	}

	public void setP(Position p) {
		this.p = p;
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if ((0 < a.x) && (0 < b.x) && (0 < a.y) && (0 < b.y) && 
				(a.x < 9) && (b.x < 9) && (a.y < 9) && (b.y < 9)) return true;
		return false;
	}

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}
}
