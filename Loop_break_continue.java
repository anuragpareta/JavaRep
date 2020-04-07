package pkg1;

public class Loop_break_continue {
	public static void main(String[] args) {
	int a = 100;
	 
	while(a>50) {
		a-=5;
		if (a==75){
//			continue;
			break;
		}
		System.out.println(a);
	}
			

}
}
