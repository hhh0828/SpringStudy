package spring.ui.di.mi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.ui.di.Exam;

@Component
public class Average implements MathH {


	@Autowired
	// required = false 객체가 없어도 OK
	//qualifier를 bean id 기준으로. 자료형식기준으로 쓰고 
	//자료형식을 보고, 모호하면 이름을따라감.
	@Qualifier("zz")
	private Exam exam;
	//기본생성자 통해서됨
	
	public Average()
	{
		System.out.println("constructor");
	}
	
	
	public Average(Exam exam) {
		this.exam = exam;
		System.out.println("overedcons");
	}
	
	@Override
	public void print() {
		
		System.out.println(exam.add() + "Aver");
	}
	

	@Override
	public void setExam(Exam exam) {
		System.out.println("setterinjection");
		this.exam = exam;
		
	}
}
