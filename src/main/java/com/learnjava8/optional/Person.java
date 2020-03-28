package com.learnjava8.optional;

import java.util.Optional;

public class Person {
	private String name;
	private Optional<Address> address;
	private String phone;

	public Person(String name, Optional<Address> address, String phone) {
		if (name == null) {
			throw new IllegalArgumentException("Null value for name is not permitted");
		}
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public Optional<Address> getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

}