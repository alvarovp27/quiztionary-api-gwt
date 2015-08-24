package aiss.domain;
import java.util.Random;
public class User {
	//private static Integer idCounter;
	
	
	private String name;
	private String password;
	private String currentToken;
	
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public User(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCurrentToken() {
		return currentToken;
	}
	public void generateNewToken() {
		String SALTCHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        this.currentToken=saltStr;
	}
}
