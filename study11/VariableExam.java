package study11;

class Score {
	int kor;	//맴버변수, 인스턴스변수
	int eng;
	int hap;
	int avg;
	
	public void setKor(int kor) {		//매개변수
		
		this.kor = kor;		//인스턴스변수 = 매개변수;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setHap() {
		hap = kor + eng;	    //this 생략도 가능
		//this.hqp = this.kor + this.eng;
	}
	public void setAvg() {
		avg = hap/2;
	}
}

public class VariableExam {
	public static void main(String[] args) {
		Score score = new Score();
		score.setKor(100);
		//score.kor = 100;
		score.setEng(90);
		//score.eng = 90;
		score.setHap();
		score.setAvg();
		//int avg = (score.kor + score.eng)/2;
		System.out.println("국어 : " + score.kor + ", 영어 : " + score.eng + "\n" +
						   "합계 : " + score.hap + ", 평균 : " + score.avg);
	}

}
