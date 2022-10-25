package com.trifulcas.springprueba;

import org.springframework.stereotype.Component;

@Component
public class Formal implements ISaludo{
	@Override
	public String hola() {
		return "Buenos días";
	}
	
	@Override
	public String adios() {
		return "Hasta la próxima";
	}
}
