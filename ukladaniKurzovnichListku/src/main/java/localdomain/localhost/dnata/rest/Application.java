package localdomain.localhost.dnata.rest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

//import java.util.Date;
import java.util.TimeZone;
@SpringBootApplication
public class Application {
	
	 @PostConstruct
	  public void init(){
	    // Setting Spring Boot SetTimeZone
	    TimeZone.setDefault(TimeZone.getTimeZone("Europe/Prague"));
	    //System.out.println("cas :"+new Date());
	  }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
