package com.learnjava8.optional;

public class Address {
	public static final Address EMPTY_ADDRESS = new Address("", "", "", 0);
	private final String line1;
	private final String city;
	private final String country;
	private final Integer zipCode;

	public Address(String line1, String city, String country, Integer zipCode) {
		this.line1 = line1;
		this.city = city;
		this.country = country;
		this.zipCode = zipCode;
	}

	public String getLine1() {
		return line1;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + ", country=" + country + ", zipCode=" + zipCode + "]";
	}

}