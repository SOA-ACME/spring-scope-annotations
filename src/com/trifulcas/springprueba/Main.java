package com.trifulcas.springprueba;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cargar el contexto antiguo
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Cargar el contexto sin XML
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PruebaConfig.class);
		
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
