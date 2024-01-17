package geoMetry;

public class Rectangle extends Shapes{

	Coordinate coordinate1;
	Coordinate coordinate2;
	
	double x = this.coordinate1.getX() - this.coordinate2.getX();
	double y = this.coordinate1.getY() - this.coordinate2.getX();
	
	double circumference;
	double area;
	
	public Rectangle(Coordinate coordinate1, Coordinate coordinate2) {
		super();
		this.coordinate1 = coordinate1;
		this.coordinate2 = coordinate2;
	}
	/**
	 * calculates the circumference of the rectangle
	 */
	@Override
	public double calculateCircumference() {
		circumference = 2*x + 2*y;
		return circumference;
	}

	/**
	 * calculates the area of the rectangle
	 */
	@Override
	public double calculateArea() {
		area = x *y;
		return area;
	}
	
	

}
