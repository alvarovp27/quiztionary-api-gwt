package aiss.api.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import aiss.domain.Favourites;
import aiss.domain.User;
import aiss.domain.WordStats;
import aiss.domain.WordTranslation;
import aiss.repository.Repository;

@Path("/")
public class WordTranslationResource {
	
	/* Singleton */
	
	private static WordTranslationResource _instance = null;
	
	Repository repository;
	
	
	public WordTranslationResource() {
		repository = new Repository();
		initialize();
	}

	
	
	public static WordTranslationResource getInstance() {
		if (_instance == null)
			_instance = new WordTranslationResource();
		return _instance;
	}
	
	
	
	private void initialize(){
		repository.saveWT(new WordTranslation("obtener", "v", "get", "v","verbos"),"admin");
		repository.saveWT(new WordTranslation("demoler", "v", "break down", "v","verbos"),"admin");
		repository.saveWT(new WordTranslation("ponerse", "v", "put on", "v","verbos"),"admin");
		
		User admin = new User("admin", "perrogordo");
		repository.saveUser(admin);
		
	}
	
	
	/** TODO LO RELACIONADO CON LAS TRADUCCIONES DE PALABRAS */
	@GET
	@Path("/words")
	@Produces("application/json")
	public Collection<WordTranslation> getAllByUser(@Context HttpHeaders headers){
		String userToken="";
		try{
			userToken = headers.getRequestHeader("Authentication").get(0);
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		
		if(userToken==null || userToken == ""){
			return new ArrayList<>();
		}
		String username = repository.getUser(userToken);
		if(username=="NULL"){
			return new ArrayList<>();
		}
		
		List<WordTranslation> res = new ArrayList<>(repository.getAllWT(username));
		res.addAll(repository.getAllWT("admin"));
		
		return res;
	}
	
	@POST
	@Path("/words")
	@Consumes("application/json")
	@Produces("application/json")
	public Response addWordTranslation(@Context HttpHeaders headers, WordTranslation wt){
		String userToken="";
		try{
			userToken = headers.getRequestHeader("Authentication").get(0);
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		
		
		if(userToken==null || userToken == ""){
			return Response.status(400).entity("Bad authentication token").build();
		}
		String username = repository.getUser(userToken);
		if(username=="NULL"){
			return Response.status(400).entity("Bad login").build();
		}
		
		wt.setUser(username);
		List<WordTranslation> palabras = repository.getAllWT(username);
		if(palabras.contains(wt))
			return Response.status(javax.ws.rs.core.Response.Status.CONFLICT).build();
		else
			repository.saveWT(wt, username);
		
		return Response.status(javax.ws.rs.core.Response.Status.CREATED).build();
	}
	
	/** TODO LO RELACIONADO CON LAS PALABRAS FAVORITAS */
	
	@GET
	@Path("/words/favs")
	@Produces("application/json")
	public Collection<Favourites> getFavourites(@Context HttpHeaders headers){
		String userToken="";
		try{
			userToken = headers.getRequestHeader("Authentication").get(0);
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		
		if(userToken==null || userToken == ""){
			return new ArrayList<>();
		}
		String username = repository.getUser(userToken);
		if(username=="NULL"){
			return new ArrayList<>();
		}
		return repository.getAllFav(username);
	}
	
	@POST
	@Path("/words/favs")
	@Consumes("application/json")
	@Produces("application/json")
	public Response addFavourite(@Context HttpHeaders headers, Favourites fav){
		String userToken="";
		try{
			userToken = headers.getRequestHeader("Authentication").get(0);
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		
		
		if(userToken==null || userToken == ""){
			return Response.status(400).entity("Bad authentication token").build();
		}
		String username = repository.getUser(userToken);
		if(username=="NULL"){
			return Response.status(400).entity("Bad login").build();
		}
		
		fav.setUser(username);
		List<Favourites> favourites = repository.getAllFav(username);
		if(favourites.contains(fav))
			return Response.status(javax.ws.rs.core.Response.Status.CONFLICT).build();
		else
			repository.saveFav(username, fav);
		
		return Response.status(javax.ws.rs.core.Response.Status.CREATED).build();
	}
	
	
	/** TODO LO RELACIONADO CON LAS ESTADÍSTICAS*/
	@GET
	@Path("/words/stats")
	@Produces("application/json")
	public Collection<WordStats> getAllWordStats(@Context HttpHeaders headers){
		String userToken="";
		try{
			userToken = headers.getRequestHeader("Authentication").get(0);
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		
		if(userToken==null || userToken == ""){
			return new ArrayList<>();
		}
		String username = repository.getUser(userToken);
		if(username=="NULL"){
			return new ArrayList<>();
		}
		return repository.getAllWS(username);
	}
	
	@POST
	@Path("/words/stats")
	@Consumes("application/json")
	@Produces("application/json")
	public Response addWordStats(@Context HttpHeaders headers, WordStats ws){
		String userToken="";
		try{
			userToken = headers.getRequestHeader("Authentication").get(0);
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		
		
		if(userToken==null || userToken == ""){
			return Response.status(400).entity("Bad authentication token").build();
		}
		String username = repository.getUser(userToken);
		if(username=="NULL"){
			return Response.status(400).entity("Bad login").build();
		}
		
		ws.setUser(username);
		List<WordStats> wordStats = repository.getAllWS(username);
		if(wordStats.contains(ws))
			return Response.status(javax.ws.rs.core.Response.Status.CONFLICT).build();
		else
			repository.saveWS(username, ws);
		
		return Response.status(javax.ws.rs.core.Response.Status.CREATED).build();
	}
	
	
	
	/** TODO LO RELACIONADO CON LA AUTENTICACIÓN*/
	
	@GET
	@Path("/users")
	@Produces("application/json")
	public Collection<User> getUsers(@Context HttpHeaders headers){
		String userToken="";
		try{
			userToken = headers.getRequestHeader("Authentication").get(0);
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		
		if(userToken==null || userToken == ""){
			return new ArrayList<>();
		}
		
		String username = repository.getUser(userToken);
		if(username=="admin"){
			return repository.getAllUsers();
		}
		
		return new ArrayList<>();
	}
	
	@POST
	@Path("/users/get-token")
	@Consumes("application/json")
	@Produces("application/json")
	public Response getToken(User s){
		
		String token = repository.login(s.getName(), s.getPassword());
		if(token=="NULL")
			return Response.status(400).entity("Bad login").build();
		return Response.status(200).entity("Authentication Token: "+token).build();
	}
	
	@POST
	@Path("/users/new-user")
	@Consumes("application/json")
	@Produces("application/json")
	public Response newUser(User s){
		List<User> l = repository.getAllUsers();
		for(User u:l)
			if(u.getName().equals(s.getName()))
				return Response.status(400).entity("User already exits").build();
		repository.saveUser(s);
		return getToken(s);
	}
}
