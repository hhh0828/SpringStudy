package spring.ui.di;

public class Jexam implements Exam {

	private int JA;
	private int JB;
	private int JC;
	private int JAA;
	private int JBB;
	private int JCC;
	
	public Jexam(){
		//기본생성자
	}
	
	public Jexam(int jA, int jB, int jC, int jAA, int jBB, int jCC) {
		JA = jA;
		JB = jB;
		JC = jC;
		JAA = jAA;
		JBB = jBB;
		JCC = jCC;
		//기본
	}

	public int getJA() {
		return JA;
	}

	public void setJA(int jA) {
		JA = jA;
	}

	public int getJB() {
		return JB;
	}

	public void setJB(int jB) {
		JB = jB;
	}

	public int getJC() {
		return JC;
	}

	public void setJC(int jC) {
		JC = jC;
	}

	public int getJAA() {
		return JAA;
	}

	public void setJAA(int jAA) {
		JAA = jAA;
	}

	public int getJBB() {
		return JBB;
	}

	public void setJBB(int jBB) {
		JBB = jBB;
	}

	public int getJCC() {
		return JCC;
	}

	public void setJCC(int jCC) {
		JCC = jCC;
	}

	@Override
	public int add() {
		return JA+JB+JC+JAA+JBB+JCC;
	}

	@Override
	public int minus() {
		return JA-JB-JC-JAA-JBB-JCC;
	}

	@Override
	public float average() {
		return JA+JB+JC+JAA+JBB+JCC/6;
	}

	@Override
	public String toString() {
		return "Jexam [JA=" + JA + ", JB=" + JB + ", JC=" + JC + ", JAA=" + JAA + ", JBB=" + JBB + ", JCC=" + JCC + "]";
	}

	
}
