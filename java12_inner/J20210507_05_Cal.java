package java12_inner;

interface Cal{
	int add(int a, int b);
//	int sub(int a, int b);
}

public class J20210507_05_Cal {

	public static void main(String[] args) {
		//익명클래스
		
		Cal cal1 = new Cal(){
			@Override
			public int add(int a, int b) {
				return a+b;
			}
//			@Override
//			public int sub(int a, int b) {
//				return a-b;
//			}
		};
		
		System.out.println("더하기 : " + cal1.add(5, 2));
		//System.out.println("빼기 : " + cal1.sub(3, 1));
		
		Cal cal2 = (a,b) -> a+b; // 람다식. 한 개의 추상메소드만 가지고 있어야한다.
		//Cal에 있는 함수에 (a,b)매개변수 a,b를 넘겨주고 a+b를 return받는다.
		
		System.out.println(cal2.add(10, 20));
	}

}
