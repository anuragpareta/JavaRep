package super_keyword;

public class Super_B extends Super_A {
	
	int num1 = 320;
	
	public void doThis() {
		System.out.println("Do This From B");
	}
	
	public void xyz() {
		System.out.println(super.num1);
	//	doThis();    //current class method
		super.doThis();   //parent class method 
		System.out.println("XYZ Executed");
	}

}
