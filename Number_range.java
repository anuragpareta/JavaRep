package regex;

public class Number_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String patt1 = "[0-9][0-9]?";                // 0-99   
		String patt2 = "[0-9][0-9]?[0-9]?|1000";     //0-1000  
		String patt3 = "99|[1-9][0-9][0-9][0-9]?";   //99-9999
		String patt4 = "2[5-9]|[3-6][0-9]|7[0-5]";   //25-75
		String patt5 = "2[2-3][0-9]|240";            //220-240
		
		String str = "109";   
		
		System.out.println(str.matches(patt1));

	}

}
