package com.geopagos.model;

/***
 * 
 * @author user A A Berlot
 * 29/03/2018
 *
 */

public class Square extends GeometricFigure  {

	public Square(Double surface, Double height, Double width, Double diameter, String type) {
		super(surface, height, width, diameter, type);
	}

	@Override
	public Double surface() {
		// TODO Auto-generated method stub
		return getSurface();
	}

	@Override
	public Double height() {
		// TODO Auto-generated method stub
		return getHeight();
	}

	@Override
	public Double width() {
		// TODO Auto-generated method stub
		return getWidth();
	}

	@Override
	public Double diameter() {
		// TODO Auto-generated method stub
		return getDiameter();
	}
	
}
