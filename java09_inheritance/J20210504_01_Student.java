package java09_inheritance;

class School{
	void schoolName() {
		System.out.println("국제컴퓨터학교");
	}
	void info(String name) {};
}

class Student extends School{
	@Override
	void info(String name) {
		System.out.println(name + "학생");
	}
}

class Teacher extends School{
	@Override
	void info(String name) {
		System.out.println(name + "선생");
	}
}
public class J20210504_01_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s1 =  new Student();
		s1.schoolName();
		//((Student)s1).info("홍길동"); // 추상화없이 형변환
		s1.info("홍길동");
		
		School t1 = new Teacher();
		t1.schoolName();
		t1.info("이순신");
	}

}
