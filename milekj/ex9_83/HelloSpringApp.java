package milekj.ex9_83;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("milekj/ex9_83/applicationContext.xml");

		// retrieve bean from spring container
		Coach gymCoach = context.getBean("gymCoach", Coach.class);
		System.out.println(gymCoach.getDailyWorkout());
		System.out.println(gymCoach.getFortune());

		Coach gymCoach2 = context.getBean("gymCoach", Coach.class);
		System.out.println(gymCoach == gymCoach2);

		// close the context
		context.close();
	}

}







