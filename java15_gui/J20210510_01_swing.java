package java15_gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//SWING GUI
public class J20210510_01_swing extends JFrame{
	J20210510_01_swing(){
		super("JFRAME테스트"); // 부모생성자에 이름넣기.
		setTitle("JFrame테스트"); //JFrame에 있는 메소드를 상속받아 쓴다.
		setSize(500, 300);
		
		//컴포넌트만들기
		JTextField tf = new JTextField(); //텍스트필드
		JButton btnAdd = new JButton("테스트");//버튼
		
		//컴포넌트를 올릴 컨테이너(화면) 생성
		Container con = getContentPane();
		
		//컨테이너에 컴포넌트 적재
		con.add(tf, "North");
		con.add(btnAdd, "South");
		
		setVisible(true);//true일경우 화면에 윈도우를 띄워준다.
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //윈도우가 종료될때 강제종료

	}
	public static void main(String[] args) {
		J20210510_01_swing myframe = new J20210510_01_swing();
	}

}
