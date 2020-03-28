package com.learnjava8.optional;

import java.util.Optional;

/**
 * @author Raja Vishwakarma
 * 
 *         Optional : Optional is a container object used to contain not-null
 *         objects.
 * 
 *         Optional object is used to represent null with absent value.
 * 
 *         This class has various utility methods to facilitate code to handle
 *         values as ‘available’ or ‘not available’ instead of checking null
 *         values.
 */
public class OptionalClassExamples {

	public static void main(String args[]) {
		OptionalClassExamples optionalClassExamples = new OptionalClassExamples();

		Integer value1 = null;
		Integer value2 = 10;

		// Optional.ofNullable - allows passed parameter to be null.
		Optional<Integer> a = Optional.ofNullable(value1);

		// Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> b = Optional.of(value2);

		Integer sum = optionalClassExamples.sum(a, b);
		System.out.println("Sum : " + sum);

		optionalClassExamples.createOptionalObjectExamples();
	}

	public Integer sum(Optional<Integer> a, Optional<Integer> b) {

		// Optional.isPresent - checks the value is present or not
		boolean aPresent = a.isPresent();
		System.out.println("First parameter is present : " + aPresent);
		boolean bPresent = b.isPresent();
		System.out.println("Second parameter is present : " + bPresent);

		// Optional.orElse - returns the value if present otherwise returns
		// the default value passed.
		Integer value1 = a.orElse(0);
		Integer value2 = null;

		if (bPresent) {
			// Optional.get - gets the value, value should be present
			value2 = b.get();
		} else {
			value2 = 0;
		}

		return value1 + value2;
	}

	public void createOptionalObjectExamples() {

		// 1. Create an empty Optional by using the static method
		// Optional.empty()
		Optional<Integer> intEmptyOptional = Optional.empty();
		System.out.println("intEmptyOptional : " + intEmptyOptional);

		/*
		 * 2. Create an Optional with a non-null value by using the of() method
		 * of java.util.Optional class
		 * 
		 * Optional.of(person) will throw a NullPointerException immediately if
		 * person Object is null, rather than throwing a NullPointerException
		 * when you try to access any field of the person object.
		 */
		Person person = new Person("Raja Bhaiya", Optional.of(Address.EMPTY_ADDRESS), "9730043");
		Optional<Person> personOptional = Optional.of(person);

		System.out.println("personOptional : " + personOptional);

		/*
		 * 3. Most useful way of creating an Optional instance is by using the
		 * ofNullable() method of java.util.Optional class which allows you to
		 * create an Optional object that may hold a null value.
		 * 
		 * In case the Person object is null, the resulting Optional object
		 * would be empty, but it won't throw the NullPointerException.
		 */
		Person person2 = null;
		Optional<Person> person2Optional = Optional.ofNullable(person2);
		System.out.println("person2Optional : " + person2Optional);

	}
}