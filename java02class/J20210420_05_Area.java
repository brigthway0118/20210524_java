package java02class;

//원 클래스

class Circle {
	private double r;
	private double area;

	Circle() {	};
	//반지름 : int
	Circle(int r) {
		this.r = r;
		area = areaCal(r);
	}
	//반지름 : double
	Circle(double r) {
		this.r = r;
		area = areaCal(r);
	}
	//반지름 : int 및 pi값
	Circle(int r, double pi) {
		this.r = r;
		area = areaCal(r, pi);
	}
	//반지름 : double 및 pi값
	Circle(double r, double pi) {
		this.r = r;
		area = areaCal(r, pi);
	}
	
	//게터
	double getArea() {
		return area;
	}
	//기본 pi값
	double areaCal(int r) { // 원의 넓이 계산 메소드
		return r * r * Math.PI;
	}
	double areaCal(double r) { // 원의 넓이 계산 메소드
		return r * r * Math.PI;
	}
	
	//매개변수 pi값
	double areaCal(int r, double pi) { // 원의 넓이 계산 메소드
		return r * r * Math.PI;
	}
	
	double areaCal(double r, double pi) { // 원의 넓이 계산 메소드
		return r * r * pi;
	}

}

public class J20210420_05_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(5);
		System.out.println(c1.getArea());

		Circle c2 = new Circle(5.5);
		System.out.println(c2.getArea());
		
		Circle c3 = new Circle(5.5, 3.141592);
		System.out.println(c3.getArea());


	}

}
