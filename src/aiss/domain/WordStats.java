package aiss.domain;

public class WordStats {
	
	private String word;
	private int fails;
	private int hits;
	private String user;
	
	public WordStats(String word, int fails, int hits, String user) {
		super();
		this.word = word;
		this.fails = fails;
		this.hits = hits;
		this.user = user;
	}
	
	public WordStats(){
		
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getFails() {
		return fails;
	}

	public void setFails(int fails) {
		this.fails = fails;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}
