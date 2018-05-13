package localdomain.localhost.dnata.rest.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
public class ExchRate {
	@Id
    private String shortName;
	private LocalDateTime validFrom;  //LocalDate.parse() pridat  
    private String name;
    private String country;
    private int amount;
    private double valBuy;
    private double valSell;
    private double valMid;    //vypocitat, bez sloupce?
    private double currBuy;
    private double currSell; 
    private double currMid;
    private double move;
    private double cnbMid;
    private int version;
}
