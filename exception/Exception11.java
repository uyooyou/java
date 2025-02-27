package exception;

public class Exception11 {

	/*
	public static String dataCharge()throws MyDateException {
		String data1 = "";
		if(date.length() !=10) {
			throw new MyDateException();
		}else {
			date1 = date.replace("-","/");
		}
		return date1;
	}
	*/
	
	public static String getGenderValue(String jumin) throws MyGenderException {
		//920320-1112222
		String number = jumin.charAt(7)+"";	//1
		String gender = "";
		if(number.equals("1") || number.equals("3")) {
			gender = "남";
		}else if(number.equals("2") || number.equals("4")) {
			gender = "여";
		}else {
			//예외상황
			throw new MyGenderException();
		}
		return gender;
	}
	
	
	public static void main(String[] args) {
//		try {
//			System.out.println(dateChange("2025-12-25"));
//		}catch(MyDateException e) {
//			System.out.println(e.toString());
//		}
		
		
		
		try {
			System.out.println(getGenderValue("920320-1112222"));
		}catch(MyGenderException e) {
			System.out.println(e.toString());
		}
		

	}

}
