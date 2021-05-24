package java11_interface_corner;

import java.util.ArrayList;
import java.util.List;

interface ProductCorner{
	void productNamePrint();
	public List<String> getProductItem();
	public void setProductItem(String...s);
}

interface MeatCorner{
	void MeatNamePrint();
	public List<String> getMeatItem();
	public void setMeatItem(List<String> meatItem);
}

interface ClothCorner{
	void clothNamePrint(String...s);
	public List<String> getClothItem();
	public void setClothItem(List<String> clothItem);
}
class HeadOffice{
	private String companyName = "국제마트";
	private String registrationNumber="123-12-1212";
	void companyInfoPrint() {
		System.out.println("===== "+companyName+" =====");
		System.out.println("[NO] : "+registrationNumber);
	}
}
class Branch1 extends HeadOffice implements ProductCorner, MeatCorner{
	private String branchName="신림점";
	private List<String> meatItem;
	private List<String> productItem = new ArrayList<>();

	@Override
	public List<String> getMeatItem() {
		return meatItem;
	}

	@Override
	public void setMeatItem(List<String> meatItem) {
		this.meatItem = meatItem;
	}

	@Override
	public List<String> getProductItem() {
		return productItem;
	}

	@Override
	public void setProductItem(String...s) {
		for(String item : s) {
			this.productItem.add(item);
		}
	}
	
	@Override
	public void MeatNamePrint() {
		System.out.println("["+branchName+"] 정육점 코너");
		System.out.print("***");
		for(String item : meatItem) {
			System.out.print(item + " ");
		}
		System.out.println("");
	}

	@Override
	public void productNamePrint() {
		System.out.println("["+branchName + "] 공산품 코너");
		System.out.print("***");
		for(String a : productItem) {
			System.out.print(a + " ");
		}
		System.out.println("");
	}

	
	
}
public class J20210507_01_mart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branch1 b1 = new Branch1();
		b1.companyInfoPrint();
		System.out.println("-----------------------------");
//		b1.productNamePrine("생활용품","문구","침구","가전제품");
//		
//		b1.MeatNamePrint();
		//공산품코너 가변인자
		//b1.MeatNamePrint("돼지고기","소고기","닭고기");
		b1.setProductItem("생활용품","문구","침구","가전제품");
		b1.productNamePrint();
		//고기코너 리스트
		List<String> meatItem = new ArrayList<>();
		meatItem.add("소고기");
		meatItem.add("돼지고기");
		b1.setMeatItem(meatItem);
		b1.MeatNamePrint();

	}

}
