package kodlamaIo;

public class Student extends User{


	int educationId;
	int countOfOwnedEducation;
	
	public Student(int id, int userType, String name, String email, String password, String image, String address,
			String contact, int educationId, int countOfOwnedEducation) 
	{
		super(id, userType, name, email, password, image, address, contact);
		this.educationId = educationId;
		this.countOfOwnedEducation = countOfOwnedEducation;
	}

	
	public int getEducationId() {
		return educationId;
	}

	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}

	public int getCountOfOwnedEducation() {
		return countOfOwnedEducation;
	}

	public void setCountOfOwnedEducation(int countOfOwnedEducation) {
		this.countOfOwnedEducation = countOfOwnedEducation;
	}
	
	
	
	
	
	
}
