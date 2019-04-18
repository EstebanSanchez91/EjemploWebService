package com.ejb.servicios;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.ejb.ws.Calculadora;

@Path("/ServicioCalculadora") //Poder acceder a la clase donde estan los metodos a los cuales yo accedo
@Stateless
public class ServicioCalculadoraRest {
	
//	@Path("/restar")
//	public int restar(int a, int b){
//		return a-b;
//	}
//	
	@Path("/calc")
	@POST
	@Produces({"application/xml"})
	public Calculadora retornaCalculadora(){
		return new Calculadora();
	}
	
	@Path("/imprimo")
	@PUT
	@Consumes("application/xml")
	public void imprimirCalculadora(Calculadora c){
		System.out.println("numero1" + c.getNumero1());
		System.out.println("numero2" + c.getNumero2());
		System.out.println("resultado" + c.getResultado());
	}
	
	@Path("/calculadora")
	@POST
	@Consumes({"application/json"})
	@Produces({"application/xml"})
	public Calculadora getCalculadora(Calculadora c){
		return new Calculadora();
	}
	
	@Path ("/saludo")
	@POST //unicamente peticiones de consulta no se puede enviar parametros
	public String holaMundo(){
		return "hola mundo";
	}
}
