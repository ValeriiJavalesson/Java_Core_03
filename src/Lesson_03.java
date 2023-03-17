
public class Lesson_03 {

	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle();
		System.out.println("Периметр прямокутника = " + rec1.Perimeter());
		System.out.println("Площа прямокутника = " + rec1.Area());
		
		Rectangle rec2 = new Rectangle(9,2);
		System.out.println("Периметр прямокутника = " + rec2.Perimeter());
		System.out.println("Площа прямокутника = " + rec2.Area());
		
		rec2.setLength(2);
		rec2.setWidth(3);
		
		System.out.println("Периметр прямокутника = " + rec2.Perimeter());
		System.out.println("Площа прямокутника = " + rec2.Area());
		
		Circle cir1 = new Circle(3.3, 6.6);
		
		cir1.area();
		cir1.length();
	}

}
