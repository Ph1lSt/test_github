package tasks;

import java.util.Stack;

public class RightBrackets {
	
//	public static boolean bracketsOpen(String text){
//		boolean bracketsMistake = false;
//		int roundBrackets = 0;
//		int sqrBrackets = 0;
//		int curvedBrackets = 0;
//		Stack<Character> stack = new Stack<>(); 
//		for (int i = 0; i < text.length(); i++) {
//            stack.push(text.charAt(i));
//        }
//		
//	    for (char c : stack) {
//	    	switch(c) {
//	    	case 123: curvedBrackets++; break;
//	    	case 125: curvedBrackets--; break;
//	    	case 91: sqrBrackets++; break;
//	    	case 93: sqrBrackets--; break;
//	    	case 40: roundBrackets++; break;
//	    	case 41: roundBrackets--; break;
//	    	default: boolean error = true;
//	    	}	
//	    }
//	    
//	    if(roundBrackets != 0 && (sqrBrackets != 0 || curvedBrackets != 0)) {
//	    	bracketsMistake = true;
//	    }else if(roundBrackets != 0 && curvedBrackets != 0 || sqrBrackets == 0 && curvedBrackets != 0) {
//	    	bracketsMistake = true;
//	    }
//	    
//	    if(roundBrackets != 0 || sqrBrackets !=0 || curvedBrackets != 0) {
//	    	bracketsMistake = true;
//
//	    }else {
//	    	bracketsMistake = false;
//	    }
//	    
//	    if(bracketsMistake == true) {
//	    	System.out.println("Fehlerhafte Klammerung!");
//	    }else {
//	    	System.out.println("Korrekte Klammerung!");
//	    }
//	    
//	    return bracketsMistake;
//	}
	
	public static boolean checkBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            } else if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
                if (stack.isEmpty()) {
                    return false; // Es gibt keine offene Klammer für diese schließende Klammer
                } else {
                    char top = stack.pop();
                    if ((currentChar == ')' && top != '(') ||
                        (currentChar == ']' && top != '[') ||
                        (currentChar == '}' && top != '{')) {
                    	System.err.println("Fehlerhafte Klammerung!");
                        return false; // Die Klammerung stimmt nicht überein
                    }
                }
            }
        }
        System.out.println("Korrekte Klammerung!");
        return stack.isEmpty(); // Der Stack sollte leer sein, wenn die Klammerung korrekt ist
    }
}
