package java01basic;

import java.util.Scanner;

public class J20210412_04_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 사용자에게 입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int a = sc.nextInt();
//		System.out.println("입력받은 값은 " +a);

		// 반지름을 입력받아 원의 넓이 구하기

//		System.out.print("반지름 입력 : ");
//		double r = sc.nextDouble();
//		//Math.PI = 원주율
//		System.out.printf("원의넓이는 %.2f입니다.", r * r * Math.PI );

		// int double char, float 등은 일반형.
		// String은 참조형이다. .으로 들어가서 함수 사용가능.
		// 참조형 = c언어의 포인터처럼 주소값을 가지고 있다.
//		System.out.print("이름 입력 : ");
//		//String s1 = sc.next(); //공백을 기준으로 출력. 홍 길동 -> 홍 출력
//		String s1 = sc.nextLine(); // 엔터를 기준으로 출력 홍 길동->홍 길동 출력
//		System.out.println("입력된 이름은 "+s1+"입니다.");

		//실습)나이와 이름을 입력받아서 출력
//		int age;
//		String name;
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("나이입력 : ");
//		age = sc.nextInt();
//		sc.nextLine(); // 엔터처리. 인풋스트림에 엔터 처리용
//		System.out.printf("이름입력 : ");
//		name = sc.nextLine();
//		System.out.println("나이 : "+age+" 이름 : "+name);

		// 실습) 반, 이름, 국,영,수 점수 입력
		//반, 이름, 총점과 평균을 구하여 출력
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("반 입력 : ");
		String ban = sc.next();
		sc.nextLine();
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반과 이름은?");
		String ban = sc.next();
		//String name = sc.next();
		//System.out.print("이름은?");
		String name = sc.nextLine();
		System.out.print("국 영 수 점수는 ?");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		System.out.println("======================================");
		int sum = kor + eng + math;
		double avg = sum / 3.;
		
		System.out.printf("%s  %s  총점%d  평균%.2f",
				ban, name, sum, avg);
		*/
		
		Scanner sc = new Scanner(System.in);
		String ban = "A";
		String name = "홍길동";
		int kor = 90;
		int eng = 86;
		int math = 78;
		
		System.out.println("======================================");
		System.out.println("반 : " + ban);
		System.out.println("이름 : " + name);
		int sum = kor +eng + math;
		double avg = (double)sum/3;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);//84.66666666666667
		System.out.println(avg*100);//8466.666666666668
		System.out.println(Math.round(avg*100));//8467
		System.out.println((double)Math.round(avg*100)/100);//84.67
		//s가 붙어있으면 static의 의미. 객체를 따로 만들지 않아도 사용가능하다.
		
		//format 메소드 이용
		String.format("포맷메소드" + String.format("%.2f", avg));
	}

}
