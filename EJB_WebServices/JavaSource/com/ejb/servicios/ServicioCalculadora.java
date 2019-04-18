package com.ejb.servicios;

import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService //esta notacion sirve para exponer el metodo como Web Services
@Stateless
public class ServicioCalculadora {
	
	public int sumar(int a, int b){
		return a+b;
	}
}
