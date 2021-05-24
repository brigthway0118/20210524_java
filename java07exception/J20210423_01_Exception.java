package java07exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210423_01_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//예외 처리
//		int a = 10, b=0;
//		System.out.print("나룰 수를 입력 : ");
////		b=sc.nextInt();
////		System.out.println(a/b);
//		while (true) {
//			try {
//				// 예외 발생 가능성 문장
//				b = sc.nextInt();
//				System.out.println(a / b);
//				break;
//
//			} catch (InputMismatchException e) {
//				System.out.println("숫자를 입력해주세요!");
//				sc.nextLine(); // 버퍼비우기
//				e.printStackTrace();
//			} catch (ArithmeticException e) {
//				System.out.println("0은 안돼요!");
//				e.printStackTrace();
//			} catch (Exception e) {// Exception은 마지막에... 위에 있을경우 모든 에러를 처리해버린다
//				// 예외가 발생했을 때 실행
//				System.out.println("에러발생");
//				e.printStackTrace();
//			}
//		}
//		System.out.println("프로그램 정상종료");
		
		
//		//실습)
//		int[] arr = {10,20,30};
//		try {
//			System.out.print("인덱스 번호 입력 : ");
//			int i = sc.nextInt();
//			System.out.println(arr[i-1]);
//		}catch(InputMismatchException e) {
//			System.out.println("정수를 입력");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 범위 밖입니다.");
//		}catch(Exception e) {
//			System.out.println("예외 발생");
//			e.printStackTrace();
//		}
//		System.out.println("종료!");
		
		//
		File file = new File("sample.txt");
		System.out.println(file);
		
		//예외의 종류(예외명+블럭처리 + F4로 상속 확인가능)
		//1)체크예외 : RuntimeException을 상속하지 않는 예외. 네트워크,DB,파일 등 외부와 연결되는 것들
		
		//2)언체크예외 : RuntimeException을 상속한 예외
		try {
			Scanner sc = new Scanner(file);
			System.out.println("파일 읽기 성공");
			while(sc.hasNextLine()) {
				String s = sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) { //체크 예외
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
