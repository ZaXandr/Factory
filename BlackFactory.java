package edu.kpi.zakharov.labs.Factory;

public class BlackFactory implements BaseFactory{

	
	public BlackFactory() {
	}

	@Override
	public Circle createCircle(int r) {
		// TODO Auto-generated method stub
		return new BlackCircle(r);
	}

	@Override
	public Triangle createTriangle(int a, int b, int c) {
		// TODO Auto-generated method stub
		return new	BlackTriangle(a,b,c);
	}
	

}
