package model;

public class Objeto {
	private char c;
	private int n;
	private String s;
	private double f;
	private String s1;

	
	public Objeto(char c, int n, String s, double f, String s1) {
		super();
		this.c = c;
		this.n = n;
		this.s = s;
		this.f = f;
		this.s1 = s1;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public double getF() {
		return f;
	}

	public void setF(float f) {
		this.f = f;
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}
	

}
