package excursion;

import java.util.Scanner;

public class CamelCaseSplitter {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
    	sc.close();
        String[] words = splitCamelCase(input);
        
        System.out.println("Zerlegt:");
        for (String word : words) {
            System.out.println(word);
        }
    }
    
    public static String[] splitCamelCase(String input) {
        // Regex: Matches a transition from lower to upper case, except at the beginning of the string
        String[] words = input.split("(?<!(^|[A-Z]))(?=[A-Z])");
        return words;
    }
}
