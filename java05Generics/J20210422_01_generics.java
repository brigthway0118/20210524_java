package java05Generics;

//사각형
//필드 : 가로, 세로, 넓이
//Generic 타입 : 인스턴스 생성 시 타입(형)을 결정하는 법.
//관용적 표현 : T-Type, K-Key, V-Value, E-Element를 쓰지만 아무 것이나 써도 똑같다.
class Rectangle<T>{
	private T width;
	private T height;
	private double area;
	
	public Rectangle(T width, T height) {
		this.width = width;
		this.height = height;
		area = getArea(width , height);
	}

	public T getWidth() {
		return width;
	}

	public void setWidth(T width) {
		this.width = width;
	}

	public T getHeight() {
		return height;
	}

	public void setHeight(T height) {
		this.height = height;
	}

	public double getArea(T width, T height) {
		double result = 0;
		if(width instanceof Integer) { // width가 Integer 형일 경우
			result = (int)width * (int)height;
		}else if(width instanceof Double) { // width가 Double 형일 경우
			result = (double)width * (double)height;
		}
		return result;
	}


	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", area=" + area + "]";
	}
	
	
	
	
}

public class J20210422_01_generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle<Integer> r1 = new Rectangle<Integer>(5, 7);
		System.out.println(r1);
		
		Rectangle<Double> r2 = new Rectangle<Double>(5.5, 7.5);
		System.out.println(r2);
	}

}
