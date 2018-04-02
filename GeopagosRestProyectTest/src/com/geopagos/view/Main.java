package com.geopagos.view;

import com.geopagos.model.Circle;
import com.geopagos.model.GeometricFigure;
import com.geopagos.model.Square;
import com.geopagos.model.Triangle;

/***
 * 
 * @author user A A Berlot
 * 29/03/2018
 * This is just a test start Class, index.jsp start point for the rest serv. Connetion DB required
 */

public class Main {

	public static void main(String[] args) {
		
		GeometricFigure geo1 = new Square(new Double(5),new Double(5),new Double(5),new Double(5), "Cuadrado");
		System.out.println(geo1.toString());
		
		GeometricFigure geo2 = new Circle(new Double(5), new Double(2));
		
		System.out.println(geo2.getHeight()); //(Should be null)
		System.out.println(geo2.getWidth()); //(Should be null)
	
		GeometricFigure geo3 = new Triangle(new Double(3), new Double(3), new Double(3), new Double(2), "Triangle");
		
		System.out.println(geo3.getHeight());		
	}
	
}
