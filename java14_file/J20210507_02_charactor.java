package java14_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class J20210507_02_charactor {

	public static void main(String[] args) {
		//문자기반 : 문자데이터의 입출력을 다루는 스트림
		//char형 변수 : 2byte
		//자바는 모든 문자를 유니코드를 기준으로 표현
		
//		char c = '홍';
//		System.out.println(c);
		
		//문자단위로 쓰기
		//try-catch문
//		try(FileWriter fw = new FileWriter("./data/charSample.txt")) {
//			fw.write('a');
//			fw.write("자바");
//			fw.write("good");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		//파일 읽기
//		int ch;
//		try(FileReader fr = new FileReader("./data/charSample.txt")){
//			while( (ch=fr.read()) != -1) {
//				System.out.println((char)ch);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//실습1)좋아하는 칼라를 입력받아 파일을 만들고
		//파일을 읽어서 리스트를 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("색 입력 : ");
//		String input = sc.next();
//		try(FileWriter fw = new FileWriter("./data/practice1.txt")) {
//			fw.write(input);
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		int ch;
//		try(FileReader fr = new FileReader("./data/practice1.txt")){
//			while( (ch=fr.read()) != -1) {
//				System.out.print((char)ch);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//실습2)이름과 점수를 입력받아 파일에 저장.
		//파일을 읽어서 합계와 평균을 구하기(구분자 이용). 문자->숫자 바꾸기
		//ex) Integer.parseInt("80") + Interger.parseInt("100");
		//ex 홍길동,100,90,80이면 합계와 평균구하기
		//ex 이순신,90,80,70이면 합계와 평균구하기
		
		Scanner sc = new Scanner(System.in);
		int[] score = new int[3];
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.print("국, 영, 수 입력 : ");
		score[0] = sc.nextInt();
		score[1] = sc.nextInt();
		score[2] = sc.nextInt();
		
		try(FileWriter fw = new FileWriter("./data/practice2.txt")) {
			fw.write(name);
			fw.write(',');
			fw.write(score[0]);
			fw.write(',');
			fw.write(score[1]);
			fw.write(',');
			fw.write(score[2]);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		int ch;
		int sum=0,i=0;
		String name2="";
		//int[] score = new int[3];
		try(FileReader fr = new FileReader("./data/practice2.txt")){
			while( (ch=fr.read()) != -1) {
				if(ch==44) {
					continue;
				}else if(ch<=100){
					sum+=ch;
					i++;
				}else
					name2 += (char)ch;
			}
			System.out.println(name2+"의 성적");
			System.out.println("합계 : "+ sum+ "\t평균 : " + sum/3.0);
			//44 = ,
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("");
	}

}
