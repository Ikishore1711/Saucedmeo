package org.selfPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandlingExample {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\My-Moon\\Desktop\\FileHandling.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            List<String> data = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                data.add(line);
            }

            // Process the data (e.g., print to console)
            for (String lineData : data) {
                System.out.println(lineData);
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}


//Explanation:
//
//Import necessary classes:
//
//BufferedReader: Reads text from a character-input stream, buffering the characters to provide for the efficient reading of characters, arrays, and lines.
//FileReader: Reads text from a character-input stream.
//IOException: Handles input/output exceptions that may occur during file reading.
//ArrayList: Used to store the lines read from the file.
//        List: Interface for a collection of objects.
//main method:
//
//String filePath: Stores the path to the file you want to read. Replace "path/to/your/file.txt" with the actual path to your file.
//try-with-resources block: This block ensures that the BufferedReader is automatically closed even if an exception occurs.
//        BufferedReader br = new BufferedReader(new FileReader(filePath)): Creates a BufferedReader object to read from the file.
//        String line;: Declares a variable to store each line read from the file.
//        List<String> data = new ArrayList<>();: Creates an ArrayList to store all the lines read from the file.
//        while ((line = br.readLine()) != null): Reads each line from the file until the end of the file is reached.
//        data.add(line);: Adds each line to the data list.
//Process the data:
//The code iterates through the data list and prints each line to the console.
//Error handling:
//The catch block handles any IOException that might occur during file reading and prints an error message to the console.