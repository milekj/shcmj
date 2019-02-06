package milekj.ex6_50;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("milekj/ex6_50/applicationContext.xml");
				
		// retrieve bean from spring container
		Coach singletonCoach1 = context.getBean("myCoach", Coach.class);
		Coach singletonCoach2 = context.getBean("myCoach", Coach.class);

		System.out.println("singletonCoach1 == singletonCoach2 ? " + (singletonCoach1 == singletonCoach2));

		Coach prototypeCoach1 = context.getBean("myPrototypeCoach", Coach.class);
		Coach prototypeCoach2 = context.getBean("myPrototypeCoach", Coach.class);

		System.out.println("prototypeCoach1 == prototypeCoach2 ? " + (prototypeCoach1 == prototypeCoach2));

		// close the context
		context.close();
	}

}







