/**
 * 
 */
package co.ceiba.service;

import co.ceiba.domain.Person;

/**
 * @author luis.cortes
 *
 */
public class NotifyPersonService {
	
	private EmailService emailService;

	/**
	 * @param emailService
	 */
	public NotifyPersonService(EmailService emailService) {		
		this.emailService = emailService;
	}
	
	public String notify(Person person) {
		String message = "Welcome "+ person.getName();
		return message;
	}
}
