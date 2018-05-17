package localdomain.localhost.dnata.rest.model;

//import java.time.LocalDateTime;
//import lombok.Data;

//@Data @(All/No)ArgsConstructor

public class ExchRate {
    private String shortName;
	private /*LocalDateTime*/ String validFrom;  //LocalDate.parse() pridat  
    private String name, country;
    private int amount;
    private double valBuy, valSell, valMid, currBuy, currSell, currMid, move, cnbMid;
    private int version;
    
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getValBuy() {
		return valBuy;
	}
	public void setValBuy(double valBuy) {
		this.valBuy = valBuy;
	}
	public double getValSell() {
		return valSell;
	}
	public void setValSell(double valSell) {
		this.valSell = valSell;
	}
	public double getValMid() {
		return valMid;
	}
	public void setValMid(double valMid) {
		this.valMid = valMid;
	}
	public double getCurrBuy() {
		return currBuy;
	}
	public void setCurrBuy(double currBuy) {
		this.currBuy = currBuy;
	}
	public double getCurrSell() {
		return currSell;
	}
	public void setCurrSell(double currSell) {
		this.currSell = currSell;
	}
	public double getCurrMid() {
		return currMid;
	}
	public void setCurrMid(double currMid) {
		this.currMid = currMid;
	}
	public double getMove() {
		return move;
	}
	public void setMove(double move) {
		this.move = move;
	}
	public double getCnbMid() {
		return cnbMid;
	}
	public void setCnbMid(double cnbMid) {
		this.cnbMid = cnbMid;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
}
