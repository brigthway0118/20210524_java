package java08JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210426_02_selectAll2 {

	public static void main(String[] args) {
		//커넥션 객체얻기
		//DBConn dbc = new DBConn();
		Connection conn = DBConn.getConnection();
		if (conn == null)
			return;// 커넥션 실패 시 종료

		Statement stmt = null;
		ResultSet rs = null;
		List<Regions> rl = new ArrayList<>();
		
		try {
			stmt = conn.createStatement();
			String sql = "select * from regions";
			rs = stmt.executeQuery(sql); // 조회
			while (rs.next()) {
				int region_id = rs.getInt("region_id");
				String region_name = rs.getString("region_name");
				Regions r = new Regions(region_id, region_name);
				//객체를 외부에 생성하면 안된다. Heap공간에 List가 한 객체를 공유하기 때문에 값이 통일된다.
				rl.add(r);
//				r.setRegion_id(region_id);
//				r.setRegion_name(region_name);
//				rl.add(r);
			}

		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)	rs.close();
				if(stmt != null)	stmt.close();
				if(conn != null)	conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		for(Regions r : rl) {
			System.out.println(r.getRegion_id()+" "+r.getRegion_name());
		}
		
	}

}
