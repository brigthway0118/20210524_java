package java08JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class J20210427_06_Member_4_Update {

	public void update() {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		Member m;
		String userid = "java03";
		int birthyear = 2013 ;
		String sql = "update member set birthyear=? where userid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, birthyear);
			pstmt.setString(2, userid);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 update");
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
