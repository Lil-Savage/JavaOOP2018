package lab3;

public class Queen extends Piece {
	
	public Queen(char c) {
		super(c);
	}
	
	public Queen(char c, Position p) {
		super(c, p);
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if (super.isLegalMove(a, b)) {
			if (Math.abs(a.x - b.x) == Math.abs(a.y - b.y)) {
				return true;
			} else
				if ((a.x == b.x) || (a.y == b.y)) {
					return true;
				}
		}
		return false;
	}

}
