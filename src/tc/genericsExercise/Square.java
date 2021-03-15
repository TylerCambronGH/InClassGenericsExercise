package tc.genericsExercise;

public class Square {
	protected int side;
	
	public Square(int side) {
		this.side = side;
	}
	
	@Override
	public String toString() {
		return "Square side: " + side;
	}
} 
