package java02class;
//핸드폰
//필드 : 이름, 용량, 색상
//생성자, 세터, 게터, toString
class Phone{
	private String name;
	private int capacity;
	private int pixel;
	Phone(){};
	Phone(String name, int capacity, int pixel) {
		//this : 객체 나 자신을 의미. 주소를 가지고있다.
		this(name, capacity);// 나 자신의 생성자 호출.. 주의! 반드시 생성자 호출을 먼저해야한다.
		//()안 매개변수로 구분한다.
		//ex))아래쪽에 있는 생성자 호출
		this.pixel = pixel;
		//System.out.println(this); //java02class.Phone@5aaa6d82 출력
	}
	Phone(String name, int capacity) {//this(name, capacity)하면 이 생성자가 호출된다.
		this.name = name;
		this.capacity = capacity;
	}
	Phone(String name) {
		this.name = name;
	}
	

	public String getName() {	return name;	}

	public void setName(String name) {	this.name = name;	}

	public int getCapacity() {	return capacity;	}

	public void setCapacity(int capacity) {	this.capacity = capacity;	}

	public int getPixel() {	return pixel;	}

	public void setPixel(int pixel) {	this.pixel = pixel;	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", capacity=" + capacity + ", pixel=" + pixel + "]";
	}
	
	
	
	
	
	
}
public class J20210420_02_Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone p1 = new Phone("갤럭시", 512, 1200);
		System.out.println(p1);
//		p1.setCapacity(256);
//		System.out.println(p1);
	}

}
