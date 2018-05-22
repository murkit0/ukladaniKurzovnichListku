package localdomain.localhost.rest;
 
import java.util.HashSet;
import java.util.Set;
 
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import localdomain.localhost.rest.controller.ExchRateController;; 
@ApplicationPath("")
public class App extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();
	 
	public App() {
		singletons.add(new ExchRateController());
		}
	 
	@Override
	public Set<Class<?>> getClasses() {
		return empty;
		}
	 
	   @Override
	   public Set<Object> getSingletons() {
	      return singletons;
	   }
}