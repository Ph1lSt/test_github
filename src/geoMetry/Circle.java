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

	
	public double calculateRadius(Coordinate middle, Coordinate radiusPoint) {
        double radius = Math.sqrt(Math.pow(radiusPoint.getX() - middle.getX(), 2) +
					Math.pow(radiusPoint.getY() - middle.getY(), 2));

        return radius;
    }
}
