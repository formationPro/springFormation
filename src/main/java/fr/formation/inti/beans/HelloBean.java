package fr.formation.inti.beans;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	
	MessageBean m;
	
	
	public MessageBean getM() {
		return m;
	}

	public void setM(MessageBean m) {
		this.m = m;
	}
	
	public HelloBean() {
		System.out.println("new HelloBean()");
	}

	public HelloBean(MessageBean m) {
		this.m = m;
	}
	
	public void hello() {
		System.out.println("Bonjour !");
		m.affiche();

	}

}
