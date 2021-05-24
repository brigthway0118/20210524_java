package java08JDBC_sales;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void test() {
		SalesDAO sdao = new SalesDAO();
		//sdao.dailyItemSalesList();
		
		List<Map<String, Object>> list = new ArrayList<>();
		list = sdao.dailyItemSalesList();
		//System.out.println(list);
		for(Map<String, Object> m : list) {
			System.out.print(m.get("saledate")+" ");
			System.out.print(m.get("seq")+" ");
			System.out.print(m.get("itemcode")+" ");
			System.out.print(m.get("itemname")+" ");
			System.out.print(m.get("qty")+" ");
			System.out.print(m.get("amount")+" ");
			System.out.println("");
		}
		System.out.println("-------------------------------------");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	@Test
	void test2() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list = new ArrayList<>();
		list=sdao.dailyItemSumList();
		
		for(Map<String, Object> m : list) {
			System.out.println(m);
		}
	}

}
