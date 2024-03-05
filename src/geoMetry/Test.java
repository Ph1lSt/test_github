package geoMetry;

public class Test {

	public static void main(String[] args) {
		
		Coordinate c1 = new Coordinate(3, 4);
		Coordinate c2 = new Coordinate(5, 2);
		Coordinate c3 = new Coordinate(7, 3);
		
		Group g = new Group();
		
		//Circle test
		System.out.println("-----Circle testrun-----");
		Circle c = new Circle(c1, c2);
		double radius = c.calculateRadius(c1, c2);
        System.out.println("Der Radius des Kreises beträgt: " + radius);
        System.out.println("Die Fläche des Kreises beträgt: " + c.calculateArea());
        System.out.println("Der Umfang des Kreises beträgt: " + c.calculateCircumference());
		g.addShapes(c);
        
        System.out.println(" ");
        
        //Rectangle test
        System.out.println("-----Rectangle testrun-----");
        Rectangle r = new Rectangle(c1, c2);
        System.out.println("Die Fläche des Rechtecks beträgt: " + r.calculateArea());
        System.out.println("Der Umfang des Rechtecks beträgt: " + r.calculateCircumference());
        g.addShapes(r);
        
        System.out.println(" ");
        
        //Triangle test
        System.out.println("-----Triangle testrun-----");
        Triangle t = new Triangle(c1, c2, c3);
        System.out.println("Die Fläche des Dreiecks beträgt: " + t.calculateArea());
        System.out.println("Der Umfang des Dreiecks beträgt: " + t.calculateCircumference());
        System.out.println("Strecke a, b: " + t.calculateSide(c1, c2));
        System.out.println("Strecke b, c: " + t.calculateSide(c2, c3));
        System.out.println("Strecke c, a: " + t.calculateSide(c3, c1));
        g.addShapes(t);
        
        System.out.println(" ");
        
        //Group Test
        System.out.println("-----Group testrun-----");
        g.printShapes();
        System.out.println(g.addedArea());
        System.out.println(g.addedCircumference());
        g.biggestShape();
        
	}

}
