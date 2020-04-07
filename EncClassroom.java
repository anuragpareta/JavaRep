package oops_concepts;

public class EncClassroom {
	
	private String sub;
	private int stdcount;
	
	
	public String getSub() {
		return sub;
	}


	public void setSub(String sub) {
		this.sub = sub;
	}


	public int getStdcount() {
		return stdcount;
	}


	public void setStdcount(int stdcount) {
		this.stdcount = stdcount;
	}


	public void displayDetails() {
		System.out.println("This is "+ sub+" classroom and "+stdcount+" students are present");
	}

}
