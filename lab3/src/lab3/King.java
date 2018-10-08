package lab3;

public class King extends Piece {
	
	public King(char c) {
		super(c);
	}
	
	public King(char c, Position p) {
		super(c, p);
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if (super.isLegalMove(a, b)) {
			int temp = (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y);
			if ((temp == 1) || (temp == 2)) {
				return true;
			}
		}
		return false;
	}

}
