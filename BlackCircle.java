package edu.kpi.zakharov.labs.Factory;

public class BlackCircle extends Circle {

	final Color color = Color.Black;
	
	public BlackCircle(int r) {
		super(r);
	}

	public Color getColor() {
		return color;
	}

}
