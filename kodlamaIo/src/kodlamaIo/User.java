package kodlamaIo;

public class User {

	private int id;
	private int userType;
	private String name;
	private String email;
	private String password;
	private String image;
	private String address;
	private String contact;
	
	
	public User(int id, int userType, String name, String email, String password, String image, String address,
			String contact) {
		
		this.id = id;
		this.userType = userType;
		this.name = name;
		this.email = email;
		this.password = password;
		this.image = image;
		this.address = address;
		this.contact = contact;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUserType() {
		return userType;
	}


	public void setUserType(int userType) {
		this.userType = userType;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
	
}
