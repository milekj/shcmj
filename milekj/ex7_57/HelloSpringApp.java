package milekj.ex7_57;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("milekj/ex7_57/applicationContext.xml");
				
		// retrieve bean from spring container
		Coach gymCoach = context.getBean("toughCoach", Coach.class);
		System.out.println(gymCoach.getDailyWorkout());

		// close the context
		context.close();
	}

}







