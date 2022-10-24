package com.trifulcas.springprueba;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cargar el contexto
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Pedir el bean
		Saludos miSaludo = context.getBean("miSaludo", Saludos.class);
		Saludos otroSaludo = context.getBean("miSaludo", Saludos.class);
		
		// Los dos son iguales (Singleton)
		System.out.println(miSaludo.equals(otroSaludo));
		
		// Apuntan a la misma dirección de memoria.
		System.out.println(miSaludo);
		System.out.println(otroSaludo);
				
		// Cerrar el contexto
		context.close();
	}

}
