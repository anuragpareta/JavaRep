package abstractPkg;

public class Abst_Mobile_main {
	
	public static void main(String[] args) {
		
		Abst_Mobile m;
		
		m= new Abst_IOS();
		m.doubleTap();
		
		m=new Abst_Android();
		m.doubleTap();
		
	}

}
