
public class Circle {
	private double radius = 0.000;
	private double diametr = 0.000;
	
	Circle(){
		this.radius = 4.3;
		this.diametr = 8.6;
	}
	
	Circle(double radius, double diametr){
		this.radius = radius;
		this.diametr = diametr;
	}
	
	public void area() {
		System.out.println("Площа кола = " + Math.pow(diametr/2, 2) * Math.PI);
	}
	
	public void length() {
		System.out.println("Довжина кола = " + radius * 2 * Math.PI);
	}
}
