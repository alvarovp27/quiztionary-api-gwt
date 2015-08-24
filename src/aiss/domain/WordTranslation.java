package aiss.domain;

public class WordTranslation {
	private String wordSP;
	private String typeSP;
	private String wordEN;
	private String typeEN;
	private String category;
	private String user;
	
	/*public WordTranslation(String wordSP, String typeSP, String wordEN,
			String typeEN, int userID) {
		super();
		this.wordSP = wordSP;
		this.typeSP = typeSP;
		this.wordEN = wordEN;
		this.typeEN = typeEN;
		this.userID = userID;
	}*/
	
	public WordTranslation(String wordSP, String typeSP, String wordEN,
			String typeEN, String category) {
		super();
		this.wordSP = wordSP;
		this.typeSP = typeSP;
		this.wordEN = wordEN;
		this.typeEN = typeEN;
		this.category=category;
	}
	
	public WordTranslation(){
		
	}

	public String getWordSP() {
		return wordSP;
	}

	public void setWordSP(String wordSP) {
		this.wordSP = wordSP;
	}

	public String getTypeSP() {
		return typeSP;
	}

	public void setTypeSP(String typeSP) {
		this.typeSP = typeSP;
	}

	public String getWordEN() {
		return wordEN;
	}

	public void setWordEN(String wordEN) {
		this.wordEN = wordEN;
	}

	public String getTypeEN() {
		return typeEN;
	}

	public void setTypeEN(String typeEN) {
		this.typeEN = typeEN;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((typeEN == null) ? 0 : typeEN.hashCode());
		result = prime * result + ((typeSP == null) ? 0 : typeSP.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((wordEN == null) ? 0 : wordEN.hashCode());
		result = prime * result + ((wordSP == null) ? 0 : wordSP.hashCode());
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
		WordTranslation other = (WordTranslation) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (typeEN == null) {
			if (other.typeEN != null)
				return false;
		} else if (!typeEN.equals(other.typeEN))
			return false;
		if (typeSP == null) {
			if (other.typeSP != null)
				return false;
		} else if (!typeSP.equals(other.typeSP))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (wordEN == null) {
			if (other.wordEN != null)
				return false;
		} else if (!wordEN.equals(other.wordEN))
			return false;
		if (wordSP == null) {
			if (other.wordSP != null)
				return false;
		} else if (!wordSP.equals(other.wordSP))
			return false;
		return true;
	}
}
