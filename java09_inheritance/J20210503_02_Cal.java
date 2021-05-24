package java09_inheritance;

//부모클래스. 사칙연산
class Cal{
	private String color;
	protected int result;
	//부모클래스의 생성자를 자식 클래스에서 실행
	Cal(String color){
		this.color = color;
	}
	
	
	public int getResult() {
		return result;
	}


	public void setResult(int result) {
		this.result = result;
	}


	public String getColor() {
		return color;
	}
	double add(double a, double b){
		return a+b;
	}
	double sub(double a, double b) {
		return a-b;
	}
	double mul(double a, double b) {
		return a*b;
	}
	double div(double a, double b) {
		return a/b;
	}
}

//자식클래스
//나머지 및 제곱
class NewCal extends Cal{
	private int result;
	NewCal(String color) {
		super(color);//부모클래스의 생성자를 실행. -> 부모생성자에 color를 넣는다.
		//super() <- 부모클래스의 생성자를 의미. 
		// TODO Auto-generated constructor stub
	}
	double remainder(double a, double b) {
		return a%b;
	}
	int add(int a) {
		result += a;
		return result;
	}
	double square(double a, double b) {
		double sum = a;
		for(int i=1; i<b; i++) {
			sum = sum*a;
		}
		return sum;
	}
}

public class J20210503_02_Cal {

	public static void main(String[] args) {
		NewCal c = new NewCal("빨강");
		System.out.println(c.getColor()+" 계산기");
		System.out.println("Cal 더하기 : "+c.add(3, 2));
		System.out.println("NewCal 더하기 : "+c.add(10));
		System.out.println("NewCal 더하기 : "+c.add(20));
		System.out.println(c.getResult());
//		System.out.println(c.sub(1, 2));
//		System.out.println(c.mul(3, 2));
//		System.out.println(c.div(10, 5));

//		System.out.println(c.remainder(5, 2));
//		System.out.println(c.square(2, 10));
	}

}
