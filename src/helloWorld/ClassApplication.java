package helloWorld;

import java.util.Scanner;

public class ClassApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* Input String: "P Sherman 42 Wallaby Way Sydney" *
		  * Variables: firstInitial,lastName, 
		  * *houseNumber,streetName,streetType,city*/
		 
		 Scanner keyboard = new Scanner(System.in);
		 
		 
		 System.out.println("enter your address");
		 String firstInitial = keyboard.next();
		 String lastname = keyboard.next();
	     String houseNumber = keyboard.next();
	     String streetName = keyboard.next();
	     String streetType = keyboard.next();
	     String city = keyboard.next();
		 
	     
		 
		 System.out.println(firstInitial + "\t" + lastname + "  " + houseNumber + "  " +streetName + "  " + streetType + "  " + city);

	}

}
