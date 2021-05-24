package java13_thread;

//스레드만들기2. implements로...
class MyRunn implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("runnable 스레드 "+i);
		}
	}
}

public class J20210507_02_Runnable {

	public static void main(String[] args) {
		MyRunn t2 = new MyRunn(); // 사용자 객체 t2 //실행구현
		Thread th = new Thread(t2); // Thread객채에 t2를 넘겨준다. //쓰레드 구현
		th.start(); // 쓰레드 시작
	
		
		//익명클래스로 만들기
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("익명클래스 스레드 "+i);
				}
			}
			
		};
		
		//스레드 2생성
		//Thread th1 = new Thread(); Thread()매개변수에 new Runnable()을 넣는다.
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("thread1 스레드" + i);
				}
			}
		});
		th1.setPriority(1); // 스레드 우선순위.
		//숫자가 높을 수록 우선순위가 높다. 생략하면 5가 기본값.
		th1.start();
		
		
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("thread2 스레드" + i);
				}
			}
		});
		th2.setPriority(10);
		th2.start();
		
	
		
		for (int i = 0; i<10; i++) {
			System.out.println("main " + i);
		}
		
//		Thread th1 = new Thread(r);
//		th1.start();
	}

}
