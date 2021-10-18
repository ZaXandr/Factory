package edu.kpi.zakharov.labs.Factory;

public class BlackTriangle extends Triangle {
	final Color color = Color.Black;

	public BlackTriangle(int a, int b, int c) {
		super(a, b, c);

	}

	public Color getColor() {
		return color;
	}

}
