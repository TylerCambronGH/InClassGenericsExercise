package tc.genericsExercise;

public class FirstListSol {
	public static void main(String[] args) {
		FirstList<Square> squareList = new FirstList<Square>();
		FirstList<ThreeDPoint> threeDPointList = new FirstList<ThreeDPoint>(3);
		FirstList<String> stringList = new FirstList<String>(11);
		squareList.addItem(new Square(1));
		squareList.addItem(new Square(2));
		squareList.addItem(new Square(3));
		squareList.addItem(new Square(4));
		System.out.println(squareList.toString());
		threeDPointList.addItem(new ThreeDPoint(2, 3, 4));
		threeDPointList.addItem(new ThreeDPoint(4, 2, 4));
		threeDPointList.addItem(new ThreeDPoint(4, 2, 9));
		System.out.println(threeDPointList.toString());
		stringList.addItem("Hey");
		stringList.addItem("Hi");
		System.out.println(stringList.toString());

	}
}
