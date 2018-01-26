/**
 * 
 */
package co.ceiba.service;

import co.ceiba.domain.Person;

/**
 * @author luis.cortes
 *
 */
public class PersonTestDataBuilder {

	private String name;
	private String lastName;
	/**
	 * @param name
	 * @param lastName
	 */
	public PersonTestDataBuilder() {		
		this.name = "Ceiba";
		this.lastName = "Software House";
	}
	
	public PersonTestDataBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
	public PersonTestDataBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public Person biuld() {
		return new Person(this.name, this.lastName);
	}
	
}
