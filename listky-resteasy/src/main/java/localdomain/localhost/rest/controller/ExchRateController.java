package localdomain.localhost.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.List;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper; 

import localdomain.localhost.rest.model.ExchRate;
import localdomain.localhost.rest.mapper.ExchRateMapper;

@Path("/exchrates")
public class ExchRateController {

	@GET
	@Produces("application/json")
	public List<ExchRate> getAll(@QueryParam("usedb") Boolean  usedb) throws JsonParseException, JsonMappingException, MalformedURLException, IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		try (SqlSession session = sqlSessionFactory.openSession())  
		{
			ExchRateMapper exchRateMapper = session.getMapper(ExchRateMapper.class);
			
			if(!usedb){
				String url = "https://www.csast.csas.cz/webapi/api/v1/rates/exchangerates?web-api-key=86d63706-3a9c-4762-bd7a-415651cc26f8";
				ObjectMapper mapper = new ObjectMapper();
				ExchRate[] downloadedRates = mapper.readValue(new URL(url), ExchRate[].class);
				for (ExchRate rate : downloadedRates)
					exchRateMapper.save(rate); //muze fungovat jako update diky on dublicate key update
				session.commit();
			}
			return exchRateMapper.findAll();
		}
 }
}
