package fr.cs2i;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   // créer un contexte d'application
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      // récupérer le bean helloWorld
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
   }
}