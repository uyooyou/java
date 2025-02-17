package study11;


//맴버변수에 값이 주어지지않으면 0또는 null 값이 부여되지만, 지역변수에 값이 없으면 에러남
public class Test2 {
	//값이 주어지지 안았을 때 출력 값
	String s1 = "";		//공백
	String s2;			//null 값의 세팅이 안되어있음
	String s3 = null;
	int n1 = 0;			//0
	int n2;				//0
	boolean bn;			//false
	double d;			//0.0
	
	public static void main(String[] args) {
		
		
		String ss1 = "";				//공백
		String ss2;						//null
		int nn1 = 0;					//0
		int nn2;						//null

		System.out.println(ss1);		
		//System.out.println(ss2);		//null 값은 단독출력 불가
		System.out.println("");
		//System.out.println(null);		//null 값은 단독출력 불가
		System.out.println(nn1);		//0
		//System.out.println(nn2);		//null
		

		
		Test2 t2 = new Test2();

		System.out.println("s1 : " +t2.s1);		//공백
		System.out.println("s2 : " +t2.s2);		//null
		System.out.println("n1 : " +t2.n1);		//0
		System.out.println("n2 : " +t2.n2);		//0
		System.out.println("bn : " +t2.bn);		//false
		System.out.println("d : " +t2.d);		//0.0
		


	}

}
