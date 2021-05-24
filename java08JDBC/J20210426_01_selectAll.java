package java08JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.net.aso.r;

public class J20210426_01_selectAll {
	//필드위치
	public static void main(String[] args) {
		Connection conn = null; // 지역변수. 반드시 초기화 필요하다!
		
		//오라클 db연결
		try {
			//자바 프로젝트 우클릭 -> 프로퍼티스 -> 자바 빌드 패스 ->
			// 라이브러리 -> 모듈패스 -> add External jars -> ojdbc6.jar 선택
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 체크예외. 반드시 처리해줘야함
			System.out.println("드라이버 로딩 성공");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr"); // 체크예외
			System.out.println("접속 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("오라클 접속 실패");
			e.printStackTrace();
		}
		
		if(conn == null)	return;//커넥션 실패 시 종료
		
		//db 정보 select하기
		Statement stmt = null;
		ResultSet rs = null;
		List<Countries> cl = new ArrayList<>(); 
		try {
			stmt = conn.createStatement();
			String sql = "select * from countries";
			rs = stmt.executeQuery(sql); // 조회
			while(rs.next()) { // rs.next 다음줄에 데이터가 있나 없나 확인
				//rs.getString("country_id") : 읽고싶어하는 컬럼명, 혹은 컬럼번호을 가져온다.
				//즉 , country_id컬럼의 데이터를 가져온다.
//				System.out.printf("%s", rs.getString("country_id"));
//				System.out.printf("%30s", rs.getString("country_name"));
//				System.out.printf("%10s",rs.getString("region_id"));
//				System.out.println("");
				String country_id = rs.getString("country_id");
				String country_name = rs.getString("country_name");
				int region_id = rs.getInt("region_id");
				Countries cot = new Countries(country_id, country_name, region_id);
				cl.add(cot);
			}
			
		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		} finally { // 예외가 발생하든지 하지 않든지 무조건 실행
			try {
				if(rs != null)	rs.close();
				if(stmt != null)	stmt.close();
				if(conn != null)	conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//출력1
		for(int i = 0; i<cl.size(); i++) {
			//System.out.println(cl.get(i));
			Countries c = cl.get(i);
			System.out.println(c.getCountry_id()+" "+c.getCountry_name()+" "+c.getRegion_id());
		}
		
		System.out.println("=================================================");
		//출력2
		for(Countries c : cl) {
			System.out.println(c.getCountry_id()+" "+c.getCountry_name()+" "+c.getRegion_id());
		}
		
		
		
	}
}
