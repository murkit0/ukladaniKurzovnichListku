package localdomain.localhost.rest.mapper;

import localdomain.localhost.rest.model.ExchRate;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
public interface ExchRateMapper {
	
	@Select("SELECT * FROM exchRates") //SQL
	List<ExchRate> findAll( );
	
	//TODO groovy/cokoliv misto + 
	final String insert = "insert into exchRates values (#{shortName}, #{validFrom}, #{name}, #{country}, #{amount},"
			+ " #{valBuy}, #{valSell}, #{valMid}, #{currBuy}, #{currSell}, #{currMid}, #{move}, #{cnbMid}, #{version}) "
			+ "ON DUPLICATE KEY UPDATE shortName=#{shortName}, validFrom=#{validFrom}, name=#{name}, country=#{country},"
			+ "amount=#{amount}, valBuy=#{valBuy}, valSell=#{valSell}, valMid=#{valMid}, currBuy=#{currBuy}, "
			+ "currSell=#{currSell}, currMid=#{currMid}, move=#{move}, cnbMid=#{cnbMid}, version=#{version}";
	
	//TODO insert all nevymyslim, jedine pres xml
	@Insert(insert)
	void save(ExchRate rate);	

}