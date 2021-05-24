package java08JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class J20210427_06_Member_3_Insert {

	public void insert() {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		Member m;
		String userid = "java04";
		String passwd = "db04";
		int birthyear = 2014 ;
		String sql = "insert into member(userid, passwd, birthyear) values(?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, passwd);
			pstmt.setInt(3, birthyear);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 insert");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
