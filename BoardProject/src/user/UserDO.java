package user;

public class UserDO{
	//필드 선언(멤버변수)
	private String id;			//userID
	private String password;	//패스워드
	private String name;		//이름
	private String role;		//역할
	
	//각 필드 하나당 getter, setter 메소드 구현
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
