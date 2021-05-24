package java06collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class J20210422_02_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//맵 : Key, Value
		//순서가 없다(=index가 없다)
		//key는 중복이 안되고, value는 중복이 허용
//		HashMap<Integer, String> hmap = new HashMap<>();
//		hmap.put(1, "one");
//		hmap.put(2, "two");
//		hmap.put(3, "three");
//		
//		System.out.println(hmap); // {1=one, 2=two, 3=three}
//		System.out.println(hmap.get(1)); // one
//		System.out.println(hmap.get(2)); // two
//		System.out.println(hmap.get(3)); // three
		
		//실습) 학생들의 나이.(key:이름, value:나이)
		Map<String, Integer> hmap1 = new HashMap<>();
		Map<String, Integer> hmap2 = new TreeMap<>();
		hmap1.put("홍", 20);
		hmap1.put("유", 19);
		hmap1.put("이", 37);
		
		System.out.println(hmap1); // {유=19, 이=37, 홍=20}
		System.out.println(hmap1.get("홍")); // 20 get(key) :key값으로 value를 찾는다.
		
	}

}
