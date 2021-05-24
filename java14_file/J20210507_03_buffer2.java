package java14_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class J20210507_03_buffer2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//FileWriter fw = new FileWriter("./data/bufferWriter.txt");
		//BufferedWriter bw = new BufferedWriter(fw);
		
		//한 줄로 처리하기.
//		BufferedWriter bw = new BufferedWriter(// BufferedWriter : 문자단위 버퍼 보조
//				new FileWriter("./data/bufferWriter.txt"));//FileWriter : 파일에 문자단위로 출력
		
		//try~with문 : try 후 객체(BufferedWriter bw)가 자동으로 사라지기 때문에 close 할 필요가없다.
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter("./data/bufferWriter2.txt"))){
//			while(true) {
				//입력받은 data를 파일에 쓰기
//				System.out.print("이름,국,영,수? ");
//				String data = sc.nextLine();
//				if(data.equals("quit")) {
//					System.out.println("종료합니다");
//					break;
//				}
//				bw.write(data);
//				bw.newLine();//개행
//			}
//		}catch(IOException e) {
//			System.out.println("예외발생");
//		}
		
//		bw.write("이순신,89,99,77");
//		bw.newLine();
//		bw.close();
		
		//한줄씩 읽기
		try(BufferedReader br = new BufferedReader(new FileReader("./data/bufferWriter2.txt"))){
			String s = null;
			while( (s=br.readLine()) != null ) {
				System.out.println(s);
				String[] data = s.split(",");
				System.out.println("출력 : "+ Arrays.toString(data)); // 출력 : [이순신, 89, 99, 78]
				//인덱스값 : [data[0], data[1], data[2], data[3]]
				int sum=0; //과목의 합계
				for(int i=1; i<4; i++) {
					sum += Integer.parseInt(data[i]);
				}
				System.out.println("이름 : "+data[0]);
				System.out.println("합계 : "+sum);
				System.out.printf("평균 : %.2f\n", sum/3.);
				System.out.println("--------------------------------------");
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

		
		
	}
}
