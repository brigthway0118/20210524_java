package java01basic;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J20210415_01_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		/*
		 * //int data -> stack영역에 저장.. int[] arr; // 선언은 stack영역에 저장.. arr = new int[5];
		 * //배열은 heap에 생성.. //배열은 heap에 생성 //자바는 동적배열. 따라서 []안에 사용자 입력이 가능하다!
		 * 
		 * 
		 * int cnt = 5; int[] arr; arr = new int[cnt]; // 자바는 동적배열이라 가능한 [cnt] arr[0] =
		 * 10; System.out.println(arr[0]); arr[5] = 100; // 에러발생. 5번 index는 없기때문이다.
		 */

//		int[] arr = new int[5];
//		for(int i = 0; i<arr.length ; i++) {
//			arr[i] = i+1;
//		}
//		
//		for(int i = 0; i<5 ; i++) {
//			System.out.println(arr[i]);
//			//0이 출력된다. 배열은 heap영역에 있기때문에 자동초기화!
//		}

		// 선언과 초기화. 반드시 사이즈 생략해야된다.!
		// int[] arr = new int[] {10,20,30};
//		int[] arr = { 10, 20, 30 };
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println("===============================");
//		// for~each문
//		for (int a : arr) {
//			System.out.println(a);
//		}
//		// Arrays 클래스 이용 문자열 출력
//		System.out.println(Arrays.toString(arr)); // [10, 20, 30] // 오버로딩
//
//		System.out.println(arr.toString()); // [I@7d6f77cc // 오버라이딩
//		System.out.println(arr); // [I@7d6f77cc

		// println메소드는 toString을 실행.

		// 오버로딩과 오버라이딩
		// 오버로딩 : 메소드 이름은 똑같지만 매개변수가 다른 경우.
		// 오버라이딩 : 부모에 있는 메소드를 자식클래스가 재정의하는 경우.
		// Arrays.toString 메소드가 오버로딩

		// 실습)합계, 평균
//		int[] score = { 88, 89, 77 };
//		int sum = 0;
//		double avg = 0;
//		
//		for(int i = 0; i<score.length; i++) {
//			sum+=score[i];
//		}
//		avg = sum / 3.0;
//		System.out.println("합계 : "+sum+"\t평균 : "+String.format("%.2f", avg));

//		int[] score = new int[3];
//		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i<score.length ; i++) {
//			System.out.print((i+1)+"번째 점수 입력 : ");
//			score[i] = sc.nextInt();
//		}
//		int sum = 0;
//		for(int s : score) {
//			sum+=s;
//		}
//		System.out.println("합계 : "+sum+"\t평균 : "+String.format("%.2f", sum/3.0));

		// 문자열 배열
		// String[] arr = new String[] {"java", "python", "c"}; //같은 뜻
		// arr은 스택영역. 인덱스는 주소를 가진체 heap영역에 저장. java의 경우는 heap영역 다른 곳에 저장되고 인덱스는 java를
		// 가리키는 주소를 가진다.
//		String[] arr = {"java", "python", "c"}; //같은 뜻
//		for(String s : arr) {
//			System.out.println(s);
//		}
//		
//		if(arr[0]=="java") {
//			System.out.println("같다");
//		}

		// 실습)좋아하는 색 3개를 입력받아 배열에 저장하고 출력
//		String[] color = new String[3];
//		for(int i = 0; i<color.length; i++) {
//			color[i] = sc.nextLine();
//			//sc.nextLine();
//		}
//		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★");
//		for(String s : color) {
//			System.out.println(s);
//		}
//		
		// 실습))피보나치수열 n개 구하기
//		System.out.print("피보나치 수열 n까지 구하기 : ");
//		int n = sc.nextInt();
//		int[] fibo = new int[n];
//		for(int i=0; i<fibo.length; i++) {
//			if(i<2) {
//				fibo[i] = i;
//			}else {
//				fibo[i] = fibo[i-1] + fibo[i-1] ;
//			}
//		}
//		System.out.println("피보나치...수열...");
//		for(int a : fibo) {
//			System.out.println(a);
//		}
		
		// 실수형 배열로 0.1~1.0까지 출력하기
//		double[] val = new double[10];
//		for (int i = 1; i <= 10; i++) {
//			val[i - 1] = i * 0.1;
//		}
//		for (double a : val)
//			System.out.println(String.format("%.1f", a));

		// 실습) 시험 채점 프로그램...
//		int[] right = { 1, 3, 4, 2, 1 };
//		int[] answer = { 2, 3, 4, 1, 1 };
//		int point = 0;
		/*
		 * right와 answer가 각각 가리키는 주소는 다르다. right[0]과 answer[0]은 주소값을 가지는게 아니라 정수값을 가진다.
		 * 
		 * String문자열은은 인덱스별로 주소값을 가진다.
		 * 
		 */
