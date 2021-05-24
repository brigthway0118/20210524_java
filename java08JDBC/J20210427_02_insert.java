package java08JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class J20210427_02_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오라클에 데이터 추가 : insert
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null; // sql문을 간결하게, 보안측면에서 우수하다
		//Statement stmt = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품코드 : ");
		String itemcode = sc.nextLine();
		System.out.print("상 품 명 : ");
		String itemname = sc.nextLine();
		System.out.print("상품단가 : ");
		int price = sc.nextInt();
		//String sql = "insert into item (itemcode, itemname, price) values('"+itemcode+"', '"+itemname+"', "+price+")";
		String sql = "insert into item (itemcode, itemname, price) values(?,?,?)";// values(1,2,3) 인덱스를 가진다
		//System.out.println(sql); //sql문 확인
		//insert into item (itemcode, itemname, price) values('8811', '감자깡', 2000)
		try {
			//stmt = conn.createStatement();
			
			pstmt = conn.prepareStatement(sql);
			//sql문에 있는 ?에 값을 대치한다.
			pstmt.setString(1, itemcode);
			pstmt.setString(2, itemname);
			pstmt.setInt(3, price);
			
			int cnt = pstmt.executeUpdate(); // 변경이 됐을때 얼마나 변경이 되었나.. 지금은 한 개의 insert문이므로 1을 반환.
			System.out.println(cnt+"건");
			//자바에서는 autocommite이다. 롤백하고 싶은경우 옵션으로 autocommit을 꺼야한다.
		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		} finally {
		}
		
		System.out.println("프로그램 종료");
	}

}
