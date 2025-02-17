package study07;

public class Method1 {

	/*
	 * 자바프로그램은 실행 시 main 메소드만 실행함
	 */
	public static void main(String[] args) {
		//scriptProgram 메소드를 호출한다.
		scriptProgram();
		System.out.println("====================================");
		//dbprogram 메소드를 호출한다.
		dbprogram();
		
		
		
	}
	public static void scriptProgram() {
		System.out.println("javascript");
		System.out.println("jquery");
		System.out.println("react");
		System.out.println("vue");
	}
	public static void dbprogram() {
		System.out.println("oracle");
		System.out.println("mysql");
		System.out.println("maria-db");
		System.out.println("mssql");
		System.out.println("db2");
		System.out.println("mongo-db");
		
	}

}
