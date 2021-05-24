package java04Type;

public class J20210421_01_wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//래퍼(wrapper) 클래스
//		int a = 10;
//		System.out.println(String.valueOf(a)+100); // 10100출력. a가 String형으로 변형됐다.
//
//		// 기본형 끼리는 (int), (double)같은 형변환 연산자로 형 변환이 가능하지만
//		// 문자열은 참조형이라 형변환 연산자가 아니라 wrapper클래스 함수를 이용해야한다.
//		//Integer, Double, Character, String 등을 wrapper 클래스라고한다.
//		String s = "10";
//		System.out.println(s+100); // 10100
//		
//		System.out.println(Integer.parseInt(s)+100); // 110  // parseInt는 int형 반환
//		System.out.println(Integer.valueOf(s)+100); // 110 // valueOf는 Integer형(wrapper클래스) 반환
//		
//		Integer b = 10; // 객체를 만들고 필드값으로 10을 넣는다.
//		//int c = 10; // 기본형으로 만든다
//		int c = b; // 자동 형변환되어 int형에 대입가능.
//		//b는 b.으로 메소드 사용가능. c는 기본형이라 c.이 불가능.
//		System.out.println(b+c);
		
		Integer a = 10;
		Integer c = new Integer(10); // 줄이 그어질 경우 되도록 사용하지 않는다. 향후 호환성 문제 발생 가능성O
		
		System.out.println(c);
		
		int b = a; // 오토박싱(int -> Integer), 언박싱(Integer -> int)
		System.out.println(a+b);
		
		
		//2진수 변환
//		int a = 5;
//		System.out.println(Integer.toBinaryString(a)); // 101
		
//		//Boolean 클래스
//		String s = "trUe";
//		System.out.println(Boolean.parseBoolean(s)); // true
		

	}

}
