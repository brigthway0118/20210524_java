package java11_interface_corner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	//싱글톤패턴 : 인스턴스를 하나만 생성해서 재사용하는 것.
	private static Connection conn = null;
	// static으로 만들어줘서 함수 호출 후 Connection을 생성 후 close종료 전까지 null값이 아니게 한다.
	// 밖에서 Connection 상황을 바꾸지 못하게 private 설정.
	public static Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		
		try {
			//만약 커넥션 객체가 null이거나 커넥션이 끊어졌다면...
			if(conn == null || conn.isClosed()) {			
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//컨넥션객체 생성
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("컨넥션객체 생성 실패");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	//커넥션 접속해제 메소드
	public static void dbClose() {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("DB연결 해제");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
}
