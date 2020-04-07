package oops_concepts;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m= new Method();
		m.dothis();
		m.addition(45, 10);
		int x =m.multiply(25, 3);
		System.out.println(x);

	}
	
	public void dothis() {
		System.out.println("Executed dothis method");
	}
	public void addition(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public int multiply(int num1, int num2) {
		int num3= num1*num2;
		return num3;
		
	}
	
}
