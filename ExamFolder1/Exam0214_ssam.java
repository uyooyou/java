package ExamFolder1;

public class Exam0214_ssam {

	public static void main(String[] args) {
		mth1();
		System.out.println();
		System.out.println();
		
		
		double ret1 = mth2(30,31);
		System.out.println(ret1);
		System.out.println();
		System.out.println();
		
		
		String jumin = "920320-1223334";
		mth3(jumin);
		System.out.println();
		System.out.println();
		
		
		System.out.println("나이 : " + mth4(jumin));
		System.out.println();
		System.out.println();
		
		boolean bn = mth5(jumin);
		if(bn == true) {
			System.out.println("올바른 주민번호");
		}else {
			System.out.println("날짜가 잘못됨");
		}
		System.out.println();
		System.out.println();

		String str = "01012341234,12345678912,01024997,01025259292";
		String result = mth6(str);
		if(result.equals("")) {
			System.out.println("모두 정상");
		}else {
			System.out.println("잘못된 전번 : " + result);
		}
		
		System.out.println();
		
	}
	
	public static void mth1() {
		int a = 0;
		while(a < 10) {
			System.out.print(a + " ");
			a++;
		}	
	}
	
	public static double mth2(int a, int b) {
		int hap = a + b;
		double avg = (double)hap/2;
		return avg;
	}
	
	public static void mth3(String jumin) {
		
		//666666-7777777
		String[] array = jumin.split("-");	// == String[] array = {"666666","7777777"};

		String s1 = "정상";
		String s2 = "정상";
		String s3 = "정상";
		if(array[0].length() != 6) {
			s1 = "비정상";
		}
		if(array[1].length() != 7) {
			s2 = "비정상";
		}
		String gender = array[1].substring(0,1);	//글자 한개
		
		if(Integer.parseInt(gender) < 1 || Integer.parseInt(gender) > 4) {
			s3 = "비정상";
		}
		
		System.out.println("1. 앞 번호" + s1);
		System.out.println("2. 뒷 번호" + s2);
		System.out.println("3. 성별" + s3);
	}
	
	public static int mth4(String jumin) {
		//920320-1223334
		String str1 = jumin.substring(0,2);	//문자2개
		String gender = jumin.substring(7,8);
		
		String str2 = "";
		if(gender.equals("1") || gender.equals("2")) {
			str2 = "19"+str1;
		}else if(gender.equals("3") || gender.equals("4")) {
			str2 = "20"+str1;
		}
		int year = Integer.parseInt(str2);
		
		int age = 2025 - year;
		return age;
	}
	
	public static boolean mth5(String jumin) {
		//92 03 20 __ 1,2
		//00 03 20 __ 3,4
		String[] str = jumin.split("-");
		String yy1 = str[0].substring(0,2);
		String mm1 = str[0].substring(2,4);
		String dd1 = str[0].substring(4,6);
		
		int mm2 = Integer.parseInt(mm1);
		int dd2 = Integer.parseInt(dd1);
		
		boolean bn = true;
		if(mm2 < 1 || mm2 > 12) {
			bn = false;
		}else if(dd2 < 1 || dd2 >31) {
			bn = false;
		}
		return bn;
	}

	public static String mth6(String datas) {
		//01012341234,12345678912,01024997,01025259292
		String[] str = datas.split(",");
		//String[] str = {"01012341234,12345678912,01024997,01025259292"};
		String ss = "";
		for(int i = 0; i < str.length; i++) {
			//System.out.println(str[i]);
			if(str[i].length() !=11) {
				ss += str[i] + ",";
			}else if(str[i].startsWith("010") == false) {
				ss += str[i] + ",";
			}
		}
		//마지막 쉼표 제거
		if(!ss.equals("")) {
			ss = ss.substring(0,ss.length()-1);
		}
		
		return ss;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
