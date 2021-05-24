package java14_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class J20210507_03_buffer {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//FileWriter fw = new FileWriter("./data/bufferWriter.txt");
		//BufferedWriter bw = new BufferedWriter(fw);
		
		//한 줄로 처리하기.
		BufferedWriter bw = new BufferedWriter(// BufferedWriter : 문자단위 버퍼 보조
				new FileWriter("./data/bufferWriter.txt"));//FileWriter : 파일에 문자단위로 출력
		bw.write("홍길동,100,80,78");
		bw.newLine();//개행
		bw.write("이순신,89,99,77");
		bw.newLine();
		bw.close();
		
		//한줄씩 읽기
//		FileReader fr = new FileReader("./data/bufferWriter.txt");
//		BufferedReader br = new BufferedReader(fr);
		BufferedReader br = new BufferedReader(new FileReader("./data/bufferWriter.txt"));
		String s = null;
		while( (s=br.readLine()) != null ) {
			System.out.println(s);
			String[] data = s.split(",");
			System.out.println("출력 : "+ Arrays.toString(data)); // 출력 : [이순신, 89, 99, 78]
		}
		br.close();
		
	}
}
