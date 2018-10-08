package lab3;

public class Bishop extends Piece {
	
	public Bishop(char c) {
		super(c);
	}
	
	public Bishop(char c, Position p) {
		super(c, p);
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if (super.isLegalMove(a, b)) {
			if (Math.abs(a.x - b.x) == Math.abs(a.y - b.y)) {
				return true;
			}
		}
		return false;
	}

}
