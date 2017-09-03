package com.booking.ticket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="TrainBooking_User")
public class User {
	@javax.persistence.Id
	@Column(name="id")
	@GeneratedValue
	private int Id;
	@Size(min=2,max=30 , message="UserId Should be 	Between 3 to 10 character.")
	@Pattern(regexp="^[a-zA-Z0-9_]*$",message="UserId should be alphanumeric,underscore is allowed.")
	private String userId;
	@Size(min=2,max=8, message="Min 8 character & Max 15 character. Password must contain at least one small & one capital alphabet and numeric digit.")
	private String password;
	@NotEmpty(message="First name should not be empty.") @Pattern(regexp="^[a-zA-Z]*$",message="First Name should be letters only.")
	private String fName;
	private String mName;
	@NotEmpty(message="Last name should not be empty.") @Pattern(regexp="^[a-zA-Z]*$",message="Last Name should be letters only.")
	private String lName;
	
	@NotEmpty(message="Please select your Gender.")
	private String gender;
	
	@NotEmpty(message="Please select your MaritalStatus.")
	private String maritalStatus;
	
	@Size(min=1, message="Please select your Date of birth.")
	private String DOB;
	
	private String occupation;
	@Pattern(regexp="^[0-9]*$",message="Aadhar card  should be digit only.")
	private String aadharCard;
	@Pattern(regexp="^[a-zA-Z0-9_]*$",message="PANCard should be alphanumeric,underscore is allowed.")
	private String panCard;
	@NotEmpty(message="EmailId must be entered.")
	@Email(message="Please enter correct emailid.Eg:ab@cd.com")
	private String email;
	@NotEmpty(message="Please enter your mobile number.")
	private String mobile;
	@NotEmpty(message="Please select nationality.")
	private String nationality;
	
	/*private AddressModel userAddress;*/
	

	@Size(min=1,message="Please enter flat number.")
	private String flatNo;
	private String street;
	private String area;
	@Size(min=1,message="Please enter your country.")
	private String country;
	@Pattern(regexp="^[0-9]*$",message="Pincode should be numeric value.")
	@Size(min=1, message="Please enter pincode.")
	private String pincode;
	@Size(min=1,message="Please enter your state.")
	private String state;
	@Size(min=1,message="Please enter your city.")
	private String city;
	@Size(min=1,message="Please enter your post office.")
	private String postOffice;
	@Size(min=1,message="Please enter phone number.")
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
	
	
	

	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
*/
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/*public AddressModel getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(AddressModel userAddress) {
		this.userAddress = userAddress;
	}*/

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
