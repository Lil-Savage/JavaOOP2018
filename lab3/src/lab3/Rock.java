package lab3;

public class Rock extends Piece {

	public Rock(char c) {
		super(c);
	}
	
	public Rock(char c, Position p) {
		super(c, p);
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if (super.isLegalMove(a, b)) {
			if ((a.x == b.x) || (a.y == b.y)) {
				return true;
			}
		}
		return false;
	}
}
