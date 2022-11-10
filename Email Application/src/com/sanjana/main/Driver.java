package com.sanjana.main;
import java.util.Scanner;
import com.sanjana.model.*;
import com.sanjana.service.*;
public class Driver {
	public static void main(String args[]) {
		
		Employee e = new Employee("Sanjana", "Pandey");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal"); 
		
		Scanner in = new Scanner(System.in);
		int ch = in.nextInt();
		
		switch(ch) {
		 case 1:
			 generatedEmail = cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(),"tech");
			 generatedPassword = cs.generatePassword();
			 cs.showCredentials(e, generatedEmail, generatedPassword);
			 break;
		 case 2:
			 generatedEmail = cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(),"adm");
			 generatedPassword = cs.generatePassword();
			 cs.showCredentials(e, generatedEmail, generatedPassword);
			 break;
		 case 3:
			 generatedEmail = cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(),"hr");
			 generatedPassword = cs.generatePassword();
			 cs.showCredentials(e, generatedEmail, generatedPassword);
			 break;
		 case 4:
			 generatedEmail = cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(),"legal");
			 generatedPassword = cs.generatePassword();
			 cs.showCredentials(e, generatedEmail, generatedPassword);
			 break;
		}
		
		in.close();
	}
}
