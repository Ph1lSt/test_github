package geoMetry;
import java.util.ArrayList;

public abstract class Shapes {
	
	private ArrayList<Coordinate> coordinates;
	double circumference;
	double area;
	
	public abstract double calculateCircumference();
	public abstract double calculateArea();
	public ArrayList<Coordinate> getCoordinates() {
		return coordinates;
	}
	
	public void setCoordinates(ArrayList<Coordinate> coordinates) {
		this.coordinates = coordinates;
	}
	public double getCircumference() {
		return circumference;
	}
	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
}
