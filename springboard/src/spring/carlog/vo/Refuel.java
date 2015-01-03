package spring.carlog.vo;

public class Refuel {
	
	private int lid ;
	private String refuel_date ;
	private int distance ;
	private float gas_liter ;
	private int price ;
	private int unit_price ;
	private String gas_station ;
	private float fuel_eff_rate ;
	private String description ;
	private String regid ;
	private String regdate ;
	private int pre_refuel_distance ;
	
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getRefuel_date() {
		return refuel_date;
	}

	public void setRefuel_date(String refuel_date) {
		this.refuel_date = refuel_date;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public float getGas_liter() {
		return gas_liter;
	}

	public void setGas_liter(float gas_liter) {
		this.gas_liter = gas_liter;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getUnit_price() {
		return unit_price;
	}



	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}



	public String getGas_station() {
		return gas_station;
	}



	public void setGas_station(String gas_station) {
		this.gas_station = gas_station;
	}



	public float getFuel_eff_rate() {
		return fuel_eff_rate;
	}



	public void setFuel_eff_rate(float fuel_eff_rate) {
		this.fuel_eff_rate = fuel_eff_rate;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getRegid() {
		return regid;
	}



	public void setRegid(String regid) {
		this.regid = regid;
	}



	public String getRegdate() {
		return regdate;
	}



	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}



	public int getPre_refuel_distance() {
		return pre_refuel_distance;
	}



	public void setPre_refuel_distance(int pre_refuel_distance) {
		this.pre_refuel_distance = pre_refuel_distance;
	}



	@Override
	public String toString() {
		return "lid : "+this.lid + 
				", refuel_date : "+this.refuel_date + 
				", distance : "+this.distance +
				", gas_liter : "+this.gas_liter +
				", price : "+this.price +
				", unit_price : "+this.unit_price +
				", gas_station : "+this.gas_station +
				", fuel_eff_rate : "+this.fuel_eff_rate +
				", pre_refuel_distance : "+this.pre_refuel_distance ;
	}
	
	
	
}
