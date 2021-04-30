package kodlamaIo;

public class InstructorManager extends UserManager {

	//Course adýnda bir class tanýmlayarak ekleyeceðimiz kurslarý onunla oluþtururuz. Burada ki metotlarda sadece simüle ettik.
	
	public void CreateACourse(Instructor instructor,String educationName) {
		System.out.println("Sayýn "+instructor.getName()+" "+educationName+" adlý kursunuz oluþturuldu.");
		
		
	}
	
	public void RemoveACourse(Instructor instructor,String educationName) {
		System.out.println("Sayýn "+instructor.getName()+" "+educationName+" adlý kursunuz kaldýrýldý.");
		
		
	}
	
	public void getCountOfStudentsInTheCourse(Instructor instructor,String educationName) {
		
		
		System.out.println("Sayýn "+instructor.getName()+" kursundaki öðrenci sayýsý ...dýr"); // bir course nesnesi oluþturup oradaki öðrenci sayýsýný döndüreceðiz
	}
	
}
