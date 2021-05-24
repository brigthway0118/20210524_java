package java01basic;

import java.util.Arrays;
import java.util.Scanner;

public class J20210416_01_array2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		/*
		 * int[][] student new int[3][4]
		 * 
		 * 2차원의배열은 처음 시작되는 행의 주소를 가진다. std[3][4]...std[0]은 첫번째 행의 주소를 가진다. 참조변수의 null은
		 * 주소값을 가지고 있지않다.
		 */

		/*
		 * 2 2차원 배열 만드는 법.
		 * 
		 * int[][] arr; // stack영역에 선언 arr = new int[3][4]; // heap영역에 생성
		 * 
		 * //선언과 동시에 초기화 하는법 int[][] arr = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}
		 * } int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12} }
		 */
//		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
//		// 각 행의 주소값 출력
////		System.out.println(arr[0]);//[I@7d6f77cc
////		System.out.println(arr[1]);//[I@5aaa6d82
////		System.out.println(arr[2]);//[I@73a28541
//
//		// 2차원 배열의 값을 2중for문으로 출력
//		// System.out.println(arr[1][2]);//7 출력
//		for (int i = 0; i < arr.length; i++) {// 행
//			for (int j = 0; j < arr[i].length; j++) {// 열
//				// System.out.print(arr[i][j]+"\t");
//				System.out.printf("%4d", arr[i][j]);
//			}
//			System.out.println();
//		}
//
//		// for each문
//		for (int[] a : arr) {// 행
//			for (int b : a) {// 열
//				System.out.println(b);
//			}
//		}

//		int[][] arr = new int[3][4];
//		//1~12대입
//		for(int i = 0; i<arr.length; i++) {
//			for(int j =0 ; j<arr[i].length; j++) {
//				arr[i][j] = (i*4)+(j+1);
//			}
//		}
//		for(int[] a : arr) {
//			for(int b : a) {
//				System.out.print(b+" ");
//			}
//			System.out.println();
//		}
//		
		// 실습)2명 학생의 국,영,수 점수를 2차원 배열에 입력받는다. 각자의 합계 평균 구하기
		int[][] score = new int[2][3];
		String[] subName = { "국어", "영어", "수학" };
		// int[] sum= new int[2];
		int[] subsum = new int[3];
		// double[] avg = new double[2];
		// 값 입력
		boolean pa = true;
		while (pa) {

			System.out.println("=====================================");
			System.out.println("국제 성적 관리 프로그램 V1.0.0");
			System.out.println("=====================================");
			System.out.println("1. 성적등록");
			System.out.println("2. 학생별 합계/평균");
			System.out.println("3. 과목별 합계/평균");
			System.out.println("9. 종료");
			System.out.println("=====================================");
			System.out.print("번호는? ");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				for (int i = 0; i < score.length; i++) {
					System.out.print((i + 1) + "번 학생의 국,영,수 점수 입력 : ");

					for (int j = 0; j < score[i].length; j++) {
						// System.out.printf("%d번 학생의 %s점수는? ", i+1, subName[j]);
						score[i][j] = sc.nextInt();
					}
					System.out.println("");
				}
				System.out.println("==================================");
				break;
			case 2:
				for (int i = 0; i < 2; i++) {
					int sum = 0;
					for (int j = 0; j < 3; j++) {
						sum += score[i][j];
					}
					System.out.println((i + 1) + "번 학생 합계  : " + sum + "\t 평균 : " + (double) sum / 3);
				}
				break;
			case 3:
				for (int j = 0; j < 3; j++) {
					int sum = 0;
					for (int i = 0; i < 2; i++) {
						sum += score[i][j];
					}
					System.out.println(subName[j] + " 합계  : " + sum + "\t 평균 : " + (double) sum / 2);
				}
				break;
			case 9:
				System.out.println("종료합니다.");
				System.exit(0);
				//pa = false;
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
		// 학생별 점수입력
//		for(int i = 0 ; i<score.length ; i++) {
//			System.out.print((i+1)+"번 학생의 국,영,수 점수 입력 : ");
//			
//			for(int j = 0; j<score[i].length; j++) {
//				//System.out.printf("%d번 학생의 %s점수는? ", i+1, subName[j]);
//				score[i][j] = sc.nextInt();
//			}
//			System.out.println("");
//		}
//		System.out.println("==================================");

		// 학생별 합계
//		for(int i = 0 ; i<score.length ; i++) {
//			for(int j = 0; j<score[i].length; j++) {
//				sum[i]+=score[i][j];
//			}
//		}
//		for(int i = 0; i<2 ; i++) {
//			int sum=0;
//			for(int j=0; j<3; j++) {
//				sum += score[i][j];
//			}
//			System.out.println((i+1)+"번 학생 합계  : "+sum+"\t 평균 : "+(double)sum/3);
//		}

		// 학생별 평균
//		for(int i = 0 ; i<sum.length; i++) {
//			avg[i] = sum[i]/3.;
//		}

		// 과목별 합계, 평균
//		for(int j = 0; j<3 ; j++) {
//			int sum=0;
//			for(int i=0; i<2; i++) {
//				sum += score[i][j];
//			}
//			System.out.println(subName[j]+" 합계  : "+sum+"\t 평균 : "+(double)sum/2);
//		}

	}

}
