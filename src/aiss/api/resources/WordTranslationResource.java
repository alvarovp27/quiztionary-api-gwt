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

import org.apache.juli.logging.Log;

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
		repository.saveWT(new WordTranslation("mirar a trav\u00E9s de","loc v","look through","phr v","phrasal verbs"), "admin");
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
		repository.saveWT(new WordTranslation("lamar por tel\u00E9fono","loc v","ring up","phr v","phrasal verbs"), "admin");
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
		
		//TODO CLOTHES AND ACCESSORIES
		repository.saveWT(new WordTranslation("mochila","n","backpack","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("maleta","n","bag","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("bolsa","n","bag","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("cintur\u00F3n","n","belt","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("correa","n","belt","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("blusa","n","blouse","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("bota","n","boot","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("brazalete","n","bracelet","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("pulsera","n","bracelet","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("bot\u00F3n","n","button","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("gorro","n","cap","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("gorra","n","cap","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("cadena","n","chain","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("ropas","n","clothes","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("chaquet\u00F3n","n","coat","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("abrigo","n","coat","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("cuello","n","collar","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("algod\u00F3n","n","cotton","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("vestido","n","dress","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("zarcillo","n","earring","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("pendiente","n","earring","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("moda","n","fashion","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("pliegue","n","fold","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("arruga","n","fold","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("gafas","n","glasses","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("guante","n","glove","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("cartera","n","handbag","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("bolso","n","handbag","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("pa\u00F1uelo","n","handkerchief","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("sombrero","n","hat","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("chaqueta","n","jacket","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("pantalones vaqueros","loc n","jeans","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("joyer\u00EDa","n","jewellery","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("joyer\u00EDa","n","jewelry","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("su\u00E9ter","n","jumper","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("jersey","n","jumper","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("conjunto","n","kit","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("etiqueta","n","label","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("ropa sucia","loc n","laundry","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("colada","n","laundry","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("cuero","n","leather","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("piel","n","leather","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("maquillaje","n","make-up","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("material","n","material","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("tela","n","material","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("collar","n","necklace","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("pantalones","n","pants","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("bragas","n","pants","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("calzoncillos","n","pants","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("estampado","n","pattern","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("adorno","n","pattern","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("patr\u00F3n","n","pattern","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("perfume","n","perfume","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("colonia","n","perfume","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("pl\u00E1stico","n","plastic","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("bolsillo","n","pocket","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("su\u00E9ter","n","pullover","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("jersey","n","pullover","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("cartera","n","purse","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("impermeable","n","raincoat","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("chubasquero","n","raincoat","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("anillo","n","ring","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("bufanda","n","scarf","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("camisa","n","shirt","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("zapato","n","shoe","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("pantalones cortos","loc n","shorts","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("seda","n","silk","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("talla","n","size","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("tama\u00F1o","n","size","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("falda","n","skirt","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("manga","n","sleeve","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("calcetines","n","socks","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("franja","n","stripe","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("ralla","n","stripe","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("l\u00EDnea","n","stripe","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("traje","n","suit","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("gafas de sol","loc n","sunglasses","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("su\u00E9ter","n","sweater","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("jersey","n","sweater","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("su\u00E9ter","n","sweatshirt","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("jersey","n","sweatshirt","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("sudadera","n","sweatshirt","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("ba\u00F1ador","n","swimming costume","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("traje de ba\u00F1o","loc n","swimming costume","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("ch\u00E1ndal","n","tracksuit","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("botines","n","trainers","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("pantal\u00F3n","n","trousers","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("pantalones","n","trousers","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("camiseta","n","T-shirt","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("sandalia","n","sandal","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("ba\u00F1ador","n","swimsuit","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("traje de ba\u00F1o","loc n","swimsuit","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("paraguas","n","umbrella","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("calzoncillos","n","underpants","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("ropa interior","loc n","underwear","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("uniforme","n","uniform","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("cartera","n","wallet","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("billetera","n","wallet","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("monedero","n","wallet","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("reloj","n","watch","n","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("lana","n","wool","n","clothes and accessories"), "admin");
		
		repository.saveWT(new WordTranslation("anticuado","adj","old-fashioned","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("anticuada","adj","old-fashioned","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("de cuero","loc adj","leather","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("de pl\u00E1stico","loc adj","plastic","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("sin botones","loc adj","pullover","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("cerrado","adj","pullover","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("de seda","loc adj","silk","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("atar","v","fasten","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("amarrar","v","fasten","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("abrochar","v","fasten","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("entrar en","loc v","fit","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("caber","v","fit","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("entrar","v","fit","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("quedar bien","loc v","fit","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("plegar","v","fold","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("doblar","v","fold","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("emparejar","v","match","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("combinar","v","match","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("desvestirse","v","undress","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("quitarse la ropa","loc v","undress","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("llevar puesto","loc v","wear","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("ponerse","v","wear","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("tejer","v","knit","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("hacer punto","loc v","knit","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("combinar con","loc v","go with","phr v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("pegar con","loc v","go with","phr v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("hacer juego con","loc v","go with","phr v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("combinar con","loc v","go together","phr v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("pegar con","loc v","go together","phr v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("hacer juego con","loc v","go together","phr v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("ponerse","v","put on","phr v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("quitarse","v","take off","phr v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("probarse","v","try on","phr v","clothes and accessories"), "admin");

		//TODO education
		repository.saveWT(new WordTranslation("aritm\u00E9tica","n","arithmetic","n","education"), "admin");
		repository.saveWT(new WordTranslation("arte","n","art","n","education"), "admin");
		repository.saveWT(new WordTranslation("campana","n","bell","n","education"), "admin");
		repository.saveWT(new WordTranslation("timbre","n","bell","n","education"), "admin");
		repository.saveWT(new WordTranslation("biolog\u00EDa","n","biology","n","education"), "admin");
		repository.saveWT(new WordTranslation("pizarra","n","blackboard","n","education"), "admin");
		repository.saveWT(new WordTranslation("tabl\u00F3n","n","board","n","education"), "admin");
		repository.saveWT(new WordTranslation("libro","n","book","n","education"), "admin");
		repository.saveWT(new WordTranslation("estanter\u00EDa","n","bookshelf","n","education"), "admin");
		repository.saveWT(new WordTranslation("estante","n","bookshelf","n","education"), "admin");
		repository.saveWT(new WordTranslation("descanso","n","break","n","education"), "admin");
		repository.saveWT(new WordTranslation("pausa","n","break","n","education"), "admin");
		repository.saveWT(new WordTranslation("recreo","n","break","n","education"), "admin");
		repository.saveWT(new WordTranslation("certificado","n","certificate","n","education"), "admin");
		repository.saveWT(new WordTranslation("diploma","n","certificate","n","education"), "admin");
		repository.saveWT(new WordTranslation("qu\u00EDmica","n","chemistry","n","education"), "admin");
		repository.saveWT(new WordTranslation("clase","n","class","n","education"), "admin");
		repository.saveWT(new WordTranslation("hora","n","class","n","education"), "admin");
		repository.saveWT(new WordTranslation("clase","n","classroom","n","education"), "admin");
		repository.saveWT(new WordTranslation("aula","n","classroom","n","education"), "admin");
		repository.saveWT(new WordTranslation("entrenador","n","coach","n","education"), "admin");
		repository.saveWT(new WordTranslation("profesor","n","coach","n","education"), "admin");
		repository.saveWT(new WordTranslation("instructor","n","coach","n","education"), "admin");
		repository.saveWT(new WordTranslation("universidad","n","college","n","education"), "admin");
		repository.saveWT(new WordTranslation("instituto","n","college","n","education"), "admin");
		repository.saveWT(new WordTranslation("escuela profesional","loc n","college","n","education"), "admin");
		repository.saveWT(new WordTranslation("facultad","n","college","n","education"), "admin");
		repository.saveWT(new WordTranslation("composici\u00F3n","n","composition","n","education"), "admin");
		repository.saveWT(new WordTranslation("redacci\u00F3n","n","composition","n","education"), "admin");
		repository.saveWT(new WordTranslation("curso","n","course","n","education"), "admin");
		repository.saveWT(new WordTranslation("curriculum","n","curriculum","n","education"), "admin");
		repository.saveWT(new WordTranslation("grado","n","degree","n","education"), "admin");
		repository.saveWT(new WordTranslation("escritorio","n","desk","n","education"), "admin");
		repository.saveWT(new WordTranslation("pupitre","n","desk","n","education"), "admin");
		repository.saveWT(new WordTranslation("diccionario","n","dictionary","n","education"), "admin");
		repository.saveWT(new WordTranslation("t\u00EDtulo","n","diploma","n","education"), "admin");
		repository.saveWT(new WordTranslation("diploma","n","diploma","n","education"), "admin");
		repository.saveWT(new WordTranslation("drama","n","drama","n","education"), "admin");
		repository.saveWT(new WordTranslation("teatro","n","drama","n","education"), "admin");
		repository.saveWT(new WordTranslation("rentabilidad","n","economics","n","education"), "admin");
		repository.saveWT(new WordTranslation("econom\u00EDa","n","economics","n","education"), "admin");
		repository.saveWT(new WordTranslation("ensayo","n","essay","n","education"), "admin");
		repository.saveWT(new WordTranslation("redacci\u00F3n","n","essay","n","education"), "admin");
		repository.saveWT(new WordTranslation("disertaci\u00F3n","n","essay","n","education"), "admin");
		repository.saveWT(new WordTranslation("geograf\u00EDa","n","geography","n","education"), "admin");
		repository.saveWT(new WordTranslation("historia","n","history","n","education"), "admin");
		repository.saveWT(new WordTranslation("escritura a mano","loc n","handwritting","n","education"), "admin");
		repository.saveWT(new WordTranslation("caligraf\u00EDa","n","handwritting","n","education"), "admin");
		repository.saveWT(new WordTranslation("escritura","n","handwritting","n","education"), "admin");
		repository.saveWT(new WordTranslation("deberes","n","homework","n","education"), "admin");
		repository.saveWT(new WordTranslation("informaci\u00F3n","n","information","n","education"), "admin");
		repository.saveWT(new WordTranslation("datos","n","information","n","education"), "admin");
		repository.saveWT(new WordTranslation("instrucciones","n","instructions","n","education"), "admin");
		repository.saveWT(new WordTranslation("adiestramiento","n","instructions","n","education"), "admin");
		repository.saveWT(new WordTranslation("instructor","n","instructor","n","education"), "admin");
		repository.saveWT(new WordTranslation("monitor","n","instructor","n","education"), "admin");
		repository.saveWT(new WordTranslation("profesor","n","instructor","n","education"), "admin");
		repository.saveWT(new WordTranslation("TIC","n","IT","n","education"), "admin");
		repository.saveWT(new WordTranslation("laboratorio","n","laboratory","n","education"), "admin");
		repository.saveWT(new WordTranslation("lengua","n","language","n","education"), "admin");
		repository.saveWT(new WordTranslation("lenguaje","n","language","n","education"), "admin");
		repository.saveWT(new WordTranslation("idioma","n","language","n","education"), "admin");
		repository.saveWT(new WordTranslation("clase","n","lesson","n","education"), "admin");
		repository.saveWT(new WordTranslation("lecci\u00F3n","n","lesson","n","education"), "admin");
		repository.saveWT(new WordTranslation("nivel","n","level","n","education"), "admin");
		repository.saveWT(new WordTranslation("biblioteca","n","library","n","education"), "admin");
		repository.saveWT(new WordTranslation("nota","n","mark","n","education"), "admin");
		repository.saveWT(new WordTranslation("matem\u00E1ticas","n","mathematics","n","education"), "admin");
		repository.saveWT(new WordTranslation("matem\u00E1ticas","n","maths","n","education"), "admin");
		repository.saveWT(new WordTranslation("mates","n","maths","n","education"), "admin");
		repository.saveWT(new WordTranslation("m\u00FAsica","n","music","n","education"), "admin");
		repository.saveWT(new WordTranslation("nota","n","note","n","education"), "admin");
		repository.saveWT(new WordTranslation("tabl\u00F3n de anuncios","loc n","notice broad","n","education"), "admin");
		repository.saveWT(new WordTranslation("escuela primaria","loc n","primary school","n","education"), "admin");
		repository.saveWT(new WordTranslation("proyecto","n","project","n","education"), "admin");
		repository.saveWT(new WordTranslation("alumno","n","pupil","n","education"), "admin");
		repository.saveWT(new WordTranslation("pupilo","n","pupil","n","education"), "admin");
		repository.saveWT(new WordTranslation("certificaci\u00F3n","n","qualification","n","education"), "admin");
		repository.saveWT(new WordTranslation("t\u00EDtulo","n","qualification","n","education"), "admin");
		repository.saveWT(new WordTranslation("certificado","n","qualification","n","education"), "admin");
		repository.saveWT(new WordTranslation("cualificaci\u00F3n","n","qualification","n","education"), "admin");
		repository.saveWT(new WordTranslation("goma","n","rubber","n","education"), "admin");
		repository.saveWT(new WordTranslation("borrador","n","rubber","n","education"), "admin");
		repository.saveWT(new WordTranslation("goma de borrar","loc n","rubber","n","education"), "admin");
		repository.saveWT(new WordTranslation("goma de borrar","loc n","eraser","n","education"), "admin");
		repository.saveWT(new WordTranslation("regla","n","ruler","n","education"), "admin");
		repository.saveWT(new WordTranslation("colegio","n","school","n","education"), "admin");
		repository.saveWT(new WordTranslation("escuela","n","school","n","education"), "admin");
		repository.saveWT(new WordTranslation("ciencia","n","science","n","education"), "admin");
		repository.saveWT(new WordTranslation("escuela secundaria","loc n","secondary school","n","education"), "admin");
		repository.saveWT(new WordTranslation("estudiante","n","student","n","education"), "admin");
		repository.saveWT(new WordTranslation("estudios","n","studies","n","education"), "admin");
		repository.saveWT(new WordTranslation("asignatura","n","subject","n","education"), "admin");
		repository.saveWT(new WordTranslation("profesor","n","teacher","n","education"), "admin");
		repository.saveWT(new WordTranslation("profesora","n","teacher","n","education"), "admin");
		repository.saveWT(new WordTranslation("maestra","n","teacher","n","education"), "admin");
		repository.saveWT(new WordTranslation("tecnolog\u00EDa","n","technology","n","education"), "admin");
		repository.saveWT(new WordTranslation("trimestre","n","term","n","education"), "admin");
		repository.saveWT(new WordTranslation("examen","n","test","n","education"), "admin");
		repository.saveWT(new WordTranslation("prueba","n","test","n","education"), "admin");
		repository.saveWT(new WordTranslation("universidad","n","university","n","education"), "admin");
		repository.saveWT(new WordTranslation("ausente","adj","absent","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("avanzado","adj","advanced","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("adelantado","adj","advanced","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("superior","adj","advanced","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("principiante","adj","beginner","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("novato","adj","beginner","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("listo","adj","clever","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("ingenioso","adj","clever","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("inteligente","adj","clever","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("elemental","adj","elementary","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("b\u00E1sico","adj","elementary","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("fundamental","adj","elementary","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("intermedio","adj","intermediate","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("a nivel","loc adj","level","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("nivelado","adj","level","adj","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("saber","v","know","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("conocer","v","know","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("aprender","v","learn","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("memorizar","v","learn","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("calificar","v","mark","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("darse cuenta","loc v","note","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("notar","v","note","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("leer","v","read","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("inscribirse","v","register","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("apuntarse","v","register","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("reordar","v","remember","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("estudiar","v","study","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("ense\u00F1ar","v","teach","v","clothes and accessories"), "admin");
		repository.saveWT(new WordTranslation("borrar","v","erase","v","clothes and accessories"), "admin");

		//TODO ENTERTAINMENT AND MEDIA
		repository.saveWT(new WordTranslation("acto","n","act","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("teatro","n","act","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("actuaci\u00F3n","n","act","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("acci\u00F3n","n","action","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("trama","n","action","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("actor","n","actor","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("actriz","n","actress","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("anuncio","n","ad","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("comercial","n","ad","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("spot","n","ad","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("art\u00EDculo","n","article","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("prenda","n","article","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("admisi\u00F3n","n","admission","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("reconocimiento","n","admission","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("confesi\u00F3n","n","admission","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("aventura","n","adventure","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("anuncio","n","advert","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("propaganda","n","advert","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("comercial","n","advert","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("publicidad","n","advert","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("anuncio","n","advertisement","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("propaganda","n","advertisement","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("publicidad","n","advertisement","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("comercial","n","advertisement","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("arte","n","art","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("destreza","n","art","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("p\u00FAblico","n","audience","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("ballet","n","ballet","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("grupo","n","band","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("banda musical","loc n","band","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("banda","n","band","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("juego de mesa","loc n","board game","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("libro","n","book","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("c\u00E1mara","n","camera","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("cart\u00F3n","n","card","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("tarjeta","n","card","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("carta","n","card","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("naipe","n","card","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("dibujos animados","loc n","cartoon","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("celebridad","n","celebrity","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("c\u00E9lebre","n","celebrity","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("famoso","n","celebrity","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("reproductor de CD","loc n","CD player","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("CD-ROM","n","CD-ROM","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("canal","n","channel","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("programa de entrevistas","loc n","chat show","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("ajedrez","n","chess","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("cine","n","cinema","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("circo","n","circus","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("m\u00FAsica cl\u00E1sica","loc n","classical music","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("comedia","n","comedy","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("c\u00F3mic","n","comic","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("competici\u00F3n","n","competition","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("concurso","n","competition","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("partido","n","competition","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("concierto","n","concert","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("bailar\u00EDn","n","dancer","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("bailaor","n","dancer","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("disco","n","disc","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("discoteca","n","disco","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("disco","n","disco","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("m\u00FAsica disco","loc n","disco","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("pinchadiscos","n","disc jockey","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("disck jockey","loc n","disc jockey","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("documental","n","documentary","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("teatro","n","drama","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("drama","n","drama","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("cuadro","n","drawing","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("dibujo","n","drawing","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("reproductor DVD","loc n","DVD Player ","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("entrada","n","entrance","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("exhibici\u00F3n","n","exhibition","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("exposici\u00F3n","n","exhibition","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("salida","n","exit","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("festival","n","festival","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("pel\u00EDcula","n","film","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("realizador","n","film maker","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("realizadora","n","film maker","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("director","n","film maker","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("directora","n","film maker","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("productor","n","film maker","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("productor cinematogr\u00E1fico","loc n","film maker","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("estrella de cine","loc n","film star","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("pirotecnia","n","fireworks","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("fuegos artificiales","loc n","fireworks","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("m\u00FAsica folcl\u00F3rica","loc n","fol music","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("diversi\u00F3n","n","fun","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("grupo","n","group","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("guitarra","n","guitar","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("guitarrista","n","guitarist","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("titular","n","headline","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("encabezado","n","headline","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("h\u00E9roe","n","hero","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("hero\u00EDna","n","heroine","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("hip hop","loc n","hip hop","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("hit musical","loc n","hit song","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("canci\u00F3n hit","loc n","hit song","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("hit","n","hit song","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("horror","n","horror","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("terror","n","horror","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("instrumento","n","instrument","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("intervalo","n","interval","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("lapso","n","interval","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("descanso","n","interval","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("espacio entre","loc n","interval","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("entrevista","n","interview","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("entrevistador","n","interviewer","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("m\u00FAsica jazz","loc n","jazz music","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("periodista","n","journalist","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("teclado","n","keyboard","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("risa","n","laugh","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("magazine","n","magazine","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("revista","n","magazine","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("magia","n","magic","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("reproductor MP3","loc n","MP3 player","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("museo","n","museum","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("m\u00FAsica","n","music","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("m\u00FAsico","n","musician","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("noticias","n","news","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("peri\u00F3dico","n","newspaper","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("\u00F3pera","n","opera","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("orquesta","n","orchestra","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("pintura","n","paint","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("pintor","n","painter","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("artista","n","performer","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("int\u00E9rprete","n","performer","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("representaci\u00F3n","n","performance","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("actuaci\u00F3n","n","performance","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("poema","n","poem","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("m\u00FAsica pop","loc n","pop music","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("programa","n","programme","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("concurso","n","quiz","n","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("m\u00E1gico","adj","magic","adj","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("divertido","adj","fun","adj","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("entretenido","adj","fun","adj","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("divertida","adj","fun","adj","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("entretenida","adj","fun","adj","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("comportarse","v","act","v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("actuar","v","act","v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("tomar decisiones","loc v","act","v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("bailar","v","dance","v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("dibujar","v","draw","v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("pintar","v","draw","v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("salir","v","exit","v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("sair","v","go out","v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("re\u00EDr","v","laugh","v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("pintar","v","paint","v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("actuar","v","perform","v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("representar","v","perform","v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("jugar","v","play","v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("tocar","v","play","v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("escuchar","v","listen to","phr v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("mirar","v","look at","phr v","entertainment and media"), "admin");
		repository.saveWT(new WordTranslation("mirar de reojo","loc v","look at","phr v","entertainment and media"), "admin");

		//TODO FOOD AND DRINK
		repository.saveWT(new WordTranslation("manzana","n","apple","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pl\u00E1tano","n","banana","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("barbacoa","n","barbecue","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("parrilla","n","barbecue","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("jud\u00EDa","n","bean","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("galleta","n","biscuit","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("bollo","n","biscuit","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("panecillo","n","biscuit","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("botella","n","bottle","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("bol","n","bowl","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("caja","n","box","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("caj\u00F3n","n","box","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("estuche","n","box","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pan","n","bread","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("desayuno","n","breakfast","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("br\u00F3coli","n","broccoli","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("br\u00E9col","n","broccoli","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("recimo de","loc n","bunch","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("racimo","n","bunch","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("mont\u00F3n","n","bunch","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("hamburguesa","n","burger","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("mantequilla","n","butter","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("repollo","n","cabbage","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("col","n","cabbage","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("caf\u00E9","n","cafe","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cageter\u00EDa","n","cafeteria","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("comedor","n","cafeteria","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cantina","n","cafeteria","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("tarta","n","cake","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pastel","n","cake","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("bizcocho","n","cake","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("torta","n","cake","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("lata","n","can","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("caramelos","n","candy","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("golosinas","n","candy","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("chuches","n","candy","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("dulces","n","candy","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cantina","n","canteen","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cafeter\u00EDa","n","canteen","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("zanahoria","n","carrot","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cereales","n","cereal","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cereal","n","cereal","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("queso","n","cheese","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("chef","n","chef","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cocinero profesional","loc n","chef","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("jefe de cocina","loc n","chef","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pollo","n","chiken","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("chile","n","chilli","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("patatas fritas","loc n","chips","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("chocolate","n","chocolate","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("c\u00E1scara de coco","loc n","coconut","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("coco","n","coconut","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pulpa de coco","loc n","coconut","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("caf\u00E9","n","coffee","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("refresco de cola","loc n","cola","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("estufa","n","cooker","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cocina","n","cooker","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("fog\u00F3n","n","cooker","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cocinero","n","cook","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cocinera","n","cook","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("galletea","n","cookie","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("ma\u00EDz","n","corn","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("crema","n","cream","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("nata","n","cream","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pepino","n","cucumber","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("taza","n","cup","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("curry","n","curry","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("postre","n","dessert","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("dieta","n","diet","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cena","n","dinner","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("plato","n","dish","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("bebida","n","drink","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pato","n","duck","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("huevo","n","egg","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pescado","n","fish","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("harina","n","flour","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("comida","n","food","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("tenedor","n","fork","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("patatas fritas","loc n","French fries","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("frigor\u00EDfico","n","fridge","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("nevera","n","fridge","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("fruta","n","fruit","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("zumo de frutas","loc n","fruit juice","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("sart\u00E9n","n","frying pan","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("ajo","n","garlic","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("vaso","n","glass","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("uva","n","grape","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("gratinador","n","grill","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("parrilla","n","grill","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("plancha","n","grill","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("asador","n","grill","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("especia","n","herbs","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("condimento","n","herbs","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("hierba","n","herbs","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("yerba","n","herbs","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("miel","n","honey","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("calor","n","hot","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("hielo","n","ice","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("helado","n","ice cream","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("ingredientes","n","ingredients","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("mermelada","n","jam","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("jarra","n","jug","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("jarro","n","jug","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("zumo","n","juice","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cocina","n","kitchen","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cuchillo","n","knife","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cordero","n","lamb","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("borrego","n","lamb","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("limon","n","lemon","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("limonada","n","lemonade","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("lechuga","n","lettuce","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("almuerzo","n","lunch","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("plato principal","loc n","main course","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("plato fuerte","loc n","main course","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("comida","n","meal","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("carne","n","meat","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("mel\u00F3n","n","melon","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("sand\u00EDa","n","melon","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("sand\u00EDa","n","watermelon","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("men\u00FA","n","menu","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("microondas","n","microwave","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("leche","n","milk","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("agua mineral","loc n","mineral water","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("seta","n","mushroom","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("aceite","n","oil","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("tortilla","n","omelette","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("omelet","n","omelette","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cebolla","n","onion","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("naranja","n","orange","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("olla","n","pan","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("batea","n","pan","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pasta","n","pasta","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("guisante","n","pea","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("melocot\u00F3n","n","peach","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cacahuete","n","peanut","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pera","n","pear","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("peral","n","pear","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pimiento","n","pepper","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pimienta","n","pepper","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("picnic","n","picnic","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("comida","n","picnic","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pastel","n","pie","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("tarta","n","pie","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("trozo de pastel","loc n","piece of cake","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("porci\u00F3n de pastel","loc n","piece of cake","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pi\u00F1a","n","pineapple","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("anan\u00E1","n","pineapple","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pizza","n","pizza","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("plato","n","plate","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("l\u00E1mina","n","plate","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("ilustraci\u00F3n","n","plate","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("plancha","n","plate","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("patata","n","potato","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("receta","n","recipe","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("piscolabis","n","refreshments","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("tentempi\u00E9","n","refreshments","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("refrigerio","n","refreshments","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("arroz","n","rice","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("asado","n","roast","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("ensalada","n","salad","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("salm\u00F3n","n","salmon","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("sal","n","salt","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("sandwich","n","sandwich","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("salsa","n","sauce","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cacerola","n","saucepan","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("olla","n","saucepan","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cazo","n","saucepan","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("platillo","n","saucer","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("salchicha","n","sausage","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("rebanada","n","slice","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("rodaja","n","slice","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("loncha","n","slice","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("tira","n","slice","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("trozo","n","slice","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("snack","n","snack","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("tentempi\u00E9","n","snack","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("refrigerio","n","snack","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("piscolabis","n","snack","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("refresco","n","soft drink","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("bebida sin alcohol","loc n","soft drink","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("sopa","n","soup","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("espinaca","n","spinach","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cuchara","n","spoon","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("filete","n","steak","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("fresa","n","strawberry","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("az\u00FAcar","n","sugar","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("dulce","n","sweet","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("restaurante para llevar","loc n","takeaway","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("comida para llevar","loc n","takeaway","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("takeaway","n","takeaway","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("gusto","n","taste","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("sabor","n","taste","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("muestra","n","taste","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("degustaci\u00F3n","n","taste","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("t\u00E9","n","tea","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("tostada","n","toast","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("tomate","n","tomato","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("at\u00FAn","n","tuna","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("pavo","n","turkey","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("carne de pavo","loc n","turkey","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("verdura","n","vegetable","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("vegetariano","n","vegetarian","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("camarero","n","waiter","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("camarera","n","waitress","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("yogur","n","yoghurt","n","food and drink"), "admin");
		repository.saveWT(new WordTranslation("fresco","adj","fresh","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("fresca","adj","fresh","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("recientemente","adj","fresh","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("dulce","adj","fresh","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("a la parrilla","loc adj","grilled","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("agrio","adj","sour","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("\u00E1cido","adj","sour","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("agria","adj","sour","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("\u00E1cida","adj","sour","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("rancio","adj","sour","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("rancia","adj","sour","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("arom\u00E1tico","adj","spicy","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("picante","adj","spicy","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("especiado","adj","spicy","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("sabroso","adj","tasty","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("sabrosa","adj","tasty","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("apetitoso","adj","tasty","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("apetitosa","adj","tasty","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("delicioso","adj","tasty","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("deliciosa","adj","tasty","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("sediento","adj","thirsty","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("sedienta","adj","thirsty","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("seco","adj","thirsty","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("seca","adj","thirsty","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("\u00E1rido","adj","thirsty","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("\u00E1rida","adj","thirsty","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("vegetal","adj","vegetable","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("amargo","adj","bitter","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("amarga","adj","bitter","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("delicioso","adj","delicious","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("exquisito","adj","delicious","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("riqu\u00EDsimo","adj","delicious","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("sabros\u00EDsimo","adj","delicious","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("frito","adj","fried","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("frita","adj","fried","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("caliente","adj","hot","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("hambriento","adj","hungry","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("dulce","adj","sweet","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("adorable","adj","sweet","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("placentero","adj","sweet","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("agradable","adj","sweet","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("hervido","adj","boiled","adj","food and drink"), "admin");
		repository.saveWT(new WordTranslation("saborizar","v","flavour","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("condimentar","v","flavour","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("sazonar","v","flavour","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("fre\u00EDr","v","fry","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("asar","v","roast","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("tostar","v","roast","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("rodar","v","roll","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("probar","v","taste","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("sentir","v","taste","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("notar","v","taste","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("saborear","v","taste","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("hornear","v","bake","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("asar","v","bake","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("hervir","v","bake","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("asar","v","barbecue","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("hacer a la parrilla","loc v","barbecue","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("hervir","v","boil","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cocer","v","boil","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("romper","v","break","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cocinar","v","cook","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("cortar","v","cut","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("comer","v","eat","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("comer","v","eat","v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("lavar los platos","loc v","wash up","phr v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("fregar los platos","loc v","wash up","phr v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("fregar","v","wash up","phr v","food and drink"), "admin");
		repository.saveWT(new WordTranslation("arrastrar","v","wash up","phr v","food and drink"), "admin");

		//TODO health, medicine and excercise
		repository.saveWT(new WordTranslation("accidente","n","accident","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("dolor","n","ache","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("ambulancia","n","ambulance","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("tobillo","n","ankle","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("cita","n","appointment","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("hora","n","appointment","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("brazo","n","arm","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("aspirina","n","aspirin","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("beb\u00E9","n","baby","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("vendaje","n","bandage","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("sangre","n","blood","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("cuerpo","n","body","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("hueso","n","bone","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("cerebro","n","brain","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("respiraci\u00F3n","n","breath","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("farmac\u00E9utico","n","chemist","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("farmacia","n","chemist","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("ment\u00F3n","n","chin","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("barbilla","n","chin","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("fr\u00EDo","n","cold","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("resfriado","n","cold","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("catarro","n","cold","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("constipado","n","cold","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("peine","n","comb","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("tos","n","cough","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("da\u00F1o","n","damage","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("peligro","n","danger","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("dieta","n","diet","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("doctor","n","doctor","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("m\u00E9dico","n","doctor","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("oreja","n","ear","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("o\u00EDdo","n","ear","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("dolor de o\u00EDdos","loc n","earache","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("emergencia","n","emergency","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("ejercicio","n","exercise","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("ojo","n","eye","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("cara","n","face","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("ca\u00EDda","n","fall","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("fiebre","n","fever","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("dedo","n","finger","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("gripe","n","flu","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("pie","n","foot","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("pies","n","feet","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("troe","n","jogging","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("correr","n","jogging","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("correr por afici\u00F3n","loc n","jogging","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("gimnasio","n","gym","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("gimnasia","n","gymnastics","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("pelo","n","hair","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("mano","n","hand","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("cabeza","n","head","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("dolor de cabeza","loc n","headache","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("salud","n","health","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("coraz\u00F3n","n","heart","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("tal\u00F3n","n","heel","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("hospital","n","hospita","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("enfermedad","n","illness","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("rodilla","n","knee","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("pierna","n","leg","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("medicina","n","medicine","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("nariz","n","nose","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("enfermero","n","nurse","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("enfermera","n","nurse","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("operaci\u00F3n","n","operation","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("dolor","n","pain","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("sufrimiento","n","pain","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("paciente","n","patient","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("farmacia","n","pharmacy","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("pastilla","n","pill","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("p\u00EDldora","n","pill","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("receta","n","prescription","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("prescripci\u00F3n","n","prescription","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("problema","n","problem","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("descanso","n","rest","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("hombro","n","shoulder","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("piel","n","skin","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("jab\u00F3n","n","soap","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("detergente","n","soap","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("dolor de garganta","loc n","sore throat","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("est\u00F3mago","n","stomach","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("dolor de est\u00F3mago","loc n","stomach ache","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("estr\u00E9s","n","stress","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("chapuz\u00F3n","n","swim","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("ba\u00F1o","n","swim","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("comprimido","n","tablet","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("pastilla","n","tablet","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("p\u00EDldora","n","tablet","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("temperatura","n","temperature","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("dedo gordo","loc n","thumb","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("pulgar","n","thumb","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("dedo","n","toe","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("punta","n","toe","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("diente","n","tooth","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("dientes","n","teeth","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("dolor de muelas","loc n","toothase","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("cepillo de dientes","loc n","toothrush","n","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("limpio","adj","clean","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("puro","adj","clean","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("sano","adj","clean","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("muerto","adj","dead","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("muerta","adj","dead","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("peligroso","adj","dangerous","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("acrob\u00E1tico","adj","gymnastics","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("gimn\u00E1stico","adj","gymnastics","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("doloroso","adj","painful","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("dolorido","adj","painful","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("malo","adj","sick","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("enfermo","adj","sick","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("nauseabundo","adj","sick","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("malo","adj","ill","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("enfermo","adj","ill","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("cansado","adj","tired","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("so\u00F1oliento","adj","tired","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("cansada","adj","tired","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("bien","adj","well","adj","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("sangrar","v","bleed","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("romper","v","braek","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("romperse","v","braek","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("respirar","v","breathe","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("verificar","v","check","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("comprobar","v","check","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("revisar","v","check","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("limpiar","v","clean","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("peinar","v","comb","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("toser","v","cough","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("cortar","v","cut","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("morir","v","die","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("caer","v","fall","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("caerse","v","fall","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("o\u00EDr","v","hear","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("escuchar","v","hear","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("herir","v","hurt","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("hacer da\u00F1o","loc v","hurt","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("herir","v","injure","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("da\u00F1ar","v","injure","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("lesionar","v","injure","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("operar","v","operate","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("recuperar","v","recover","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("reponerse","v","recover","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("recuperarse","v","recover","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("descansar","v","rest","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("operar","v","run","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("correr","v","run","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("nadar","v","swim","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("caminar","v","walk","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("pasear","v","walk","v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("sentirse mejor","loc v","feel better","phr v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("sentirse enfermo","loc v","feel ill","phr v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("sentirse enfermo","loc v","fell sick","phr v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("mejorarse","v","get better","phr v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("recuperarse","v","get better","phr v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("mejorar","v","get better","phr v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("empeorarse","v","get worse","phr v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("empeorar","v","get worse","phr v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("mantenerse en forma","loc v","keep fit","phr v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("acostarse","v","lie down","phr v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("tumbarse","v","lie down","phr v","health, medicine and excercise"), "admin");
		repository.saveWT(new WordTranslation("echarse","v","lie down","phr v","health, medicine and excercise"), "admin");

		//TODO hobbies and leisure
		repository.saveWT(new WordTranslation("salir","v","go out","phr v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("pasar el rato","loc v","hang out","phr v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("participar","v","join in","phr v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("apuntarse","v","join in","phr v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("deslizar","v","slide","phr v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("patinar","v","slide","phr v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("tomar el sol","loc v","sunbathe","phr v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("acampar","v","camp","v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("coleccionar","v","collect","v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("cobrar","v","collect","v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("recaudar","v","collect","v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("acumular","v","collect","v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("hacer un crucero","loc v","cruise","v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("bailar","v","dance","v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("pintar","v","draw","v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("dibujar","v","draw","v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("abanicar","v","fan","v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("contratar","v","hire","v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("sair a correr","loc v","jogging","v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("correr por afici\u00F3n","loc v","jogging","v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("pintar","v","paint","v","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("aficionado a","loc adj","keen on","prep","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("barbacoa","n","barbecue","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("playa","n","beach","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("bicicleta","n","bicycle","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("bici","n","bike","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("bicicleta","n","bike","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("c\u00E1mara","n","camera","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("campamento","n","camp","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("camping","n","camping","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("acampada","n","camping","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("campamento","n","camping","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("campamento","n","campsite","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("camping","n","campsite","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("sitio de acampada","loc n","campsite","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("reproductor de CD","loc n","CD player","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("ajedrez","n","chess","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("club","n","club","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("coleccionista","n","collector","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("crucero","n","cruise","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("baile","n","dancing","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("mu\u00F1eca","n","doll","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("mu\u00F1eco","n","doll","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("dibujo","n","drawing","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("cuadro","n","drawing","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("reproductor de DVD","loc n","DVD player","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("instalaciones","n","facilities","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("servicios","n","facilities","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("caracter\u00EDsticas","n","facilities","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("ventilador","n","fan","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("abanico","n","fan","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("festival","n","festival","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("ficci\u00F3n","n","fiction","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("galer\u00EDa","n","gallery","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("guitarra","n","guitar","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("renta","n","hire","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("alquiler","n","hire","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("hobby","n","hobby","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("afici\u00F3n","n","hobby","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("facaciones","n","holidays","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("footing","n","jogging","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("magazine","n","magazine","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("revista","n","magazine","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("membres\u00EDa","n","membership","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("afiliaci\u00F3n","n","membership","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("pertenencia","n","membership","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("socio","n","member","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("miembro","n","member","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("modelo","n","model","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("museo","n","museum","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("m\u00FAsica","n","music","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("m\u00FAsico","n","musician","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("vida nocturna","loc n","nightlife","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("pintura","n","paint","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("pintura","n","painting","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("parque","n","park","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("fiesta","n","party","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("fotograf\u00EDa","n","photograph","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("picnic","n","picnic","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("comida","n","picnic","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("parque infantil","loc n","playground","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("juegos","n","playground","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("patio","n","playground","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("concurso","n","quiz","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("escultura","n","sculpture","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("hacer turismo","loc n","sightseeing","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("tienda de campa\u00F1a","loc n","tent","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("carpa","n","tent","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("crema solar","loc n","suntan lotion","n","hobbies and leisure"), "admin");
		repository.saveWT(new WordTranslation("bronceador","n","suntan lotion","n","hobbies and leisure"), "admin");

		//TODO house and home
		repository.saveWT(new WordTranslation("habitaci\u00F3n","n","accomodation","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cuarto","n","accomodation","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("lugar","n","accomodation","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("sitio","n","accomodation","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("alojamiento","n","accomodation","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("hospedaje","n","accomodation","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("direcci\u00F3n","n","address","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("domicilio","n","address","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("aire acondicionado","loc n","air conditioning","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("alarma","n","alarm","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("alarma","n","alarm clock","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("despertador","n","alarm clock","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("reloj despertador","loc n","alarm clock","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("antigüedad","n","antique","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("piso","n","apartment","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("apartamento","n","apartment","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("sill\u00F3n","n","armchair","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("balc\u00F3n","n","balcony","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("taz\u00F3n","n","basin","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cunco","n","basin","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("palangana","n","basin","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("pileta","n","basin","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("ba\u00F1era","n","bath","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("servicio","n","bathroom","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cuarto de ba\u00F1o","loc n","bathroom","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cama","n","bed","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("dormitorio","n","bedroom","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("habitaci\u00F3n","n","bedroom","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cuarto","n","bedroom","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("manta","n","blanket","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("persiana","n","blind","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("bloque","n","block","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("manzana","n","block","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("tabl\u00F3n","n","board","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("biblioteca","n","bookcase","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("librer\u00EDa","n","bookcase","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("estanter\u00EDa","n","bookcase","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("estanter\u00EDa","n","bookshelf","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("estante","n","bookshelf","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("librer\u00EDa","n","bookshelf","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("bol","n","bowl","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("taz\u00F3n","n","bowl","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("caja","n","box","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("caj\u00F3n","n","box","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("estuche","n","box","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cepillo","n","brush","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("brocha","n","brush","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("pincel","n","brush","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cubo","n","brucket","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("bombilla","n","bulb","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("foco","n","bulb","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("vela","n","candle","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("candela","n","candle","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("alfombra","n","carpet","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("tapete","n","carpet","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("techo","n","ceiling","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cielo raso","loc n","ceiling","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("tope","n","ceiling","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("s\u00F3tano","n","cellar","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("s\u00F3tano","n","basement","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("silla","n","chair","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("canal","n","channel","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("c\u00F3moda","n","chest of drawers","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cajonera","n","chest of drawers","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("reloj","n","clock","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("ordenador","n","computer","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cocina","n","cooker","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("fog\u00F3n","n","cooker","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("estufa","n","cooker","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("casita de campo","loc n","cottage","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("caba\u00F1a","n","cottage","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("alacena","n","cupboard","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("despensa","n","cupboard","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cortina","n","curtain","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("coj\u00EDn","n","cushion","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("almohad\u00F3n","n","cushion","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("escritorio","n","desk","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("pupitre","n","desk","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("digital","n","digital","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("comedor","n","dining room","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("plato","n","dish","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("lavabajillas","n","dishwasher","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("puerta","n","door","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("caj\u00F3n","n","drawer","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("gaveta","n","drawer","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("dibujante","n","drawer","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cubo de basura","loc n","dustbin","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("basurero","n","dustbin","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("edred\u00F3n","n","duvet","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("reproductor DVD","loc n","DVD player","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("entrada","n","entrance","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("ventilador","n","fan","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("plano","n","flat","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("llano","n","flat","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("apartamento","n","flat","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("piso","n","flat","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("compa\u00F1ero de piso","loc n","flatmate","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("compa\u00F1ero de apartamento","loc n","flatmate","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("suelo","n","floor","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("congelador","n","freezer","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("frigor\u00EDfico","n","fridge","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("sart\u00E9n","n","frying pan","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("muebles","n","furtiture","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("mobiliario","n","furtiture","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("garaje","n","garage","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("jard\u00EDn","n","garden","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("gas","n","gas","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("vapor","n","gas","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("puerta","n","gate","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("verja","n","gate","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cancela","n","gate","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("reja","n","gate","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("grill","n","grill","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("gratinador","n","grill","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("parrilla","n","grill","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("plancha","n","grill","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("asador","n","grill","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("suelo","n","ground","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("tierra","n","ground","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("sal\u00F3n","n","hall","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("corredor","n","hall","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("pasillo","n","hallway","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("mango","n","handle","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("asa","n","handle","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("picaporte","n","handle","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("calor","n","heat","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("calefacci\u00F3n","n","heat","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("calefactor","n","heater","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("radiador","n","heater","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("calefacci\u00F3n","n","heating","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("alta fidelidad","loc n","hi-fi","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("casa","n","home","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("hogar","n","home","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("casa","n","house","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("ama de casa","loc n","housewife","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("quehaceres dom\u00E9sticos","loc n","housework","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("tareas dom\u00E9sticas","loc n","housework","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("hierro","n","iron","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("jarra","n","jug","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("jarro","n","jug","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("caldera","n","kettle","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("llave","n","key","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cocina","n","kitchen","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("escalera","n","ladder","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("l\u00E1mpara","n","lamp","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("laptop","n","laptop","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("ordenador port\u00E1til","loc n","laptop","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("ascensor","n","lift","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("luz","n","light","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("sala de estar","loc n","living room","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("sal\u00F3n","n","living room","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cerradura","n","lock","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("seguro","n","lock","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("microondas","n","microwave","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("espejo","n","mirror","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("taza","n","mug","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("taz\u00F3n","n","mug","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("vecino","n","neighbour","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("vecindario","n","neightborhood","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("barrio","n","neightborhood","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("colonia","n","neightborhood","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("vecindad","n","neightborhood","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("petr\u00F3leo","n","oil","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("aceite","n","oil","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("horno","n","oven","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("olla","n","pan","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("camino","n","path","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("senda","n","path","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("vereda","n","path","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("ruta","n","path","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("almohada","n","pillow","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("tuber\u00EDa","n","pipe","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("manguera","n","pipe","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("planta","n","plant","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("clavija","n","plug","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("enchufe","n","plug","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("toma de corriente","loc n","plug","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("propiedad","n","property","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("pertenencia","n","property","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("radio","n","radio","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("refrigerador","n","refrigerator","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("frigor\u00EDfico","n","refrigerator","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("control remoto","loc n","remote control","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("alquiler","n","rent","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("renta","n","rent","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("reparar","n","repair","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("techo","n","roof","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("tejado","n","roof","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cuarto","n","room","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("habitaci\u00F3n","n","room","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("compa\u00F1ero de piso","loc n","roommate","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("compa\u00F1ero de habitaci\u00F3n","loc n","roommate","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("basura","n","rubbish","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("asiento","n","seat","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("silla","n","seat","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("s\u00E1bana","n","sheet","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("hoja","n","sheet","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("estante","n","shelf","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("repisa","n","shelf","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("expositor","n","shelf","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("estanter\u00EDa","n","shelf","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("biblioteca","n","shelf","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("ducha","n","shower","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("llovizna","n","shower","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("ducharse","n","shower","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("pila","n","sink","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("fregadero","n","sink","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("lavabo","n","sink","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("sala de estar","loc n","sitting room","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("sof\u00E1","n","sofa","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("sill\u00F3n","n","sofa","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("escaleras","n","stairs","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("pelda\u00F1o","n","stair","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("escal\u00F3n","n","stair","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("estancia","n","stay","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("etapa","n","step","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("paso","n","step","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("escal\u00F3n","n","step","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("borde","n","surround","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cercado","n","surround","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cerca","n","surround","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("interruptor","n","switch","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("mesa","n","table","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("grifo","n","tap","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("tel\u00E9fono","n","telephone","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("televisi\u00F3n","n","television","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("lavabo","n","toilet","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("aseos","n","toilet","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("ba\u00F1os","n","toilet","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("cuarto de ba\u00F1o","loc n","toilet","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("aseo","n","toilet","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("toalla","n","towel","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("torre","n","tower","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("juguete","n","toy","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("jarr\u00F3n","n","vase","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("florero","n","vase","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("v\u00EDdeo","n","video","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("pared","n","wall","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("muro","n","wall","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("lavadora","n","washing machine","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("ventana","n","window","n","house and home"), "admin");
		repository.saveWT(new WordTranslation("piso de abajo","loc adv","downstairs","adv","house and home"), "admin");
		repository.saveWT(new WordTranslation("piso de arriba","loc adv","upstairs","adv","house and home"), "admin");
		repository.saveWT(new WordTranslation("seguro","adj","safe","adj","house and home"), "admin");
		repository.saveWT(new WordTranslation("electr\u00F3nico","adj","electric","adj","house and home"), "admin");
		repository.saveWT(new WordTranslation("el\u00E9ctrico","adj","electrical","adj","house and home"), "admin");
		repository.saveWT(new WordTranslation("antiguo","v","antique","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("antigua","v","antique","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("cl\u00E1sico","v","antique","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("cl\u00E1sica","v","antique","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("cepillar","v","brush","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("calentar","v","heat","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("planchar","v","iron","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("enchufar","v","plug","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("conectar","v","plug in","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("enchufar","v","plug in","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("alquilar","v","rent","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("hundirse","v","sink","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("quedarse","v","stay","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("pasar","v","stay","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("pisar","v","step","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("meterse","v","step","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("rodear","v","surround","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("cambiar","v","switch","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("intercambiar","v","switch","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("cerrar con llave","loc v","lock","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("cerrar con candado","loc v","lock","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("asaltar","v","mug","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("robar","v","mug","v","house and home"), "admin");
		repository.saveWT(new WordTranslation("atracar","v","mug","v","house and home"), "admin");

		
		
		
		
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
