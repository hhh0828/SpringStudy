package spring.ui.di.mi;

import spring.ui.di.Exam;

public class Average implements MathH {

	Exam exam;
	
	public Average()
	{
		
	}
	
	public Average(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void print() {
		System.out.println(exam.add() + "Aver");
	}
	
	@Override
	public void setExam(Exam exam) {
		
		this.exam = exam;
		
	}
}
