package edu.kpi.zakharov.labs.Factory;

public class Main {
	public static void main(String[] args) {
		var factory = new AbstractFactory();
		var whiteFactory = factory.getFactory(Color.White);
		var blackFactory = factory.getFactory(Color.Black);
		var circle = whiteFactory.createCircle(10);
		var triangle = blackFactory.createTriangle(3, 4, 5);
		
		System.out.print(circle.getSquare()+ " ");
		System.out.println(((WhiteCircle)circle).getColor());
		
		System.out.print(triangle.getSquare()+ " ");
		System.out.println(((BlackTriangle)triangle).getColor());
	
	
	}

}
