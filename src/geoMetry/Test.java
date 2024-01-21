package geoMetry;

public class Test {

	public static void main(String[] args) {
		Coordinate middle = new Coordinate(2, 4);
		Coordinate radiusPoint = new Coordinate(5, 2);
		Circle c = new Circle(middle, radiusPoint);
		
		double radius = c.calculateRadius(middle, radiusPoint);
        System.out.println("Der Radius des Kreises beträgt: " + radius);
        
        System.out.println("Die Fläche des Kreises beträgt: " + c.calculateArea());
        System.out.println("Der Umfang des Kreises beträgt: " + c.calculateCircumference());
	}

}
