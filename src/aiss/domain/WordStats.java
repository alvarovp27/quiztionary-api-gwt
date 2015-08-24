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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordStats other = (WordStats) obj;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
	
	
	
}
