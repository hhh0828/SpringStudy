package spring.ui.di.mi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.ui.di.Exam;

@Component
public class Total implements MathH {
	
	@Autowired
	// required = false 객체가 없어도 OK
	//qualifier를 bean id 기준으로. 자료형식기준으로 쓰고 
	//자료형식을 보고, 모호하면 이름을따라감.
	@Qualifier("zdz")
	Exam exam;
	
	public Total ()
	{
		
	}
	
	public Total(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void print() {
		System.out.println(exam.add() + "tot");
	}

	@Override
	public void setExam(Exam exam) {
		
		this.exam = exam;
		
	}
}
