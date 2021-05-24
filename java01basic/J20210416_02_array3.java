package java01basic;

import java.util.ArrayList;
import java.util.Arrays;

public class J20210416_02_array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열의 복사1(얕은복사) : 주소만 복사
//		int[] src = {1,2,3,4,5};
//		int[] dest = src; // 주소를 복사한 것!!!
//		System.out.println(src); // [I@7d6f77cc
//		System.out.println(dest); // [I@7d6f77cc
//		System.out.println(Arrays.toString(src)); //[1, 2, 3, 4, 5]
//		System.out.println(Arrays.toString(dest)); // [1, 2, 3, 4, 5]
//		src[1] = 20; dest[3] = 40;
//		System.out.println(Arrays.toString(src)); //[1, 20, 3, 4, 5]
//		System.out.println(Arrays.toString(dest)); //[1, 20, 3, 4, 5]
		
		//배열의 복사2(깊은복사) : 값만 복사
		//및 src->6개로 늘리기
//		int[] src = {1,2,3,4,5};
//		int[] dest = new int[6];
//		System.out.println(Arrays.toString(src)); //[1, 2, 3, 4, 5]
//		System.out.println(Arrays.toString(dest)); // [0, 0, 0, 0, 0, 0]
//		System.out.println("================================");
//		for(int i = 0; i<5; i++) {
//			dest[i] = src[i];
//		}
//		System.out.println(Arrays.toString(src)); // [1, 2, 3, 4, 5]
//		System.out.println(Arrays.toString(dest)); // [1, 2, 3, 4, 5, 0]
//		System.out.println("================================");
//		dest[5] = 6;
//		System.out.println(Arrays.toString(src)); // [1, 2, 3, 4, 5]
//		System.out.println(Arrays.toString(dest)); // [1, 2, 3, 4, 5, 6]
//		System.out.println("================================");
//		src = dest;
//		System.out.println(Arrays.toString(src)); // [1, 2, 3, 4, 5, 6]
//		System.out.println(Arrays.toString(dest)); // [1, 2, 3, 4, 5, 6]
		
		//배열의 깊은복사3
		int[] src = {1,2,3,4,5};
		int[] dest = {0,0,0,0,0};
		
		//src배열에서 3,4번 값을 가져와 dest 배열에 깊은 복사하기
		System.arraycopy(src, 2, dest, 0, 3);
		//System.arraycopy(원본, 원본 시작위치, 복사할 배열, 복사 시작위치, 복사할 수)
		//src배열에서, 2번인덱스부터, dest배열에다가, 0번인덱스부터, 3개를 복사
		System.out.println("src : "+Arrays.toString(src)); // [1, 2, 3, 4, 5]
		System.out.println("dest : "+Arrays.toString(dest)); // [3, 4, 5, 0, 0]
		
//		System.out.println("================================");
//		//프레임워크를 이용한 데이터 추가
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		System.out.println(arr);//[10, 20]
	}

}
