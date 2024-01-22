package geoMetry;

import java.util.ArrayList;

public class Group {
	
	public ArrayList<Shapes> shapes = new ArrayList<Shapes>();
	
	public ArrayList<Shapes> getShapes() {
		return shapes;
	}

	public void setShapes(ArrayList<Shapes> shapes) {
		this.shapes = shapes;
	}

	public void addShapes(Shapes s) {
		shapes.add(s);
	}
		
	public void removeShapes(Shapes s) {
		shapes.remove(s);
	}
	
	public double addedArea() {
		double addedArea = 0;
		for(Shapes s : shapes) {
			addedArea += s.getArea();
		}
		return addedArea;
	}
	
	public double addedCircumference() {
		double addedCircumference = 0;
		for(Shapes s : shapes) {
			addedCircumference += s.getCircumference();
		}
		return addedCircumference;
	}
	
	public void printShapes() {
		for(Shapes s : shapes) {
			System.out.println(s);
		}
	}
	
	public String toString() {
		String tmp = Shapes.class;
	}
	
}
