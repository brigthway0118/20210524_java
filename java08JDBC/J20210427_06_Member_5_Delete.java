package java08JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class J20210427_06_Member_5_Delete {

	public void delete() {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		Member m;
		String userid = "java04";
		String sql = "delete from member where userid=?";// selectall
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 Delete");
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
