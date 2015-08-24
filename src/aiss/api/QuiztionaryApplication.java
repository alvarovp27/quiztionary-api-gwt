package aiss.api;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import aiss.api.resources.WordTranslationResource;

public class QuiztionaryApplication extends Application{
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<Class<?>>();
	
	public QuiztionaryApplication(){
		singletons.add(WordTranslationResource.getInstance());
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
	
}
