package java02class;

//자동차_클래스
//속성(필드) : name, color, power, speed
//기능(메소드) : powerToggle, speedUp, speedDown
class Car{
	String name="아이오닉";
	String color="노랑";
	boolean power=false;
	int speed = 0;
	
	void powerToggle() {
		power = !power;
//		if(power) {
//			power=false;
//			System.out.println("시동OFF");
//		}else {
//			power=true;
//			System.out.println("시동ON");
//		}
			
	}
	
	void speedUp() { // 속도 100초과 될수 없다.
		//speed++;
		if(speed<100)	speed++;
		//System.out.println("스피드UP : "+speed);
	}
	void speedDown() { //속도 50미만이 될수 없다.
		if(speed>50)	speed--;
		//System.out.println("스피드DOWN : "+speed);
	}
}

public class J20210416_04_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		System.out.println("이름 : " + c1.name);
		System.out.println("컬러 : " + c1.color);
		System.out.println("파워 : " + c1.power);
		c1.powerToggle();
		System.out.println("파워 : " + c1.power);
		for(int i = 0 ; i<200; i++) {
			c1.speedUp();
		}
		System.out.println("속도 : " + c1.speed);
		for(int i = 0 ; i<200; i++) {
			c1.speedDown();
		}
		System.out.println("속도 : " + c1.speed);
		c1.powerToggle();
		System.out.println("파워 : " + c1.power);
		

	}

}
