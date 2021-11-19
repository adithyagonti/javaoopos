package com.adithya.shape;

public class main {

	public static void main(String[] args) {
		Shape myShape = new Shape(); 

		Shape myCircle = new Circle(); 
		Shape myTriangle = new Triangle();
		Shape mySquare = new Square();

		myShape.area();
		myCircle.area();
		myShape.perimeter();
		myCircle.perimeter();
		System.out.println("******************************************");
		myShape.area();
		myTriangle.area();
		myShape.perimeter();
		myTriangle.perimeter();
		System.out.println("******************************************");
		myShape.area();
		mySquare.area();
		myShape.perimeter();
		mySquare.perimeter();

	}
}
