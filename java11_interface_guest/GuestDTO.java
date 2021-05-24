package java11_interface_guest;

public class GuestDTO {
	private int seq;
	private String name;
	private String email;
	private String passwd;
	private String content;
	private String regdate;
	public GuestDTO() {
		super();
	}
	public GuestDTO(String name, String email, String passwd, String content) {
		super();
		this.name = name;
		this.email = email;
		this.passwd = passwd;
		this.content = content;
	}
	public GuestDTO(int seq, String name, String email, String passwd, String content) {
		super();
		this.seq = seq;
		this.name = name;
		this.email = email;
		this.passwd = passwd;
		this.content = content;
	}
	
	public GuestDTO(int seq, String name, String email, String passwd, String content, String regdate) {
		super();
		this.seq = seq;
		this.name = name;
		this.email = email;
		this.passwd = passwd;
		this.content = content;
		this.regdate = regdate;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "GuestDTO [seq=" + seq + ", name=" + name + ", email=" + email + ", passwd=" + passwd + ", content="
				+ content + ", regdate=" + regdate + "]";
	}
}
