
public class Rectangle {
	
	private int width;
	private int length;
	
	Rectangle(){
		this.width = 4;
		this.length = 13;
	}
	
	Rectangle(int width, int length){
		this.width = width;
		this.length = length;
	}
	
	public int Area() {
		return width * length;
	}
	public int Perimeter() {
		return width * 2 + length * 2;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	
}
