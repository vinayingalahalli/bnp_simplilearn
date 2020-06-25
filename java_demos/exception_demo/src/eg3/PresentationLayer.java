package eg3;

import customexception.BusinessException;
import customexception.InvalidAgeException;

public class PresentationLayer {

	public static void main(String[] args) {
		
		BusinessLayer b=new BusinessLayer();
		try {
		if(b.isValidAge(-30)) {
			System.out.println("Age Validated");
		}
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if(b.isValidPan("ABCDE1234A")) {
				System.out.println("Pan validated");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}

}
