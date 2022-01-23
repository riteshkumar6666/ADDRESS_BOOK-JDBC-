package com.AddressBook.manage;

public class Address {
	private int sno;
	private String name;
	private String phone;
	private String city;
	private String gender;
	public Address(int sno, String name, String phone, String city, String gender) {
		super();
		this.sno = sno;
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.gender = gender;
	}
	public Address(String name, String phone, String city, String gender) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.gender= gender;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Address [sno=" + sno + ", name=" + name + ", phone=" + phone + ", city=" + city + ", gender=" + gender + "]";
	}
	
	

}
