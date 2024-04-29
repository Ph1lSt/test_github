package excursion;

import java.util.Scanner;

public class SumOfTheDigits {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Geben Sie eine number ein:");
        String numberString = scanner.nextLine();
        
        int quersumme = berechneQuersumme(numberString);
        
        System.out.println("Die Quersumme von " + numberString + " ist: " + quersumme);
        
        scanner.close();
    }
    
    public static int berechneQuersumme(String numberString) {
        int quersumme = 0;
        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);
            if (Character.isDigit(c)) {
                int number = Character.getNumericValue(c);
                quersumme += number;
            } else {
                System.out.println("Ungültiges Zeichen gefunden: " + c);
                return -1; // Falls eine ungültige Zeichen gefunden wird
            }
        }
        return quersumme;
    }
}

