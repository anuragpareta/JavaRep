package oops_concepts;

public class AccessSpecifiers {
	
	public void doThisPublic() {
		System.out.println("Public method");     //accessed to other packages also
	}
	private void doThisPrivate() {
		System.out.println("Private method");    // within same class
 	}
	void doThisDefault() {                     // default access specifier / No access specifier
		System.out.println("Default method");    // accessed to different class but same package
	}

}
