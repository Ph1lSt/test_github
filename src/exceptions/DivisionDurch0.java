package exceptions;

public class DivisionDurch0 {
	

	public static void division(double x, double y){
		Division d = new Division();
		d.setX(x);
		try {
			d.setY(y);
			System.out.println("Das Ergebnis lautet: " + d.getX()/d.getY());
		} catch(DivisionByZeroException e) {
			System.out.println("Divisionen durch 0 sind nicht möglich!");
		}
	}
	public static void main(String[] args) {

		division(10, 2);
	}

}
