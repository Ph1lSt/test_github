package exceptions;

public class Division {
	
	private double x;
	private double y;
	
	public Division(double x, double y){
		this.setX(x);
		this.setY(y);
	}
	
	public Division() {}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		if(y != 0) {
			this.y = y;
		}else {
			throw new DivisionByZeroException();
		}
	}
}

