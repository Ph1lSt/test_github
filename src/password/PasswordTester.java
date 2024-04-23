package password;

import java.util.LinkedList;
import java.util.Scanner;

public class PasswordTester {

	public static boolean isGoodPassword() {
		boolean isGoodPassword = false;
		boolean pwSize = false;
		boolean specialCases = false;
		boolean numbers = false;
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		LinkedList<Character> passwordList = new LinkedList<>();
        for (int i = 0; i < password.length(); i++) {
            Character c = password.charAt(i);
            passwordList.add(c);
            if(Character.isDigit(c)) {
            	numbers = true;
            }
            if(!Character.isLetterOrDigit(c)) {
            	specialCases = true;
            }
            if(passwordList.size() >= 8) {
            	pwSize = true;
            }
        }
        if(pwSize && specialCases && numbers) {
        	isGoodPassword = true;
        	System.out.println("That's a good password!");
        }else {
        	System.err.println("Password is too weak!");
        }
		sc.close();
		return isGoodPassword;
	}
	public static void main(String[] args) {
		isGoodPassword();
	}

}
