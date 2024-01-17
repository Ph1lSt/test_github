package geoMetry;

public class Rectangle extends Shapes{

	Coordinate coordinate1;
	Coordinate coordinate2;
	
	double circumference;
	
	public Rectangle(Coordinate coordinate1, Coordinate coordinate2) {
		super();
		this.coordinate1 = coordinate1;
		this.coordinate2 = coordinate2;
	}

	@Override
	public double calculateCircumference() {
		return 0;
	}

	@Override
	public double calculateArea() {
		double x = this.coordinate1.getX() - this.coordinate2.getX();
		double y = this.coordinate1.getY() - this.coordinate2.getX();
		circumference = x *y;
		return circumference;
	}
	
	

}
