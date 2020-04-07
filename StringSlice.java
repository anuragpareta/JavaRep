package pkg1;

public class StringSlice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "zaq1xsw2";
		String strx="q1";
		String stry="g2";
//		System.out.println(str.charAt(3));     1
		String temp = "";
		for (int i = 0; i<= str.length()-1; i++) {
			temp = str.charAt(i)+temp;
		}
		System.out.println(temp);
		System.out.println(str.substring(2));
		System.out.println(str.substring(3,5));
		System.out.println(str.replace(strx, stry));
		
		String str5 = "WE@#4KLKJKDF%&*MATA-MICHAL";
		String patt = "[^A-Za-z0-9\\s]";
		System.out.println(str5.replaceAll(patt, ""));
	}
	
	

}
