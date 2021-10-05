package co.micol.prj;

public class Exam01 {
	private String str = "20001004";	//yyyymmdd
	private String nstr = "1234";
	private String mstr = "3456";
	private String cstr = " akcdefg.jsp.old";
	
	void stringTest() {
		System.out.println(str.toString());
		System.out.println(nstr.toString());
		System.out.println(nstr+mstr);
		
		int n = Integer.valueOf(nstr);
		int m = Integer.valueOf(mstr);
		System.out.println(n+m);
		
		if (str.equals(cstr)) {
			System.out.println(cstr);
		}//str == cstr
		String mm = str.substring(4, 6);//4번째부터 6전 까지.
		String dd = str.substring(6);//6번째부터 끝까지.
		System.out.println("귀하의 생일은 "+mm+ "월 " +dd+"일 입니다.");
		String df = cstr.substring(0, 7);
		
		int l = cstr.indexOf(".");
		
		System.out.println(cstr.substring(0, 1));
		System.out.println(cstr.replace("k", "B"));
		System.out.println(cstr.concat("xyz"));
		System.out.println(cstr.toUpperCase());
		System.out.println(cstr.getBytes());
		System.out.println(cstr.trim());
		
		char c = 'a';
		
		String cs= String.valueOf(c); //char type을 String type 으로 변환.
		
		String s = "a";
		if (cs == s) {
			System.out.println(c);
		}
		
		
	}
			
}
