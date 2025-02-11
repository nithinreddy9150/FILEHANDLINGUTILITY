package Nithin;

import java.io.*;
public class filehandlingutility{
 public static void main(String[] args) {
 String filename = "example.txt";
 // Writing to a file
 try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
 writer.write("Hello, this is a test file.\n");
 writer.write("This is a second line.");
 System.out.println("File written successfully.");
 } catch (IOException e) {
 e.printStackTrace();
 }
 // Reading from a file
 try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
 String line;
 System.out.println("\nReading from file:");
 while ((line = reader.readLine()) != null) {
 System.out.println(line);
 }
 } catch (IOException e) {
 e.printStackTrace();
 }
 // Modifying the file (Appending)
 try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true)))
{
 writer.newLine();
 writer.write("This is an appended line.");
 System.out.println("\nFile modified successfully.");
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
}