package java02class;

import java.util.Arrays;

//학생 클래스
//필드: 반(gruop), 이름(name), 점수(score), 합계(sum)
//메소드: 합계 게산(sumCal), 평균(avgCal)을 계산해서 반환
class Student{
	String group = "자바반";
	String name = "홍길동";
	int[] score = new int[3];
	int sum;
	
	
	void sumCal(int a, int b, int c) {	//합계. 값을 바탕으로 호출. Call by Value
		sum = 0;
		score[0]=a; score[1] = b; score[2] = c;
		sum = a+b+c;
	}
	
	void sumCal(int[] score) {	//합계.
		//HEAP영역에 있는 new int{79,89,88}의 주소를 score 배열에 저장.
		//배열(주소)를 바탕으로 호출. Call by reference
		sum = 0;
		this.score = score; // 얕은복사
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
	}
	
	//평균구하기
	double avgCal() {
		double avg =  (double)sum/score.length;
		return Math.round(avg*100)/100.0;
	}
}
public class J20210419_03_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		//int[] arr = new int[] {79,89,88};
		s1.sumCal(79,89,88);
		System.out.println(Arrays.toString(s1.score)); // [79, 89, 88]
		System.out.println("합계 : " + s1.sum); // 합계 : 256
		s1.sumCal(new int[] {79,90,100}); // 혹은 arr
		System.out.println(Arrays.toString(s1.score)); // [79, 89, 88]
		System.out.println("합계 : " + s1.sum); // 합계 : 256
		System.out.println("평균 : " + s1.avgCal()); // 평균 : 89.66666666666667
	}

}
