package kodlamaIo;

public class UserManager {

	
	public void register(User user) {
		
		System.out.println("Sayýn "+user.name+" kayýt iþleminiz gerçekleþti.");
	}
	
	public void login(User user) {
		
		
		System.out.println(user.name+" giriþiniz yapýldý.");
	}
	
	public void logout(User user) {
		
		
		System.out.println(user.name+" çýkýþýnýz yapýldý.");
	}
	
	public void editProfile(User user) {
		
		System.out.println("Profiliniz güncellenmiþtir.");
	}
	
	public void deleteAccount(User user) {
		
		
		System.out.println("Hesabýnýz silinmiþtir.");
	}
	
}
