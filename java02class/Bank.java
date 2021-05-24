package java02class;

//은행클래스 : Bank
//필드 : 은행명(bankname), 계좌번호(bankno), 잔액(balance)
//생성자,게터,세터
public class Bank {
	private String bankName;
	private String bankNo;
	private int balance;

	public Bank(String bankName, String bankNo) {
		this.bankName = bankName;
		this.bankNo = bankNo;
	}

	Bank() {
	};

	Bank(String bankname, String bankno, int balance) {
		this.bankName = bankname;
		this.bankNo = bankno;
		this.balance = balance;
	}

	void setBankName(String bankName) {
		this.bankName = bankName;
	}

	void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	void setBalance(int balance) {
		this.balance = balance;
	}

	String getBankName() {
		return bankName;
	}

	String getBankNo() {
		return bankNo;
	}

	int getBalance() {
		return balance;
	}

	// 입금메소드
	void inputBalance(int val) {
		balance += val;
	}

	// 출금메소드
	void outputBalance(int val) {
		balance -= val;
		if(balance<0) {
			balance += val;
			System.out.println("잔액이 부족합니다");
			//return 0  출금가능
			//return -1 // 출금안됨
		}
	}

	// 오버라이딩(오버라이드) : 부모클래스의 메소드를 재정의
	// 어노테이션
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankNo=" + bankNo + ", balance=" + balance + "]";
	}

}
