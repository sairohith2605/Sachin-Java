package polymorphism;

public class Addition {

	// Constructor Overloading
	public Addition() {
		
	}
	
	public Addition(int a, int b)
	{
		this.x = a;
		this.y = b;
	}
	
	public Addition(double a, double b) {
		this.dx = a;
		this.dy = b;
	}
	
	//Method Overloading
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	
	// Below are the methods to showcase constructor overloading.
	public int addInt() {
		return this.x + this.y;
	}
	
	public double addDouble() {
		return this.dx + this.dy;
	}
	int x, y;
	double dx, dy;
}
