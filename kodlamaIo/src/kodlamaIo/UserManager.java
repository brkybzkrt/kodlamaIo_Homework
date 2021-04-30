package kodlamaIo;

public class UserManager {

	
	public void register(User user) {
		
		System.out.println("Sayýn "+user.getName()+" kayýt iþleminiz gerçekleþti.");
	}
	
	public void login(User user) {
		
		
		System.out.println(user.getName()+" giriþiniz yapýldý.");
	}
	
	public void logout(User user) {
		
		
		System.out.println(user.getName()+" çýkýþýnýz yapýldý.");
	}
	
	public void editProfile(User user) {
		
		System.out.println("Profiliniz güncellenmiþtir.");
	}
	
	public void deleteAccount(User user) {
		
		
		System.out.println("Hesabýnýz silinmiþtir.");
	}
	
}
