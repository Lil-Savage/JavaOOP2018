package lab3;

public class Knight extends Piece {

	public Knight(char c) {
		super(c);
	}
	
	public Knight(char c, Position p) {
		super(c, p);
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if (super.isLegalMove(a, b)) {
			if ((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y) == 5) {
				return true;
			}
		}
		return false;
	}
}
