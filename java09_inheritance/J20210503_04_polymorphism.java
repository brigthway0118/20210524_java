package java09_inheritance;

//모양 클래스
class Shape{
	private int height;
	private int width;
	
	//다형성을 위해서 메소드 작성
	void printShape() {
		System.out.println("다각형");
	}
}

//사각형 클래스
class Rectangle extends Shape{

	@Override
	void printShape() {
		System.out.println("사각형");
	}
	
}

//삼각형 클래스
class Triangle extends Shape{
	@Override
	void printShape() {
		System.out.println("삼각형");
	}
}
public class J20210503_04_polymorphism {
	public static void main(String[] args) {
		Shape rec = new Rectangle();
		rec.printShape();
		//Shape에 printShape가 없다면 컴파일 에러가 뜬다.
		//rec은 Shape 형이기때문에 rec에 Shape 함수를 못찾기 때문이다.
		//즉 다형성을 이용해서 메소드를 실행하려면 오버라이딩이 되어 있어야한다.
		//부모에 메소드가 존재해야한다.
		Shape tri = new Triangle();
		tri.printShape();
	}
	
}
