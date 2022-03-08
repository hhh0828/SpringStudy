package spring.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ui.di.Exam;
import spring.ui.di.Hexam;
import spring.ui.di.Jexam;
import spring.ui.di.mi.Average;
import spring.ui.di.mi.MathH;
import spring.ui.di.mi.Total;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		 * Exam hexam = new Hexam(3,5); 
		 * Exam jexam = new Jexam(3,3,3,3,3,3); //Exam 타입
		 * 객체가 바뀌거나, //MathH 타입 객체가 바뀌거나. 
		 * Average average = new Average(jexam); //Total
		 * total = new Total(hexam); MathH total = new Total();
		 * 
		 * total.setExam(hexam);
		 */
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/ui/Setting.xml"); 
		//ioc컨테이너임		
		
			//Average average = (Average) context.getBean("average");
			//average
			MathH total = context.getBean(Total.class);
			MathH aver = context.getBean(Average.class);
			
			Exam exam = context.getBean(Hexam.class);
			Exam jee = context.getBean(Jexam.class);
		
		total.print();
		
		aver.print();
		
		System.out.println(exam.toString());
		System.out.println(jee.toString());
		
	}

}
