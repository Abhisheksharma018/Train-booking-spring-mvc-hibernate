package com.booking.ticket.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class AddressModel {
	@NotEmpty(message="Please enter flat number.")
	private String flatNo;
	private String street;
	private String area;
	@NotEmpty(message="Please enter your country.")
	private String country;
	@Pattern(regexp="^[0-9]*$",message="Pincode should be numeric value.")
	@NotEmpty(message="Please enter pincode.")
	private String pincode;
	@NotEmpty(message="Please enter your state.")
	private String state;
	@NotEmpty(message="Please enter your city.")
	private String city;
	@NotEmpty(message="Please enter your post office.")
	private String postOffice;
	@NotEmpty(message="Please enter phone number.")
	private String phone;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostOffice() {
		return postOffice;
	}
	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
