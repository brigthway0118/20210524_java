package java01basic;

import java.math.BigDecimal;

public class J20210412_02_variable {
	public static void main(String[] args) {

		// 정수형 변수
		// int a; // int형 변수 a 선언
		// a = 10; //a변수 초기화
//		int a=10, b=20;
//		System.out.println(a+"+"+b+"="+ (a+b));
//		System.out.println(a+"-"+b+"="+ (a-b));
//		System.out.println(a+"*"+b+"="+ (a*b));
//		System.out.println(a+"/"+b+"="+ ((double)a/b));

//		byte b = 10;
//		System.out.println(b);
		
		//실수형
//		float f = 3.14f; // 4byte
//		double d = 3.14; // 8byte
//		System.out.println(f);
		
//		double d = 608.4 , d2 = 206.2;
//		System.out.println(d+d2);
//		System.out.printf("%.1f\n",d+d2);
		
		//정확한 계산을 해야 할 경우(돈 계산등..)
		//참조형
//		BigDecimal b1 = new BigDecimal("608.4");
//		BigDecimal b2 = new BigDecimal("206.2");
//		
//		BigDecimal result = b1.add(b2);
//		System.out.println(result);
//		
//		//문자형
//		char c  = 'a';
//		System.out.println(c);
//		char c2  = '가';
//		System.out.println(c2); //유니코드체계를 따름
//		System.out.println(c2 + 0); //44032 출력. 코드화 : 44032 = 가
		
		//논리형
//		boolean l =  true;
//		System.out.println(l);
		
		//문자열은 형이 없다
		//참조형
//		String s1 = new String("자바");
//		String s2 = "자바";
//		System.out.println(s1);
//		System.out.println(s2);
//		if(s1==s2) {
//			System.out.println("같다");
//		}else{
//			System.out.println("다르다");
//		}
		
		//형변환
		//자동형변환
		//명시적인 형변환
//		byte b = 10;
//		int a = b; // 자동형변환 int>byte
//		
//		byte c = (byte)a; // 명시적 형변환. a는 int. c는 byte.
//		
//		//상수
//		final float pi = 3.14f;
//		//pi = 5.15f; 상수는 변경 불가능.
//		System.out.println(pi);
		
	}
}
