package com.geopagos.model;

import com.geopagos.factory.GeometricFigureFactory;

/***
 * 
 * @author user A A Berlot
 * 29/03/2018
 *
 */

public abstract class GeometricFigure implements GeometricFigureFactory{

	private Double surface;
	private Double height;
	private Double width;
	private Double diameter;
	private String type;
	
	public GeometricFigure(Double surface, Double height, Double width, Double diameter, String type) {
		this.surface = surface;
		this.height = height;
		this.width = width;
		this.diameter = diameter;
		this.type = type;
	}
	
	public GeometricFigure(Double surface, Double diameter) {
		this.surface = surface;
		this.diameter = diameter;
	}

	public Double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "the surface is "+ getSurface() +", height is "+ getHeight()+ ", width is "+ getWidth()+ ", diameter is "+ getDiameter() + ", type is " + getType(); 
	}
}
