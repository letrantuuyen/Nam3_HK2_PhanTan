package entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2966840765051236624L;
	private String city;
	private String postalCode;
	private String street;
	private String state;
	
	public Address() {
	}

	public Address(String city, String postalCode, String street, String state) {
		super();
		this.city = city;
		this.postalCode = postalCode;
		this.street = street;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", postalCode=" + postalCode + ", street=" + street + ", state=" + state + "]";
	}
	
	
}
