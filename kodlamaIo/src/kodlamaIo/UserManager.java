package kodlamaIo;

public class UserManager {

	
	public void register(User user) {
		
		System.out.println("Say�n "+user.getName()+" kay�t i�leminiz ger�ekle�ti.");
	}
	
	public void login(User user) {
		
		
		System.out.println(user.getName()+" giri�iniz yap�ld�.");
	}
	
	public void logout(User user) {
		
		
		System.out.println(user.getName()+" ��k���n�z yap�ld�.");
	}
	
	public void editProfile(User user) {
		
		System.out.println("Profiliniz g�ncellenmi�tir.");
	}
	
	public void deleteAccount(User user) {
		
		
		System.out.println("Hesab�n�z silinmi�tir.");
	}
	
}
