package aiss.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import aiss.domain.Favourites;
import aiss.domain.User;
import aiss.domain.WordStats;
import aiss.domain.WordTranslation;

public class Repository implements RepositoryI{
	
	private Map<String,List<WordTranslation>> wordTranslations = new HashMap<>();
	private Map<String,List<Favourites>> favourites = new HashMap<>();
	private Map<String,List<WordStats>> wordStats = new HashMap<>();
	
	/*Guarda todos los usuarios mapeados con su id*/
	private Map<String,User> users = new HashMap<>();
	
	public Repository() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<WordTranslation> getAllWT(String user) {
		if(wordTranslations.containsKey(user))
			return wordTranslations.get(user);
		else
			return new ArrayList<>();
	}

	@Override
	public void saveWT(WordTranslation wt, String user) {
		List<WordTranslation> antigua = new ArrayList<>();
		if(wordTranslations.containsKey(user))
			antigua = wordTranslations.get(user);
		if(!antigua.contains(wt)){
			antigua.add(wt);
			wordTranslations.put(user, antigua);
		}
	}
	
	public void removeWT(WordTranslation wt){
		List<WordTranslation> lwt = wordTranslations.get(wt.getUser());
		lwt.remove(wt);
		wordTranslations.put(wt.getUser(), lwt);
	}
	
	/** TODO LO RELACIONADO CON LAS PALABRAS FAVORITAS*/
	
	@Override
	public List<Favourites> getAllFav(String user) {
		if(favourites.containsKey(user))
			return favourites.get(user);
		else 
			return new ArrayList<>();
	}

	@Override
	public void saveFav(String user, Favourites fav) {
		List<Favourites> antigua = new ArrayList<>();
		if(favourites.containsKey(user))
			antigua = favourites.get(user);
		if(!antigua.contains(fav)){
			antigua.add(fav);
			favourites.put(user, antigua);
		}
	}
	
	public void removeFav(Favourites fav){
		List<Favourites> lwt = favourites.get(fav.getUser());
		lwt.remove(fav);
		favourites.put(fav.getUser(), lwt);
	}
	
	/** TODO LO RELACIONADO CON LAS ESTADÍSTICAS */
	
	@Override
	public List<WordStats> getAllWS(String user) {
		if(wordStats.containsKey(user))
			return wordStats.get(user);
		else 
			return new ArrayList<>();
	}

	@Override
	public void saveWS(String user, WordStats ws) {
		List<WordStats> antigua = new ArrayList<>();
		if(wordStats.containsKey(user))
			antigua = wordStats.get(user);
		antigua.add(ws);
		wordStats.put(user, antigua);
			
	}
	
	public void updateWS(WordStats ws){
		List<WordStats> lws = new ArrayList<>();
		if(!wordStats.containsKey(ws.getUser())){
			lws.add(ws);
		}else{
			lws = wordStats.get(ws.getUser());
			lws.add(ws);
		}
		wordStats.put(ws.getUser(), lws);		
	}

	
	/** TODO LO RELACIONADO CON LA AUTENTICACIÓN */
	
	@Override
	public void saveUser(User u) {
		for(User s:users.values()){
			if(s.getName().equals(u.getName()))
				throw new IllegalArgumentException("Username already exits");
		}
		users.put(u.getName(), u);
	}

	@Override
	public String login(String name, String password) {
		String res = "NULL";
		for(User s:users.values()){
			if(s.getName().equals(name) && s.getPassword().equals(password)){
				s.generateNewToken();
				res = s.getCurrentToken();
			}
		}
		return res;
	}

	@Override
	public String getUser(String token) {
		String res = "NULL";
		for(User s:users.values())
			if(s.getCurrentToken().equals(token))
				res=s.getName();
		return res;
	}
	
	public List<User> getAllUsers(){
		return new ArrayList<>(users.values());
	}
	
	
	
}