package model;

public class Triangle {
	public Double a;
	public Double b;
	public Double c;
	
	public Triangle() {
	}
	
	public Triangle(Double a, Double b, Double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Double getC() {
		return c;
	}

	public void setC(Double c) {
		this.c = c;
	}
	
	public double Area() {
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
	}
}
