package java08JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class J20210427_01_selectAll3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//employees 테이블에서 연봉이 10000이상 사원 조회,
		//employee_id, first_name, hire_date, salary
		//연봉의 내림차순으로 정렬
		Connection con = DBConn.getConnection();
		if (con == null)	return;// 커넥션 실패 시 종료
		Statement stmt = null;
		ResultSet rs = null;
		List<Employees> list = new ArrayList<>();
		
		try {
			stmt = con.createStatement();
			String sql = "select EMPLOYEE_ID, first_name, hire_date, salary\r\n" + 
					"from employees\r\n" + 
					"where salary >= 10000\r\n" + 
					"order by salary desc";
			rs = stmt.executeQuery(sql); // 조회
			while (rs.next()) {
				String employee_id = rs.getString("employee_id");
				String first_name = rs.getString("first_name");
				Date hire_date = rs.getDate("hire_date");
				int salary = rs.getInt("salary");
				Employees e = new Employees();
				e.setEmployee_id(employee_id);
				e.setFirst_name(first_name);
				e.setHire_date(hire_date);
				e.setSalary(salary);
				list.add(e);
			}

		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)	rs.close();
				if(stmt != null)	stmt.close();
				if(con != null)	con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		for(Employees em : list) {
			System.out.println(em.getEmployee_id()+" "+em.getFirst_name()+" "+em.getHire_date()+" "+em.getSalary());
		}
		
	}

}
