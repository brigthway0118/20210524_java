package java13_thread;

public class J20210507_03_sleep {

	public static void main(String[] args) {
		
//		for(int i=0; i<10; i++) {
//			try {
//				Thread.sleep(1000);  // 1000 = 1초
//				System.out.println(i);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=5;i>0;i--) {
					try {
						//우선순위가 낮은 스레드가 기아상태에 빠지는 것을 방지
						Thread.sleep(1000);
						System.out.println(i+"초");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		th1.start();
		
		System.out.println("메인 스레드 종료");
	
	}
}