//		for(int i=0 ; i<right.length; i++) {
//			System.out.print("1.정답 : "+right[i]+"\t2.대답 : "+answer[i]);
//			if(right[i]==answer[i]) {
//				System.out.print(i+1 + "	20");
//				point+= 100/right.length;
//			}
//			System.out.println("");
//			
//		}
//		System.out.println("시험 점수는 : "+point+"점입니다.");

		// 실습)) 최대값(최소값) 찾기
//		int[] arr = {4,6,7,2,5};
//		int max=arr[0];
//		for(int i = 0; i< arr.length ; i++) {
//			if(max<arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println("최대값 : "+max);

		// 실습)선택정렬(오름차순 정렬1 2 3 4 5...7) // {4,6,7,2,5} -> {2,4,5,6,7}
//		int[] arr = { 4, 6, 7, 2, 5 };
//		int[] sortArr = new int[5];
//		int temp = 0;
//		int min = arr[0];
//		for (int i = 0; i < arr.length; i++) { // i가 0일때...
//
//			// 제일 작은 것 찾기.
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i] < arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		for (int a : arr) {
//			System.out.print(a + " ");
//		}

		// 선택정렬2(오름차순)
//		int[] sortArr = { 4, 6, 7, 2, 5 };
//		for (int j = 0; j < sortArr.length; j++) {
//
//			int min = sortArr[j];
//			int minIndex = j; // 가장 작은값의 index
//			for (int i = j+1; i < sortArr.length; i++) {
//				if (sortArr[i] < min) {
//					min = sortArr[i];
//					minIndex = i;
//				}
//			}
//
//			System.out.println(min);
//			System.out.println(minIndex);
//			// 두수바꾸기
//			sortArr[minIndex] = sortArr[j];
//			sortArr[j] = min;
//			System.out.println(Arrays.toString(sortArr));
//		}

		// 실습)로또번호 맞춘 갯수 출력1
//		int[] no = { 9, 12, 21, 25, 33, 42 }; // 내가 예상한 번호
//		int cnt = 0; // 맞춘 갯수
//		// 로또번호 생성
//		//int[] lotto = { 12, 9, 33, 25, 42, 21 };
//		int[] lotto = new int[6];
//		
//		for (int i = 0; i < 6; i++) {
//			lotto[i] = (int) (Math.random() * 45 + 1);// 1~45개 수 랜덤생성
//
//			// 중복제거
//			for (int j = 0; j < i; j++) {
//				if (lotto[i] == lotto[j])
//					i--;
//			}
//		}
//
//		for (int i = 0; i < no.length; i++) {
		// i가0일경우..0번째 인덱스값이 로또번호에 있는지 여부판단.
//			for (int j = 0; j < no.length; j++) {
//				if (no[i] == lotto[j])
//					cnt++; //
//				//System.out.println("맞춘 번호:" + no[i] + "\t 누적:" + cnt);
//			}
//		}
//		// 로또 오름차순 정렬
//		int temp = 0;
//		int min = lotto[0];
//		for (int i = 0; i < lotto.length; i++) {
//			// i가 0일때...
//			// 제일 작은 것 찾기.
//			for (int j = 0; j < lotto.length; j++) {
//				if (lotto[i] < lotto[j]) {
//					temp = lotto[i];
//					lotto[i] = lotto[j];
//					lotto[j] = temp;
//				}
//			}
//		}
//
//		System.out.println("========================");
//		System.out.println("이번 주 로또 당첨 번호");
//		for (int a : lotto) {
//			System.out.print(a + " ");
//		}
//		System.out.println("");
//		System.out.println("========================");
//		System.out.println("나의 예상 로또 번호");
//		for (int a : no) {
//			System.out.print(a + " ");
//		}
//		System.out.println("");
//		System.out.println("========================");
//		System.out.println("맞춘 갯수 : " + cnt);

		
		// 로또2
		//int의 범위
		//System.out.println("Max : " + Integer.MAX_VALUE);//2147483647
		//System.out.println("Max : " + Integer.MIN_VALUE);//-2147483648
		
		int[] no = new int[6];		
		Random rd = new Random(); 
		
		
		for(int i=0; i<no.length; i++) {
			int r = rd.nextInt(45)+1; // 1부터 45까지 Int형 정수 생성.
			boolean b = false;//번호 중복 여부 판단. true = 중복, false = 비중복
			
			//기존에 번호가 등록되어 있다면..중복되지않게
			for(int j=0; j<i; j++ ) {
				if (r==no[j]) {
					i--;
					b = true;
					break;
				}
				
			}
			if(!b)	no[i] = r; //기존에 존재하지 않는다면 대입
		}
		Arrays.sort(no); //오름차순 정렬
		System.out.println(Arrays.toString(no));
		
		
		



	}
}
