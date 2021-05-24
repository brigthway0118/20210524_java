package java02class;

class Cal{
	//속성 : 필드
	String maker = "국제계산기"; // 초기화 설정하지않으면 null
	
	//기능 : 메소드
	int add(int a, int b) {//더하기 : 더한 값을 리턴
		int r = a+b;//r은 지역변수
		return r;
	}
	
	int sub(int a, int b) {
		return a - b;
	}
	int mul(int a, int b) {
		return a * b;
	}
	double div(int a, int b) {
		return (double)a / b;
	}
	
}
public class J20210419_01_Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c1 = new Cal();
		System.out.println(c1.maker);
		int a = 20, b=3;
		int r = c1.add(a,b);
		System.out.println("더하기 : " + r);
		System.out.println("빼  기 : " + c1.sub(a,b));
		System.out.println("곱하기 : " + c1.mul(a,b));
		System.out.println("나누기 : " + c1.div(a,b));
		
		
	}
}
