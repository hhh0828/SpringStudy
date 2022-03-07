package spring.ui.di.mi;

import spring.ui.di.Exam;

public class Total implements MathH {
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
