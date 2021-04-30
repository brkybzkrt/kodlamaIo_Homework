package kodlamaIo;

public class Instructor extends User{

	private int educationId;
	private int countOfGiveEducation;
	
	
	
	public Instructor(int id, int userType, String name, String email, String password, String image, String address,
			String contact, int educationId, int countOfGiveEducation) 
	{
		super(id, userType, name, email, password, image, address, contact);
		this.educationId = educationId;
		this.countOfGiveEducation = countOfGiveEducation;
	}
	
	
	public int getEducationId() {
		return educationId;
	}
	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}
	public int getCountOfGiveEducation() {
		return countOfGiveEducation;
	}
	public void setCountOfGiveEducation(int countOfGiveEducation) {
		this.countOfGiveEducation = countOfGiveEducation;
	}
	
	
	
	
	
}
