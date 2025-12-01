package com.example.demo;

public class Address {
	private int flatno;
	private String area;
	private String city;
	private int pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int flatno, String area, String city, int pincode) {
		super();
		this.flatno = flatno;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", area=" + area + ", city=" + city + ", pincode=" + pincode + "]";
	}
	

}
