package com.sanjana.service;
import java.util.Random;

import com.sanjana.model.*;
public class CredentialService {
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+".abc.com";
	}
	
	public void showCredentials(Employee e, String email, char[] password) {
		System.out.println("Dear "+e.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email  --->  "+email);
		System.out.print("Password  --->  ");
		System.out.println(password);
	}
	
	public char[] generatePassword() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialCharacters = "!@#$%^&*_=+-/.?<>";
		
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random random = new Random();
		
		char[] password = new char[8];
		
		for(int i = 0; i<8 ; i++) {
			//Use of charAt() method to get character value
			//Use of nextInt() as it is scanning the value as int
			
			
		//----------------------------------------------------------------
			password[i] = values.charAt(random.nextInt(values.length()));
		//----------------------------------------------------------------
			
			
			//Random class we have an inbuilt function nextInt()
			
			/*nextInt() Returns a pseudo random, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive),
			 *  drawn from this random number generator's sequence. The general contract of nextInt is that one int value in the specified
			 *   range is pseudo randomly generated and returned. All bound possible int values are produced with (approximately) equal probability.*/ 
			
			/*Why are we using length of String "values" here?? because we want to pick a random character from "values" and we need to generate random
			numbers from 0 to the length of the String "values" thus passing its length is important.
			 			values.length = 77
			Here, length of values is 77 so the value 77 will 
			 			random.nextInt(77) => 0 to 76 any one value
			So, here the random function will return any value between 0 and 76
			Now we got a random value from the above piece of code and now when the resulting value will be passed in values.charAt(any number between 0 and 76)
			charAt() will return the character at the specified index
			*/	
		}
		
		return password;
	}
}
