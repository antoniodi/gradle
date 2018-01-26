/**
 * 
 */
package co.ceiba.domain;

/**
 * @author luis.cortes
 *
 */
public class Person {
	
	private String name;
	private String lastName;
	
	/**
	 * @param name
	 * @param lastName
	 */
	public Person(String name, String lastName) {		
		this.name = name;
		this.lastName = lastName;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	
	
}
