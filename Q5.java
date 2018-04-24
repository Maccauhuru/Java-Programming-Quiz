package javachallengequestions;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a word");
    String userInput = "";
    userInput = reader.nextLine();
    String reversed = "";
    reader.close();
    
    for(int i =userInput.length()-1; i >= 0; i--) {
    	reversed += userInput.charAt(i);
    }
    System.out.println("Your word : " + userInput);
    System.out.println("Your word reversed : " + reversed);
		
	}
}
