package Service;

import java.util.ArrayList;
import java.util.Map;

import BusinessLogic.RegistrationValidation;

public class DeleteCBI {

	RegistrationValidation obj=new RegistrationValidation();
	Map<String, ArrayList> map=obj.jailormap;
	public void deletedetails(String email) {
		// TODO Auto-generated method stub
			if(map.get(email)==null) {
				System.out.println("You are not reistered");
			}
			else {
			map.remove(email);
			System.out.println();
		}
	}

}
