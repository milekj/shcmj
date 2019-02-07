package milekj.ex8_75;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("milekj/ex8_75/applicationContext.xml");

		// retrieve bean from spring container
		Coach gymCoach = context.getBean("gymCoach", Coach.class);
		System.out.println(gymCoach.getDailyWorkout());
		System.out.println(gymCoach.getFortune());

		// close the context
		context.close();
	}

}







