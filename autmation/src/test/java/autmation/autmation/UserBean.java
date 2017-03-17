package autmation.autmation;

public class UserBean {
	
	/**
	 * Variable must exactly match
	 * columns in Gherkin DataTable
	 * 
	 */
	
	private String name ;
	private String username;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserBean [name=" + name + ", username=" + username + ", age=" + age + "]";
	}
	public UserBean(String name, String username, int age) {
		super();
		this.name = name;
		this.username = username;
		this.age = age;
	}
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
	
}
