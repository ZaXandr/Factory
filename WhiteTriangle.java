package edu.kpi.zakharov.labs.Factory;

public class WhiteTriangle extends Triangle {
		final Color color = Color.White;

		public WhiteTriangle(int a, int b, int c) {
			super(a, b, c);
		}

		public Color getColor() {
			return color;
		}
		
}
