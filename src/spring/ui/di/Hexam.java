package spring.ui.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("zz")
public class Hexam implements Exam {
	@Value("20")
	private int Hscore;
	@Value("40")
	private int H2score;
	
	public Hexam() {
		
	}
	
	
	public Hexam(int Hscore, int H2score) {
		this.Hscore = Hscore;
		this.H2score = H2score;
	}
	
	
	@Override
	public int add() {
		
		return Hscore+H2score;
		
	}
	@Override
	public int minus() {
		
		return Hscore-H2score;
	}
	@Override
	public float average() {
		
		return Hscore+H2score/2;
	}


	public int getHscore() {
		return Hscore;
	}


	public void setHscore(int hscore) {
		Hscore = hscore;
	}


	public int getH2score() {
		return H2score;
	}


	public void setH2score(int h2score) {
		H2score = h2score;
	}


	@Override
	public String toString() {
		return "Hexam [Hscore=" + Hscore + ", H2score=" + H2score + "]";
	}
	
	
	
}
