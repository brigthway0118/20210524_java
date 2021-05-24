package java06collection;
//자료구조 : 프로그램에서 사용되는 데이터를 메모리나 저장 장치에 저장하고 이를 사용하는 논리적인 구조
//자료구조에 따라 프로그램의 성능이 좌우된다.
//자료구조의 데이터 저장방식 : 리스트, 스택, 큐, 트리, 해쉬

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//알고리즘 : 데이터를 가공 및 처리하는 방법 .선택정렬, 버블정렬, 퀵정렬, 이진탐색 등이 있다

//프레임워크 : 잘 정의된 구조 또는 골격
//자바의 프레임워크 : 잘 정의된 구조를 가진 클래스들. 
//컬렉션 프레임워크 : 데이터를 잘 다루기 위해서 클래스들을 구조화해서 정의. 데이터의 저장방법과 알고리즘에 대한 프레임워크

public class J20210422_01_collection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		//Liest<E>
		//저장순서가 있다(index가 있다)
		//데이터 중복 허용
		//1)ArrayList : 배열구조. 검색에서 유리. 데이터 추가 및 삭제가 어렵다(느리다).
		
		//ArrayList arrlist = new ArrayList(); // ArrayList뒤 아무것도 없으면 Object형으로 된다.
		//Object형은 모든것들 다 받기 가능하기 때문에 유지보수에 어려움을 겪을수 있다.
		//object형으로 선언뒤 arrlist.add의 경우 add가 object형을 받는것으로 볼 수있다.
		//arrlist.add(30);
		//arrlist.add("자바");
		//System.out.println(arrlist); // [30, 자바] 출력.
		
//		ArrayList<Integer> arrlist1 = new ArrayList<>();
////		arrlist1.add(10);
////		arrlist1.add(20);
////		arrlist1.add(30);
//		for(int i = 0 ; i<3; i++) {
//			arrlist1.add((i+1)*10);
//		}
//		System.out.println(arrlist1); // [10, 20, 30]
//		arrlist1.remove(1);
//		System.out.println(arrlist1); //[10, 30]
//		arrlist1.add(1,50);
//		System.out.println(arrlist1); // [10, 50, 30]
		/*
		//for문
		for(int i = 0; i<arrlist1.size(); i++) {
			System.out.println(arrlist1.get(i)+100);
		}
		//foreach문
		for(Integer a : arrlist1) {
			System.out.println(a);
		}
		*/
		/*
		ArrayList<Double> arrlist2 = new ArrayList<>();
		arrlist2.add(10.5);
		arrlist2.add(12.3);
		System.out.println(arrlist2); // [10, 자바]
		
		ArrayList<String> arrlist3 = new ArrayList<>();
		arrlist3.add("안녕");
		arrlist3.add("하세요");
		System.out.println(arrlist3); // [안녕, 하세요]
		*/
		
		//실습)이름을 입력 받아 ArrayList 만들기
		ArrayList<String> arrlist = new ArrayList<>();
		String name;
//		while(true) {
//			System.out.print("이름 입력(q는 종료) : ");
//			name = sc.nextLine();
//			if(name.equals("q"))
//				break;
//			else
//				arrlist.add(name);
//		}
		//System.out.println(arrlist);
		
		//삭제1
//		System.out.print("삭제할 이름 입력 : ");
//		input = sc.nextLine();
//		for(int i = 0; i<arrlist.size(); i++) {
//			if(arrlist.get(i).equals(input)) {
//				arrlist.remove(i);
//				i--;
//			}
//		}
		
		//삭제2. iteraotr(반복자) 이용
//		arrlist.add("홍");arrlist.add("박");arrlist.add("박");arrlist.add("박");arrlist.add("김");
//		System.out.print("삭제할 이름 입력 : ");
//		name = sc.nextLine();
//		//반복자 생성
//		Iterator<String> it =  arrlist.iterator(); // arrlist의 첫 주소값을 반환
//		System.out.println(it);
//		while(it.hasNext()) { // 주소값에서 다음값을 가져온다. 데이터가 없으면 false
//			String n = it.next();
//			if(name.equals(n)) {
//				it.remove();
//			}
//		}
//		System.out.println(arrlist);
		//출력
//		for(int i=0; i<arrlist.size(); i++) {
//			System.out.println((i+1)+"번 : "+arrlist.get(i));
//		}
		
		
//		//실습. itertor를 이용해서 출력
//		List<String> list = Arrays.asList("red","blue","yellow");
//		//Arrays.asList : 고정길이 배열 반환. 따라서 삭제가 안된다.
		//List<String> list = new ArrayList<String>(Arrays.asList("red","blue","yellow"));
		//위와 같이 Arrays.asList("red","blue","yellow")를 ArrayList로 감싼다.
//		
//		System.out.println(list);
//		Iterator<String> i = list.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}

		
		//실습) 학생들의 키를 입력받아 평균 구하기
//		ArrayList<Double> k = new ArrayList<>();
//		double input, sum=0;
//		
//		while(true) {
//			System.out.print("학생들의 키 입력 : ");
//			input = sc.nextDouble();
//			if(input==0) {
//				break;
//			}else {
//				k.add(input);
//				sum+=input;
//			}
//		}
//		System.out.println("평균 : " + sum / k.size());
//		System.out.println(k);
		
//		================================================
		
//		2) LinkedList : 리스트 기반
		//각 요소가 자신의 이전 요소의 주소와 다음 요소의 주소를 가지고 있다.
		//특징 : 추가 및 삭제가 쉽다.단, 검색 시 성능이 좋지 않다.
		LinkedList<String> linklist = new LinkedList<>();
		linklist.add("python");
		linklist.add("java");
		linklist.add("c");
		linklist.add("javascript");
		System.out.println(linklist);// [python, java, c, javascript]
		
		for(int i=0; i<linklist.size(); i++) {
			System.out.println(linklist.get(i));
		}
	}

}
