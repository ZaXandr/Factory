package edu.kpi.zakharov.labs.Factory;

public class WhiteFactory implements BaseFactory {

	
	public WhiteFactory() {
	}

	@Override
	public WhiteCircle createCircle(int r) {
		return new WhiteCircle(r);
	}

	@Override
	public WhiteTriangle createTriangle(int a, int b, int c) {
		return new WhiteTriangle(a,b,c);
	}

}
