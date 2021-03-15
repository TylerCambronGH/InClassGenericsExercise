package tc.genericsExercise;

public class ThreeDPoint {
	protected int x,y,z;
	public ThreeDPoint(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		return "3D Point x"+x+" y"+y+" z"+z;
	}
}
