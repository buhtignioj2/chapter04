package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		// 현재시간
		Date now = new Date();

		System.out.println(now);
		printDate(now);

		// 특정 시간 세팅 ( 2000/08/04)
		// 1900년 기준임 그래서
		// 년은 -1900해서 쓰고. 월은 -1 해서쓰고 , 일은 그냥쓰면댐
		Date d1 = new Date(100, 7, 4);
		printDate(d1);

		// 특정 시간 세팅 ( 2000/08/04 14:30:30)
		Date d2 = new Date(100, 7, 4, 14, 30, 30);
		printDate(d2);

		// 1970년 1월 1일 00:00:00 기준
		Date d3 = new Date(24L * 60 * 60 * 1000 * 365 * 30);
		printDate2(d3);
	}

	public static void printDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 - hh시 mm분 ss초");
		System.out.println(sdf.format(date));
	}

	public static void printDate2( Date d ) {
		// 년도 ( +1900 ) 
		int year = d.getYear();
		
		// 월 ( 0 - 11 )
		int month = d.getMonth();
		
		// 일
		int date = d.getDate();
		
		// 시
		int hours = d.getHours();
		
		// 분
		int minutes = d.getMinutes();
		
		// 초
		int seconds = d.getSeconds();
		
		System.out.println( ( year + 1900 ) + "년 " + ( String.format("%02d", month +1 )) + "월 " + String.format("%02d", date) + "일 " 
				+ String.format("%02d", hours) + "시 " + String.format("%02d", minutes) + "분 " + String.format("%02d", seconds) + "초");
	}

}
