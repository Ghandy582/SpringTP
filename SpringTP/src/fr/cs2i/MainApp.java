package fr.cs2i;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.cs2i.event.CustomEventPublisher;

public class MainApp {
   public static void main(String[] args) {
	  // cr�er un contexte d'application, initialisation des beans
	  //ApplicationContext   context = new ClassPathXmlApplicationContext("Beans.xml");
      // r�cup�rer le bean helloWorld
      //HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
      //m�thode 1
      //objA.setMessage("I'm object A");
      //objA.getMessage();

      // r�cup�rer le bean helloWorld
      /*HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
      objA.getMessage1();
      HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
      objB.getMessage1();
      objB.getMessage2();
      objB.getMessage3();
      // fermeture des beans initialis�
      context.registerShutdownHook(); */
      /*JavaCollection jc=(JavaCollection) context.getBean("javaCollection");
      jc.getAddressList();
      */
      
      /*ApplicationContext ctx = 
         new AnnotationConfigApplicationContext(ConfigHello.class);
   
      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
      helloWorld.setMessage1("Hello World!");
      helloWorld.getMessage1();
      ((AbstractApplicationContext) ctx).registerShutdownHook();*/
	  /* 
	   ConfigurableApplicationContext context = 
         new ClassPathXmlApplicationContext("Beans.xml");

      // Let us raise a start event.
      context.start();
	  
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage1();

      // Let us raise a stop event.
      context.stop();
      context.registerShutdownHook(); 
      */
	  ConfigurableApplicationContext context = 
         new ClassPathXmlApplicationContext("Beans.xml");
	  
      CustomEventPublisher cvp = 
         (CustomEventPublisher) context.getBean("customEventPublisher");
      
      cvp.publish();  
   }
}