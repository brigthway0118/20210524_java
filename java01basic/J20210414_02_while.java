package java01basic;

import java.util.Scanner;

public class J20210414_02_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 반복문 : while
		// 원의 넓이 구하기
		// 0을 입력하면 종료

		// 1안
//		double r = 0;
//		while(true) {
//			System.out.print("반지름 입력 : ");
//			r = sc.nextDouble();
//			if(r==0)
//				break;
//			System.out.println("반지름 : "+r*r*Math.PI);
//		}
//		System.out.println("========== 종료 ==========");

		// 2안
//		double r = 1;
//		while (r != 0) {
//			System.out.print("반지름 입력 : ");
//			r = sc.nextDouble();
//			System.out.println("반지름 : "+r*r*Math.PI);
//		}
		
		//3안
//		double r;
//		do {
//			System.out.print("반지름 입력 : ");
//			r = sc.nextDouble();
//			System.out.println("반지름 : "+r*r*Math.PI);
//		} while(r!=0);
		
		
		//실습)) 1~n까지의 수를 더하기
		
		System.out.print("n번째 수 입력 : ");
		int n = sc.nextInt();
		int sum=0, i=0;
		while(i<=n) {
			sum += i++;
		}
		System.out.print("1부터 n까지의 합 : "+sum);
	}
}
