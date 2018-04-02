package com.geopagos.model;

public class Circle extends GeometricFigure {

	public Circle(Double surface, Double diameter){
		super(surface, diameter);
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
