package regex;

public class GreedyAndLazyMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "XXfdkfjdkYYdkjfkdXX123456YYttttttttXX565%^&&*&*kfjkdYYiuiuiuiiu5655";
		
		//String patt ="XX.*YY";
		String patt ="XX.*?YY";
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(patt);
		
		java.util.regex.Matcher m = p.matcher(str1);
		System.out.println(m.results().count());
		
		m.reset();
		
		while(m.find()) {
			System.out.println("Starts at : "+m.start());
			System.out.println(m.group());
		}
		

	}

}
