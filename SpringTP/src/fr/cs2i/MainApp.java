package fr.cs2i;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	  // créer un contexte d'application, initialisation des beans
	  AbstractApplicationContext  context = new ClassPathXmlApplicationContext("Beans.xml");
      // récupérer le bean helloWorld
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
      //méthode 1
      objA.setMessage("I'm object A");
      objA.getMessage();

      // récupérer le bean helloWorld
      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
      objB.getMessage();
      // fermeture des beans initialisé
      context.registerShutdownHook(); 
   }
}