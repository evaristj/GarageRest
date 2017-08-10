package com.everis.beca.ws.rs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Car {
	
	String matricula;
	String color;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
