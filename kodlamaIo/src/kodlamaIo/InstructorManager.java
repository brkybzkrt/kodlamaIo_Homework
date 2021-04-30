package kodlamaIo;

public class InstructorManager extends UserManager {

	//Course ad�nda bir class tan�mlayarak ekleyece�imiz kurslar� onunla olu�tururuz. Burada ki metotlarda sadece sim�le ettik.
	
	public void CreateACourse(Instructor instructor,String educationName) {
		System.out.println("Say�n "+instructor.getName()+" "+educationName+" adl� kursunuz olu�turuldu.");
		
		
	}
	
	public void RemoveACourse(Instructor instructor,String educationName) {
		System.out.println("Say�n "+instructor.getName()+" "+educationName+" adl� kursunuz kald�r�ld�.");
		
		
	}
	
	public void getCountOfStudentsInTheCourse(Instructor instructor,String educationName) {
		
		
		System.out.println("Say�n "+instructor.getName()+" kursundaki ��renci say�s� ...d�r"); // bir course nesnesi olu�turup oradaki ��renci say�s�n� d�nd�rece�iz
	}
	
}
