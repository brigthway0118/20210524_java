package java09_inheritance;

import java.util.HashMap;
import java.util.Map;

class Thing{
	
}
class Note extends Thing{
	public String toString(){
		return "노트";
	}
}
class Pen extends Thing{
	public String toString(){
		return "펜";
	}
}

class Enter{
	//재고 저장 map객체
	Map<String, Integer> m = new HashMap<>();
	
	//입고메소드
	void printEnter(Thing t, int n) {
		//System.out.println(t+" "+n+"개"+" 입고");	
		System.out.println(t.toString() + n + " 입고");
		//System.out.println("현재물량 : " + m.get(t.toString()));
		
		//기존재고 조회(가져오기)
		Integer stockQty = m.get(t.toString()); //Integer형은 객체생성이라 null값을 담을수 있다.
		
		
		if(stockQty==null) stockQty=0; // 재고가 없을경우 0으로 초기화.
		m.put(t.toString(), stockQty+n );
		//System.out.println(m);
	}
	//재고 출력메소드
	void stockPrint(Thing t) {
		System.out.println(t+"의 재고 : " + m.get(t.toString()));
	}
}
public class J20210504_04_Item {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enter e = new Enter();
		Pen p = new Pen();
		e.printEnter(p, 10);
		e.printEnter(p, 20);
		
		Note n = new Note();
		e.printEnter(n, 15);
		e.printEnter(n, 20);
		
		e.stockPrint(p);
		e.stockPrint(n);
		
	}

}
