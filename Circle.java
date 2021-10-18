package edu.kpi.zakharov.labs.Factory;

public class Circle {
	int r;

	public Circle(int r) {
		this.r = r;
	}

	public double getSquare() {
		return 3.14 * r * r;
	}

	public double getPerimeter() {
		return 2 * 3.14 * r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
}
