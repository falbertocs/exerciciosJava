package Entite;

public class Rectangle {
	double width;
	double heigth;
	
	public double area() {
		return width * heigth;
	}
	public double perimeter() {
		return 2 + width * heigth;
	}
	public double diagonal() {
		return  (width + heigth) - 2;
	}

}
