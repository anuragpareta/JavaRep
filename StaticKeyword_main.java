package oops_concepts;

public class StaticKeyword_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword sk = new StaticKeyword();
		
		sk.age = 15;
		sk.grade= "3rd";
		StaticKeyword.stName = "Vishal";
		sk.displayDetails();

	}

}
