package java02class;

public class J20210421_03_Calculator {
	public static final String maker = "국제 계산기";
	private int result;
	private boolean light;
	
	//두 수의 합을 반환하는 함수
	//static 함수는 처음 메모리에 올라간다. 하지만 result에 static이 없을경우 result가 같이 올라가지 못하여 오류가 생성.
	//따라서 같이 메모리에 올릴수 있도록 result에도 static을 붙여줘야한다.
	//즉 static 메소드 안에서는 static필드만 사용가능!
	static int add(int a, int b) {
		return a+b;
	}
	int add(int a) {
		this.result += a;
		return result;
	}

	static String getMaker() {
		return "["+maker+"]";
	}
	
	
	void togglePower() {
		light = !light;
		System.out.println(light);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(cal.sum(20, 10));
		System.out.println(J20210421_03_Calculator.getMaker());
		System.out.println(J20210421_03_Calculator.add(10,20));//객체생성 안하고 클래스. 하면 static만 접근 가능!
		
		J20210421_03_Calculator cal = new J20210421_03_Calculator();
		cal.togglePower();
		
	}

}
