package java08JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J20210427_03_update {

	public static void main(String[] args) {
		// 수정 DML : Update
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		
		String itemcode = "8801";
		String itemname = "코카콜라";
		
		String sql = "update item set ITEMNAME=?\r\n" + 
				"where itemcode=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, itemname);
			pstmt.setString(2, itemcode);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 수정");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
