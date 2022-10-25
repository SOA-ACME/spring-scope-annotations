package com.trifulcas.springprueba;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("miSaludo")
@Scope("prototype")
public class Saludos {
	
	@Autowired
	@Qualifier("formal")
	private ISaludo _saludo;
	
	public void setSaludo(ISaludo miSaludo) {
		_saludo=miSaludo;
	}
	public String hola() {
		return _saludo.hola();
	}
	public String adios() {
		return _saludo.adios();
	}
	

	public void iniciar() {
		System.out.println("Estamos iniciando la clase");
	}
	

	public void finalizar() {
		System.out.println("Estamos finalizando la clase");
	}
}
