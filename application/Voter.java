package application;

public class Voter {

	private String name;
	private String streetName;
	private String city;
	private String state;
	private String district;
	
	public Voter() {
		name = "";
		streetName = "";
		city = "";
		state = "";
		district = "";
	}
	
	public Voter(String name, String street, String city, String state, String district) {
		this.name = name;
		this.streetName = street;
		this.city = city;
		this.state = state;
		this.district = district;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setStreet(String street) {
		this.streetName = street;
	}
	
	public String getStreet() {
		return this.streetName;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getDistrict() {
		return district;
	}
		
	
}
