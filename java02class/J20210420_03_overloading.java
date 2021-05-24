package java02class;

import java.util.Arrays;

class Sum {

	// 두 정수를 매개변수로 받아서 합을 리턴하는 메소드
	int add(int a, int b) {
		return a + b;
	}

	// 세 정수를 매개변수로 받아서 합을 리턴하는 메소드
	int add(int a, int b, int c) {
		return a + b + c;
	}
	
	// 배열을 매개변수로 받아서 합을 리턴
	int add(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	// 배열을 매개변수로 받아서 합을 마지막 index에 넣고 리턴하는 메소드
		int add1(int[] arr) {
			System.out.println(Arrays.toString(arr)); //[10, 20, 30, 40]
			int sum = 0;
			for(int i=0; i<arr.length-1; i++) {
				sum+=arr[i];
			}
			arr[arr.length-1] = sum;
			return sum;
		}
	
	// 가변인자(매개 변수 n개 받기)
	int addVarArgs(int ... num) {
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		return sum;
	}
	
	//문자열을 가변인자로 받아서 출력
	void strVarArgs(String ... arr) {
		//String s1 ="";
//		for(int i=0; i<arr.length; i++) {
//			s1 += arr[i]+" ";
//		}
		for(String s : arr) {
			//s1 += s+" ";
			System.out.println(s);
		}
		//return s1;
	}

}

public class J20210420_03_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s = new Sum();
		System.out.println(s.add(50, 60));
		System.out.println(s.add(50, 60, 50));
		System.out.println("========================");
		int[] arr = {10,20,30,40,0};
		System.out.println("합계 : " + s.add1(arr)); // 배열 하나를 보냄.
		System.out.println(Arrays.toString(arr));
		
		System.out.println("========================");
		
		//배열
		//가변인자
		s.strVarArgs("자바","파이썬","씨","씨샵");
		//System.out.println(s.addVarArgs(10,20,30,40,50)); // n개의 인자를 보냄.
		//System.out.println(s.add(arr)); // 배열 하나를 보냄.

	}

}
