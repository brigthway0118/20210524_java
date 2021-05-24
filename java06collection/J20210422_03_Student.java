package java06collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//학생 클래스
//필드 : 번호(int no), 이름(String name), 전화번호(String tel)
class Student {
	private int no;
	private String name;
	private String tel;

	Student() {
	};

	Student(int no, String name, String tel) {
		this.no = no;
		this.name = name;
		this.tel = tel;
	}

	void setNo(int no) {	this.no = no;	};
	void setName(String name) {		this.name = name;	};
	void setTel(String tel) {		this.tel = tel;	};
	
	int getNo() {		return no;	};
	String getName() {		return name;	}
	String getTel() {		return tel;	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", tel=" + tel + "]";
	}

}

public class J20210422_03_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		Student s1 = new Student(2, "홍길동", "010-1111-1111");
//		Student s2 = new Student(5, "이순신", "010-2222-2222");
//		Student s3 = new Student(6, "유관순", "010-3333-3333");
		
		/*
		1. ArrayList에 저장
		List<Student> arrStd = new ArrayList<>();
		arrStd.add(s1);
		arrStd.add(s2);
		arrStd.add(s3);
		System.out.println(arrStd);
		System.out.println("=============================================");
		for(int i = 0; i< arrStd.size(); i++) {
			Student s = arrStd.get(i);
			System.out.println(s.getNo()+ " "+s.getName()+" "+s.getTel());
		}
		System.out.println("=============================================");
		for(Student s : arrStd) {
			System.out.println(s.getNo()+ " "+s.getName()+" "+s.getTel());
		}
		*/
		
		/*
		 2. Map에 저장. (Key:no, Value:Student)
		 */
//		Map<Integer, Student> hmap = new HashMap<>();
		//질문 s1, s2, s3...을 집어넣는다 s+i 이런식으로 못하나요?
		//저런식으로 연속된 곳에 저장하려면 Integer가 아니라 int array에 저장?
//		hmap.put(s1.getNo(), s1);
//		hmap.put(s2.getNo(), s2);
//		hmap.put(s3.getNo(), s3);
//		System.out.println(hmap);
//		
//		System.out.println(hmap.get(s1.getNo())); // Student [no=1, name=홍길동, tel=010-1111-1111]
//		System.out.println(hmap.get(s2.getNo())); // Student [no=2, name=이순신, tel=010-2222-2222]
//		System.out.println(hmap.get(s3.getNo())); // Student [no=3, name=유관순, tel=010-3333-3333]
//		
//		Student s = hmap.get(5);
//		System.out.println(s.getNo()+" "+s.getName()+" "+s.getTel()); // 5 유관순 010-3333-3333
//		//System.out.println(hmap.keySet()); // [4, 5, 9]
//		
//		System.out.println("----------------------------------------------");
//		//키값으로 출력1
//		for(int a : hmap.keySet()) {
//			System.out.println(hmap.get(a));
//		}
//		System.out.println("----------------------------------------------");
//		//키값으로 출력2
//		Set<Integer> ks = hmap.keySet();
//		for(int k : ks) {
//			System.out.println(hmap.get(k));
//		}
//		System.out.println("----------------------------------------------");
//		//키값으로 출력3
//		Iterator<Integer> it = ks.iterator();
//		while(it.hasNext()) {
//			int key = it.next();
//			//System.out.println(key);
//			//System.out.println(hmap.get(key));
//			Student st = hmap.get(key);
//			System.out.println(st.getNo()+" "+st.getName()+" "+st.getName());
//		}
		//System.out.println(ks); //[4, 5, 9]
		
		
		//실습)
		//result(키) : "success"(밸류
		//data(키) : ArrayList Student(밸류)
		//Map의 result가 success일때 data 출력.
		Student s1 = new Student(2, "홍길동", "010-1111-1111");
		Student s2 = new Student(5, "이순신", "010-2222-2222");
		Student s3 = new Student(6, "유관순", "010-3333-3333");
		Map<String, Object> hmap = new HashMap<>();
		List<Student> stl = new ArrayList<>();
		stl.add(s1);
		stl.add(s2);
		stl.add(s3);
		hmap.put("result", "success");
		hmap.put("data", stl);
		//System.out.println(hmap);
		/*
		hmap의 구성
		{result=success,
		 data=[Student [no=2, name=홍길동, tel=010-1111-1111],
		       Student [no=5, name=이순신, tel=010-2222-2222],
		       Student [no=6, name=유관순, tel=010-3333-3333]
		    		   ]
		    		   }
		*/
		//Object obj = hmap.get("result"); // Object로 만드니까 success를 오브젝트형 반환. 따라서 String으로 형변환한다.
		String result = (String)hmap.get("result");//다운캐스팅으로 오브젝트-> String형 변환
		if(result.equals("success")) {
			System.out.println("success");
			List<Student> stdlist = (List<Student>)hmap.get("data");
			//System.out.println(stdlist);
			for(Student s : stdlist) {
				System.out.println(s);
				System.out.println(s.getNo() + " " + s.getName() +" " +s.getTel());
			}
		}else {
			System.out.println("에러");
		}
	}

}
