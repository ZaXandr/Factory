package edu.kpi.zakharov.labs.Factory;

public class AbstractFactory {


	public BaseFactory getFactory(Color color) {
		if (color == Color.White)
			return new WhiteFactory();
		return new BlackFactory();
	}
}
