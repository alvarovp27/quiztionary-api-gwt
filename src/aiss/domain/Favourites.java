package aiss.domain;

public class Favourites {
	private String word;
	private String user;
	
	
	public Favourites(String word) {
		super();
		this.word = word;
	}
	
	public Favourites(){
		
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
}
