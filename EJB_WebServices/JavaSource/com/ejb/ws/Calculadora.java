
package com.ejb.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Calculadora {
	
	private int numero1;
	private int numero2;
	private int resultado;
	
	
	
	//getters y setters
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	
}
