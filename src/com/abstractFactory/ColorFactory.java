package com.abstractFactory;

public class ColorFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		if(color == "Yellow")
			return new Yellow();
		else if(color == "Green")
			return new Green();
		else 
			return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
}
