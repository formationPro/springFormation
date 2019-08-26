package fr.formation.inti.beans;

import org.springframework.stereotype.Component;

@Component
public class MessageBean {

	private String message;
	
	
	public final void setMessage(String message) {
		this.message = message;
	}
	public MessageBean() {
		System.out.println("creation MessageBean ");
	}
	public void affiche() {
		System.out.println(" message :"+ message);
	}
	
	@Override
	public String toString() {
		
		return "messageBean";
	}
}
