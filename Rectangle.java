package entities;

public class Rectangle {
	private Double width;
	private Double height;
	
	public Rectangle() {
	}
	
	public Rectangle(Double width, Double height) {
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	public double area(Double width, Double height) {
		return width * height;
	}
	
	public double perimeter(Double width, Double height) {
		return (2 * width) + (2 * height);
	}
	
	public double diagonal(Double width, Double height) {
		return Math.sqrt((width * width) + (height * height));
	}
	
	

}
