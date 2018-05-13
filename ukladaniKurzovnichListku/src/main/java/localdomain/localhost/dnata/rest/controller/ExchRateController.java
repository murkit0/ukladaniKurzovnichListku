package localdomain.localhost.dnata.rest.controller;

import java.util.Arrays;
import java.io.IOException;
import java.net.*;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import localdomain.localhost.dnata.rest.entity.ExchRate;
import localdomain.localhost.dnata.rest.repository.ExchRateRepository;

//import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/exchrates")
public class ExchRateController {
	@Autowired		//nechapu tuto anotaci
	private ExchRateRepository repository;

	@GetMapping
	public Iterable<ExchRate> getAll(@RequestParam("usedb") Boolean  usedb) throws JsonParseException, JsonMappingException, MalformedURLException, IOException {
		if(!usedb){
			String url = "https://www.csast.csas.cz/webapi/api/v1/rates/exchangerates?web-api-key=86d63706-3a9c-4762-bd7a-415651cc26f8";
			ObjectMapper mapper = new ObjectMapper();
			ExchRate[] downloadedRates = mapper.readValue(new URL(url), ExchRate[].class);
			repository.saveAll(Arrays.asList(downloadedRates)); //funguje i jako update
			}
		return repository.findAll();
 }
}

