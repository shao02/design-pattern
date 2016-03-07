package com.factory;

public class Test {
	public static void main(String[] args){
		ShapeFactory sampleShapeFactory = new ShapeFactory();
		Shape newShape = sampleShapeFactory.getShape("circle");
		newShape.draw();
	}
}
