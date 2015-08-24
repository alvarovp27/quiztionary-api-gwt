package aiss.repository;

import java.util.List;

import aiss.domain.Favourites;
import aiss.domain.User;
import aiss.domain.WordStats;
import aiss.domain.WordTranslation;

public interface RepositoryI {
	
	public List<WordTranslation> getAllWT(String user);
	public void saveWT(WordTranslation wt, String user);
	
	public List<Favourites> getAllFav(String user);
	public void saveFav(String user, Favourites fav);
	
	public List<WordStats> getAllWS(String user);
	public void saveWS(String user, WordStats ws);
	
	/* AUTHENTICATION */
	/*Crear un nuevo usuario*/
	public void saveUser(User u);
	/*Devuelve el token del usuario al iniciar sesión*/
	public String login(String name, String password);
	//public String getToken(int id);
	/*Devuelve el id del user a partir del token*/
	public String getUser(String token);
	public List<User> getAllUsers();
	
	
}
