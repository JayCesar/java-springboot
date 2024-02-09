package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
	private Double witdh;
	private Double height;
	
	public Rectangle() {
		super();	
	}
	
	public Rectangle(Color color, Double witdh, Double height) {
		super(color);
		this.witdh = witdh;
		this.height = height;
	}
	
	public Double getWitdh() {
		return witdh;
	}

	public void setWitdh(Double witdh) {
		this.witdh = witdh;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return witdh * height;
	}
	
}
