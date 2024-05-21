package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadNotes {
    public static void main(String[] args) {
        String filePath = "text.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath, StandardCharsets.UTF_8))) {
            String line;
            StringBuilder musicNotes = new StringBuilder();

            while ((line = br.readLine()) != null) {
                String notesInLine = line.replaceAll("[^A-Ga-g]", "");
                musicNotes.append(notesInLine);
            }

            System.out.println("Gefundene Musiknoten: " + musicNotes.toString());
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen der Datei: " + e.getMessage());
        }
    }
}
