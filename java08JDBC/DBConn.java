package java08JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	//컨넥션을 return하는 메소드
	public static Connection getConnection(){
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			conn = DriverManager.getConnection(url, user, password); // 체크예외
			System.out.println("접속 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("오라클 접속 실패");
			e.printStackTrace();
		}
		return conn;
	}

}
