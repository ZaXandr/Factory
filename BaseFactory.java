package edu.kpi.zakharov.labs.Factory;

public interface BaseFactory {

	public Circle createCircle(int r); 
	public Triangle createTriangle(int a, int b, int c);

}
