package fr.cs2i;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	  // cr�er un contexte d'application, initialisation des beans
	  AbstractApplicationContext  context = new ClassPathXmlApplicationContext("Beans.xml");
      // r�cup�rer le bean helloWorld
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
      //m�thode 1
      objA.setMessage("I'm object A");
      objA.getMessage();

      // r�cup�rer le bean helloWorld
      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
      objB.getMessage();
      // fermeture des beans initialis�
      context.registerShutdownHook(); 
   }
}