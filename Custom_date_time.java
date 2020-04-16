package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Custom_date_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d1 = LocalDate.of(2020, 12, 25);
		LocalDate d2 = LocalDate.of(2020, Month.AUGUST, 25);
		
		System.out.println(d1);
		System.out.println(d2);
		
		LocalTime t1 = LocalTime.of(20,48);
		LocalTime t2 = LocalTime.of(15,30,58);
		LocalTime t3 = LocalTime.of(12, 15,24,136);
		
		System.out.println("----------------------------");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);	
		System.out.println("***************************");
		
		LocalDateTime dt1 = LocalDateTime.of(d2, t2);
		LocalDateTime dt2 = LocalDateTime.of(2022, 06, 24, 15, 36, 49, 899);
		
		System.out.println(dt1);
		System.out.println(dt2);
		
		
		 
	}

}
