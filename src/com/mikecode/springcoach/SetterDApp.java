package com.mikecode.springcoach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDApp {

	public static void main(String[] args) {
		
		
		// load the the spring configuration file
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		//call new setter methods
		
		System.out.println(theCoach.getEmailAdd());
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();
 
	}

}
