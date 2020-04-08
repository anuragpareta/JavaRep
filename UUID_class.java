package special_classes;

import java.util.UUID;

public class UUID_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UUID.randomUUID();
		for (int i=0; i<=100;i++) {
			System.out.println(UUID.randomUUID());  // 128 bit value universally unique
		}

	}

}
