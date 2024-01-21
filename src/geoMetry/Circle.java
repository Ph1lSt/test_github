package geoMetry;

public class Circle {

	Coordinate middle;
	Coordinate radiusPoint;
	
	public Circle(Coordinate middle, Coordinate radiusPoint) {
		super();
		this.middle = middle;
		this.radiusPoint = radiusPoint;
	}



	public Coordinate getMiddle() {
		return middle;
	}



	public void setMiddle(Coordinate middle) {
		this.middle = middle;
	}



	public Coordinate getRadiusPoint() {
		return radiusPoint;
	}



	public void setRadiusPoint(Coordinate radiusPoint) {
		this.radiusPoint = radiusPoint;
	}



	public double calculateRadius(Coordinate radiusPoint, Coordinate middle) {
		double radius = radiusPoint.getX() - middle.getX();
		if(radius < 0) {
			radius = radius *(-1);
		}
		return radius;
	}
}
