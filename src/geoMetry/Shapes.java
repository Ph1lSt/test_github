package geoMetry;
import java.util.ArrayList;

public abstract class Shapes {

	private ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
	double circumference;
	double area;
	int coordinateAmount = coordinates.size();
	
	public abstract double calculateCircumference();
	public abstract double calculateArea();
}
