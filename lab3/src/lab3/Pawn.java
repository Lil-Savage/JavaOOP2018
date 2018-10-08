package lab3;

public class Pawn extends Piece {
	
	public Pawn(char c) {
		super(c);
	}
	
	public Pawn(char c, Position p) {
		super(c, p);
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if (super.isLegalMove(a, b)) {
			if (a.x == b.x) {
				if (super.getColor() == 'W') {
					if (a.y + 1 == b.y)
						return true;
					if ((a.y == 2) && (a.y + 2 == b.y))
						return true;
					
				} else {
					if (a.y - 1 == b.y)
						return true;
					if ((a.y == 7) && (a.y - 2 == b.y))
						return true;
				}
			}
		}
		return false;
	}

}
