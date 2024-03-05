package geoMetry;
import java.util.ArrayList;

<<<<<<< HEAD
public abstract class Shapes extends Coordinate {
	
	
	public Shapes(double x, double y) {
		super(x, y);
	}
	
	private ArrayList<Coordinate> coordinates;
	double circumference;
	double area;
	int coordinateAmount = coordinates.size();
=======
public abstract class Shapes {
	
	private ArrayList<Shapes> shapes;
	private double circumference;
	private double area;
	public String shapeName;
	
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
>>>>>>> branch 'master' of https://github.com/Ph1lSt/test_github.git
	
	public abstract double calculateCircumference();
	public abstract double calculateArea();
<<<<<<< HEAD
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
	public int getCoordinateAmount() {
		return coordinateAmount;
	}
	public void setCoordinateAmount(int coordinateAmount) {
		this.coordinateAmount = coordinateAmount;
	}
	
	
=======
	
	public ArrayList<Shapes> getShapes() {
		return shapes;
	}
	public void setShapes(ArrayList<Shapes> shapes) {
		this.shapes = shapes;
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
>>>>>>> branch 'master' of https://github.com/Ph1lSt/test_github.git
}
