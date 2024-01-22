package geoMetry;

public class Triangle extends Shapes {

	Coordinate point1;
	Coordinate point2;
	Coordinate point3;
    double[] sideLengths;

    public Triangle(Coordinate point1, Coordinate point2, Coordinate point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.sideLengths = new double[] {
            calculateSide(point1, point2),
            calculateSide(point2, point3),
            calculateSide(point3, point1)
        };
    }
	
	public double calculateSide(Coordinate point1, Coordinate point2) {
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
    }

	
//	public double calculateSide(int side) {
//		switch(side) {
//		case 0 : this.sideLengths[0] = Math.sqrt(Math.pow(this.point2.getX() - this.point1.getX(), 2) +
//				Math.pow(this.point2.getY() - this.point1.getY(), 2));
//				return this.sideLengths[side];
//				
//		case 1 : this.sideLengths[1] = Math.sqrt(Math.pow(this.point3.getX() - this.point2.getX(), 2) +
//				Math.pow(this.point3.getY() - this.point2.getY(), 2));
//				return this.sideLengths[side];
//				
//		case 2 : this.sideLengths[2] = Math.sqrt(Math.pow(this.point1.getX() - this.point3.getX(), 2) +
//				Math.pow(this.point1.getY() - this.point3.getY(), 2));
//				return this.sideLengths[side];
//				
//		default : System.err.println("Fehler!"); break;
//		}
//		return this.sideLengths[side];
//		
//	}
	
	
	@Override
	public double calculateCircumference() {
		double circumference = 0;
        for (double sideLength : sideLengths) {
            circumference += sideLength;
        }
        return circumference;
		}

	@Override
	public double calculateArea() {
		double s = calculateCircumference() / 2;
        double flaeche = Math.sqrt(s * (s - sideLengths[0]) * (s - sideLengths[1]) * (s - sideLengths[2]));
        return flaeche;
		}
}
