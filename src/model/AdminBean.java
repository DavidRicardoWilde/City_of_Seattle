package model;

public class AdminBean {
	//property
	private int adminid;
	private String username;
	private String password;
	private String role;
	private String email;
	
	public AdminBean(){
		
	}
	
	//get-set function
	public void setAdminid(int adminid){
		this.adminid=adminid;
	}
	public int getAdminid(){
		return adminid;
	}
	
	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
		return username;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
	
	public void setRole(String role){
		this.role=role;
	}
	public String getRole(){
		return role;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
}
