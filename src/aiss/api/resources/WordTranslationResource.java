package aiss.api.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

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
		repository.saveWT(new WordTranslation("averiarse","v","break down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("romperse","v","break down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("llorar","v","break down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("colapsar","v","break down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("hundirse","v","break down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("derribar","v","break down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("echar abajo","loc v","break down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("irrumpir","v","break in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("forzar la entrada","loc v","break in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("deshacerse","v","break up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("desintegrarse","v","break up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("separarse","v","break up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("dividir","v","break up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("destruir","v","break up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("criar","v","bring up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("exigir","v","call for","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("llamar a","loc v","call for","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("requerir","v","call for","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("hacer pasar","loc v","call in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("hacer entrar","loc v","call in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("decir que entre","loc v","call in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("seguir","v","carry on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("proseguir","v","carry on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("continuar","v","carry on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("hacer","v","carry out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("realizar","v","carry out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("llevar a cabo","loc v","carry out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("coquetear","v","come on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("tachar","v","cross out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("cortar en pedazos","loc v","cut up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("trocear","v","cut up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("picar","v","cut up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("resolver algo","loc v","deal with","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("negociar algo","loc v","deal with","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("tratar algo","loc v","deal with","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("ocuparse de algo","loc v","deal with","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("depender de","loc v","depend on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("depender de","loc v","depend upon","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("acabar en","loc v","end up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("terminar en","loc v","end up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("llegar","v","end up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("completar","v","fill in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("rellenar","v","fill in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("sustituir","v","fill in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("llenar","v","fill up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("descubrir","v","find out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("enterarse de","loc v","find out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("llevarse bien","loc v","get along","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("volver","v","get back","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("devolver","v","get back","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("bajar","v","get down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("mantenerse en forma","loc v","get fit","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("llegar a casa","loc v","get in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("entrar","v","get in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("meterse","v","get in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("subir","v","get in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("bajarse","v","get off","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("molar","v","get off","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("llevarse bien","loc v","get on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("estar bien","loc v","get on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("abordar","v","get on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("subirse","v","get on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("meterse","v","get into","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("subirse","v","get into","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("devolver","v","give back","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("darse por vencido","loc v","give in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("rendirse","v","give in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("dar","v","give out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("emitir","v","give out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("repartir algo","loc v","give out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("dejar","v","give up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("abandonar","v","give up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("darse por vencido","loc v","give up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("donar","v","give away","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("elegir","v","go for","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("decantarse","v","go for","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("decidirse","v","go for","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("explotar","v","go off","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("sonar","v","go off","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("pasarse","v","go off","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("partir","v","go on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("salir","v","go on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("ir","v","go on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("continuar","v","go on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("proseguir","v","go on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("salir","v","go out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("apagarse","v","go out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("entregar","v","hand in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("distribuir","v","hand out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("repartir","v","hand out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("pasar el rato","loc v","hang out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("colgar","v","hang out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("colgar","v","hang up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("cortar","v","hang up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("detener","v","hang up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("contener","v","keep in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("reprimir","v","keep in","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("seguir","v","keep on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("persistir en","loc v","keep on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("insistir","v","keep on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("seguir el ritmo","loc v","keep up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("acostarse","v","lie down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("tumbarse","v","lie down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("echarse","v","lie down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("velar por","loc v","look after","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("cuidar","v","look after","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("ocuparse de","loc v","look after","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("mirar a alguien de reojo","loc v","look at","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("mirar de reojo","loc v","look at","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("mirar con suspicacia","loc v","look at","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("buscar","v","look for","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("ansiar","v","look forward to","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("anhelar","v","look forward to","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("tener muchas ganas de","loc v","look forward to","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("parecer","v","look like","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("parecerse","v","look like","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("tener cuidado","loc v","look out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("estar atento","loc v","look out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("elevar la vista","loc v","look up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("buscar","v","look up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("elevar la mirada","loc v","look up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("mirar hacia arriba","loc v","look up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("mirar por","loc v","look through","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("mirar a través de","loc v","look through","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("recoger","v","pick up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("ordenar","v","put away","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("guardar","v","put away","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("apartar","v","put away","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("hablar mal de alguien","loc v","put down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("menospreciar","v","put down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("sacrificar","v","put down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("desalentar","v","put off","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("posponer","v","put off","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("ponerse","v","put on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("ponerse ropa","loc v","put on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("incomodar","v","put out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("apagar","v","put out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("hacer pasar","loc v","put through","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("aprobar","v","put through","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("colgar","v","put up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("desplegar","v","put up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("subir","v","put up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("levantar","v","put up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("volver a llamar","loc v","ring back","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("lamar por teléfono","loc v","ring up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("marcar","v","ring up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("salir","v","set off","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("partir","v","set off","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("activar","v","set off","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("disparar","v","set off","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("salir de viaje","loc v","set out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("partir","v","set out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("instalar","v","set up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("fundar","v","set up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("armar","v","set up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("sentarse","v","sit down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("quedarse","v","saty behind","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("encargarse de","loc v","take care of","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("ocuparse de","loc v","take care of","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("cuidar de","loc v","take care of","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("quitar","v","take away","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("requisar","v","take away","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("confiscar","v","take away","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("despegar","v","take off","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("participar","v","take part","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("tener lugar","loc v","take place","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("empezar a hacer","loc v","take up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("comenzar","v","take up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("iniciar","v","take up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("emprender","v","take up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("tirar","v","throw away","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("organizar","v","tidy up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("arreglar","v","tidy up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("probarse","v","try on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("probarse ropa","loc v","try on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("rechazar","v","turn down","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("convertirse en","loc v","turn into","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("transformarse en","loc v","turn into","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("girar","v","turn into","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("apagar","v","turn off","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("salirse de","loc v","turn off","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("encender","v","turn on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("volverse en contra de","loc v","turn on","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("dejarse caer","loc v","turn up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("caer","v","turn up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("aparecer","v","turn up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("subir","v","turn up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("despertarse","v","wake up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("arrastrar","v","wash up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("fregar","v","wash up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("lavar","v","wash up","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("agotar","v","wear out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("cansar","v","wear out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("fatigar","v","wear out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("ejercitarse","v","work out","phr v","phrasal verbs"), "admin");
		repository.saveWT(new WordTranslation("hacer ejercicio","loc v","work out","phr v","phrasal verbs"), "admin");
		
		User admin = new User("admin", "perrogordo");
		
		repository.saveUser(admin);
		
		Favourites fav = new Favourites("break down");
		fav.setUser("admin");
		repository.saveFav("admin", fav);
		
		WordStats ws = new WordStats("break down", 1, 10);
		ws.setUser("admin");
		repository.saveWS("admin", ws);
		
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
		if(!username.equals("admin"))
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
	
	@DELETE
	@Path("/words/{wordSP}/{typeSP}/{wordEN}/{typeEN}/{category}")
	@Produces("application/json")
	public Response removeWT(@Context HttpHeaders headers, 
			@PathParam("wordSP") String wordSP,
			@PathParam("typeSP") String typeSP,
			@PathParam("wordEN") String wordEN,
			@PathParam("typeEN") String typeEN,
			@PathParam("category") String category){
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
		
		WordTranslation toDelete = new WordTranslation(wordSP, typeSP, wordEN, typeEN, category);
		toDelete.setUser(username);
		
		repository.removeWT(toDelete);
		
		return Response.status(204).entity("Deleted").build();
		
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
	
	@DELETE
	@Path("/words/favs/{word}")
	@Produces("application/json")
	public Response removeFav(@Context HttpHeaders headers, 
			@PathParam("word") String word){
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
		
		Favourites toDelete = new Favourites(word);
		toDelete.setUser(username);
		
		repository.removeFav(toDelete);
		
		return Response.status(204).entity("Deleted").build();
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
	
	@PUT
	@Path("/words/stats/{word}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response updateWS(@Context HttpHeaders headers,
			@PathParam("word") String word,
			WordStats ws){
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
		
		WordStats aux = new WordStats(ws.getWord(), ws.getFails(), ws.getHits());
		aux.setUser(username);
		repository.updateWS(aux);
	
		return Response.status(204).entity("Updated").build();
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
	
	@GET
	@Path("/users/is-token-available/{token}")
	@Produces("application/json")
	public Response isTokenAvailable(@PathParam("token") String token){
		for(User u:repository.getAllUsers()){
			try{
				if(u.getCurrentToken().equals(token))
					return Response.status(304).entity("Right token").build();
			}catch(NullPointerException e){
				e.printStackTrace();
			}
		}
		return Response.status(404).entity("Token expired").build();
	}
}
