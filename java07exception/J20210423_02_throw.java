package java07exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J20210423_02_throw {

	static void arrayIndex(int index) {
		int[] arr = {10,20,30};
		try {
			System.out.println(arr[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 index");
		}catch(Exception e){
			System.out.println("예외발생");
		}
		
	}
	//throws. 예외를 던진다. 호출한 쪽에서 처리해준다. ArrayIndexOutOfBoundsException 언체크 예외. try-catch 처리 안해줘도 동작가능
	static void arrayIndex_throws(int index) throws ArrayIndexOutOfBoundsException{
		int[] arr = {10,20,30};
		System.out.println(arr[index]);
	}
	
	//파일 읽기 메소드. throws
	//FileNotFoundException. FileNotFoundException 체크예외. 반드시 try-catch처리해줘야한다. 
	static void fielRead(String filename) throws FileNotFoundException{
		File file = new File(filename);
		//Scanner sc = new Scanner(file, "utf-8"); <- txt파일에 있는 한글이 나오지 않을 때! 
		Scanner sc = new Scanner(file);
		System.out.println("파일 읽기 성공");
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			System.out.println(s);
		}
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		// throws : 예외던지기
//		J20210423_02_throw.arrayIndex(5);
//		
//		
		//J20210423_02_throw.arrayIndex_throws(5);// <--호출 한 곳이 예외발상. 이쪽에서 try catch해준다.
//		try {
//			J20210423_02_throw.arrayIndex_throws(5);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("throws로 처리 : 잘못된 index");
//		}catch(Exception e){
//			System.out.println("예외발생");
//		}
		
		
		//파일 읽기 메소드 호출
		try {
			J20210423_02_throw.fielRead("sample.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
		
	}

}
