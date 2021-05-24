package java01basic;

import java.util.Scanner;

public class J20210414_01_switch {

	public static void main(String[] args) {

		// 조건문 : switch
//		int a = 3;
//		switch (a) {
//		case 1:
//			System.out.println("One");
//			break;
//		case 2:
//			System.out.println("Two");
//			break;
//		case 3:
//			System.out.println("Three");
//			break;
//		case 4:
//			System.out.println("Four");
//			break;
//		case 5:
//			System.out.println("Five");
//			break;
//		default:
//			System.out.println("잘못된 숫자");
//			break;
//		}

		// h:고등학교, m :중학교, e:초등학교
//		Scanner sc = new Scanner(System.in);
//		System.out.print("학교는? ");
//		String c = sc.next();
//		switch (c) {
//		case "h":
//			System.out.println("고등학교");
//			break;
//		case "m":
//			System.out.println("중학교");
//			break;
//		case "e":
//			System.out.println("초등학교");
//			break;
//		default:
//			System.out.println("잘못된 입력");
//			break;
//		}
		
//		String s1 = "java";
//		String s2 = new String("java");
//		String s3 = "java";
//		
//		if(s1=="java") //String끼리는 주소비교
//			System.out.println("같습니다");//출력
//		else 
//			System.out.println("다릅니다");
//		
//		
//		if(s1==s3) 
//			System.out.println("같습니다");//출력
//		else 
//			System.out.println("다릅니다");
//		
//		
//		if(s1==s2) 
//			System.out.println("같습니다");
//		else 
//			System.out.println("다릅니다");//출력
//		
//		
//		if(s2=="java") 
//			System.out.println("같습니다");
//		else 
//			System.out.println("다릅니다");//출력
		
		//실습)짝수, 홀수 출력
//		int a = 11;
//		switch(a%2) {
//		case 0:
//			System.out.println("짝수");
//			break;
//		case 1:
//			System.out.println("홀수");
//			break;
//		default:
//			System.out.println("에러");
//			break;
//				
//		}
		
		//100~90:A, 80~89:B, 70~79:C, 60~69:D, F
		int g = 89;
		switch(g/10){
			case 10:
			case 9:	System.out.println("A");	break;
			case 8:System.out.println("B");	break;
			case 7:	System.out.println("C");	break;
			case 6:	System.out.println("D");	break;
			default:
				System.out.println("F");	break;
				
		}

	}

}
