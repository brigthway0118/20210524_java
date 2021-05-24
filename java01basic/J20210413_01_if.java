package java01basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210413_01_if {

	public static void main(String[] args) {

		// 조건문 : if
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.print("두 수를 입력 : "); int num1 = sc.nextInt(); int num2 =
		 * sc.nextInt();
		 * 
		 * if (num1 > num2) { System.out.println(num1+"이 더 크다."); } else {
		 * System.out.println(num2+"이 더 크다."); }
		 */

		// 실습))등급_절대평가
//		System.out.print("점수 입력 : ");
//		int g = sc.nextInt();
//		if(g>=90)
//			System.out.println("A");
//		else if(g>=80)
//			System.out.println("B");
//		else if(g>=70)
//			System.out.println("C");
//		else if(g>=60)
//			System.out.println("D");
//		else
//			System.out.println("F");

		// 실습))등급_상대평가
//		System.out.print("전체 인원수 입력 : ");
//		double t = sc.nextDouble();
//		System.out.print("나의 등수 입력 : ");
//		int g = sc.nextInt();
//		double h = g/t;/
//		if(h<=0.15) 
//			System.out.println("A");
//		else if(h<=0.35) 
//			System.out.println("B");
//		else if(h<=0.50) 
//			System.out.println("C");
//		else
//			System.out.println("D");

//		//실습))화씨(F) <==> 섭씨(C)로 바꾸기
//		//섭씨 : (화씨온도 - 32) * 5/9
//		//화씨 : 섭씨온도 * 9/5 + 32
//		System.out.print("온도 입력 : ");
//		int input = sc.nextInt();
//		String type = sc.next();
//		//String type 은 참조변수. type은 주소를 가지고있다.
//		//따라서 type == "F"의 경우 주소값과 F를 비교하므로 False가 된다.
//		double output;
//		
//		System.out.println(input+" "+type);
//		
//		//문자열 비교시 equlas 메소드를 사용한다.
//		if(type.equals("F")) {
//			System.out.println("화씨 -> 섭씨로 바꾸기...");
//			output = (double)(input-32)*5/9;
//			System.out.println("결과값 : " + output+" C");
//			
//		} else if(type.equals("C")) {
//			System.out.println("화씨 -> 섭씨로 바꾸기...");
//			output = (double)input*9/5+32;
//			System.out.println("결과값 : " + output+" F");
//			
//		} else {
//			System.out.println("잘못된 입력.");
//		}

		// 실습)계산기
		// 10 + 20 = 30
		// 10 - 20 = -10 출력
//		System.out.print("계산식 입력 : ");
//		try {
//			int num1 = sc.nextInt();
//			String type = sc.next();
//			int num2 = sc.nextInt();
//			//System.out.println(num1 + type + num2);
//			
//			if(type.equals("+"))
//				System.out.println(num1 +" + "+ num2 + " = "+ (num1+num2));
//			else if(type.equals("-"))
//				System.out.println(num1 +" - "+ num2 + " = "+ (num1-num2));
//			else if(type.equals("*"))
//				System.out.println(num1 +" * "+ num2 + " = "+ (num1*num2));
//			else if(type.equals("/"))
//				System.out.println(num1 +" / "+ num2 + " = "+ ((double)num1/num2));
//			else
//				System.out.println("잘못된 입력.");
//			
//		}catch (InputMismatchException e){
//			System.out.println("숫자를 입력해주세요");
//		}catch (Exception e){
//			System.out.println("또 다른 오류");
//		}

		
		//실습 계산기(입력값확인)
//		System.out.print("숫자값은?");
//		System.out.println("숫자?" + sc.hasNextInt());
//		if(sc.hasNextInt()) {
//			int a = sc.nextInt();
//			System.out.println(a);
//		}else {
//			System.out.println("잘못된 숫자");
//		}
		
		//코드인스펙션(규율) : ==로 ture, false를 비교하지 않는다.
//		if(!sc.hasNextInt()) {
//			System.out.println("잘못된 숫자");
//		}else {
//			int a = sc.nextInt();
//			System.out.println(a);
//		}
		
		//실습) 아이디 / 비밀번호 체크
//		String myID = "java";
//		String myPW = "1111";
//		System.out.print("아이디를 입력 : ");
//		String inputID = sc.next();
//		if(inputID.equals(myID)) {
//			System.out.print("비밀번호를 입력 : ");
//			String inputPW = sc.next();
//			if(inputPW.equals(myPW))
//				System.out.println("로그인 성공");
//			else
//				System.out.println("비밀번호 오류");
//		}else 
//			System.out.println("아이디 오류");
		
		//실습) 전기요금 계산기1
//		System.out.print("사용량 입력 : ");
//		int usedE = sc.nextInt();
//		double pay = 0;
//		if(usedE<=200) {
//			pay = 910 + (93.8*usedE);
//			System.out.println("전기요금 : " + pay + " 원");
//		}else if(usedE<=400) {
//			pay = 1600 + (200*93.8) + ((usedE-200)*187.9);
//			System.out.println("전기요금 : " + pay + " 원");
//		}else if(usedE>400) {
//			pay = 7300 + (200*93.8) + (200*187.9) + ((usedE-400)*280.6);
//			System.out.println("전기요금 : " + pay + " 원");
//		}
		
		//실습) 전기요금 계산기2
//		int use = 401; // 사용량
//		double won;
//		double eleUse1 = 88.3; // 1단계 요금 전력량 요금
//		double eleUse2 = 182.9; // 1단계 요금 전력량 요금
//		double eleUse3 = 275.6; // 1단계 요금 전력량 요금
//		int base; // 기본요금
//		
//		if(use<=200) {
//			base = 910;
//			won = base + use * eleUse1;
//		}
//			
//		else if(use<=400) {
//			base = 1600;
//			won = base + (200 * eleUse1) + ((use-200) * eleUse2);
//		}
//			
//		else {
//			base = 7300;
//			won = base + (200 * eleUse1) + (200 * eleUse2) + ((use-400)*eleUse3);
//		}
//		
//		System.out.println("사용요금 " + won+"원");
//		System.out.println(Math.floor(won)); //버림
//		System.out.println(Math.ceil(won)); //올림
//		System.out.println(Math.round(won)); //반올림
//		
//		
//		won = Double.parseDouble(String.format("%.0f", won));
//		System.out.println("사용요금 " + won+"원");
		
		//무작위의 수 추출
		//Math.random() :  0<= 랜덤값 < 1 
		// r * (end값 - start값 + 1) + start
//		double r = Math.random();
//		System.out.println(r);
//		System.out.println((int)(r*(6-1+1)+1)); // 1~6
//		System.out.println(r*(10-5+1)+5); // 5~10
//		System.out.println(r*(20-11+1)+11); // 11~20
		
		double a = (int)(Math.random() * 6 + 1);
		double b = (int)(Math.random() * 6 + 1);
		
		System.out.println("a "+a);
		System.out.println("a "+b);
		if(a>b) {
			System.out.println("a승");
		}
		else if(b>a) {
			System.out.println("b승");
		}
		else {
			System.out.println("무승부");
		}
		
		
		
		//실습) 년을 입력받고 윤년여부 체크.
//		System.out.print("년을 입력 : ");
//		int y = sc.nextInt();
//		if(y%4==0 && y%100!=0 || y%400==0)
//			System.out.println("윤년");
//		else
//			System.out.println("평년");
		
		
	}
}
