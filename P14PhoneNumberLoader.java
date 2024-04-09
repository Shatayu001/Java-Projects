//Write a Java program that you dude's phone number name from a text file using hash table

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class P14PhoneNumberLoader {

    public static void main(String[] args) {
        // Create a hash table to store phone numbers and names
        HashMap<String, String> phoneBook = new HashMap<>();

        // Path to the file containing phone numbers and names
        String fileName = "phoneNumbers.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split each line into name and phone number
                String[] parts = line.split("\\s+", 3); // Split by spaces into 3 parts
                if (parts.length >= 2) {
                    String name = parts[0] + " " + parts[1];
                    String phoneNumber = parts[2];

                    // Store name and phone number in the hash table
                    phoneBook.put(name, phoneNumber);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        // Display the contents of the phone book
        System.out.println("Phone Book Contents:");
        for (String name : phoneBook.keySet()) {
            String phoneNumber = phoneBook.get(name);
            System.out.println(name + " : " + phoneNumber);
        }
    }
}
