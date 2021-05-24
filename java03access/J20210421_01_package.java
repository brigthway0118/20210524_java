package java03access;

import java02class.Bank;

public class J20210421_01_package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		System.out.println(test.getA());
		
		//java02class.Bank b1 = new java02class.Bank("국제통장", "1234-5678");
		
		//접근제어자. public > protected > default > private
		//클래스는 public, default만 가능하다.
		//public : 모든 클래스가 접근 가능
		//protected : 같은 패키지 + 자식클래스 허용
		//default(접근제어자 생략) : 같은 패키지 내에서만 접근 가능
		//private : 자신의 클래스 내부에서만 접근가능
		Bank b1 = new Bank("국제통장", "11-22-33");
		
	}

}
