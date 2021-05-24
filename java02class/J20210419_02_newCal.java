package java02class;

//결과값이 저장되는 계산기
class NewCal{
	//필드:maker, result(결과값)
	String maker = "국제계산기V2";
	double result;
	
	
	//메소드 : 결과값에 값을 기능
	void add(double a) {
		result = result + a;
	}
	//오버로딩 : 메소드의 이름은 같지만 매개변수의 개수나 형이 다른경우.
	double add(double a, double b) {
		return a+b;
	}
	void add(int a) {
		result = result + a;
	}
	
	
	void sub(double a) {
		result = result - a;
	}
	void mul(double a) {
		result = result * a;
	}
	void div(double a) {
		result = result / a;
	}
}
public class J20210419_02_newCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewCal nc1 = new NewCal();
//		System.out.println(nc1.result);
//		nc1.add(10);
//		System.out.println(nc1.result);
//		nc1.sub(3);
//		System.out.println(nc1.result);
//		nc1.mul(6.6);
//		System.out.println(nc1.result);
//		nc1.div(5.2);
//		System.out.println(nc1.result);
		nc1.add(20,10);
		nc1.add(100); // int형 실행
		nc1.add(100.12); // double형 실행
	}

}
