package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws_declaration {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		abc();

	}
	
	public static void abc() throws IOException {
		
		FileInputStream x= new FileInputStream("E:/fitness/abcd.txt");
		
	}

}
