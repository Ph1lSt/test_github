package geoMetry;

public class Test {

	public static void main(String[] args) {
		Coordinate c1 = new Coordinate(1, 2);
		Coordinate c2 = new Coordinate(5, 2);
		Circle c = new Circle(c1, c2);
		System.out.println("Der Radius des Kreises beträgt: " + c.calculateRadius(c1, c2));
	}

}
