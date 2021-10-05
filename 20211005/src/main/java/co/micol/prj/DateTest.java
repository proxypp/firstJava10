package co.micol.prj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateTest {
	private Date date;
	private Calendar now;
	private SimpleDateFormat sd;
	void dateTest() {
//		sd = new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss "); //날짜 표현 형식 정의 // 앞쪽 MM과 뒤쪽 mm을 대문자나 소문자를 같게 하는경우 충돌이 일어난다.
//		sd = new SimpleDateFormat("yyyy년MM월dd일");
		sd = new SimpleDateFormat("현재시간 hh:mm:ss");
		date = new Date(); //새로운 날짜 객체를 생성
		
		System.out.println(sd.format(date));
		System.out.println(date);
		System.out.println("=================");
	}
	void calendarTest() {
		now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONDAY)+1;
		System.out.println(month);
	}
	
	
}
