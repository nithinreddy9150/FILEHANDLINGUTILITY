## 1. Introduction
This Java program demonstrates file handling operations, including reading, writing, and modifying text files. It is useful for applications that need persistent storage of textual data.

## 2. Requirements
- Java Development Kit (JDK) 8 or later
- Any Java IDE (e.g., IntelliJ IDEA, Eclipse, VS Code)

## 3. Implementation Details
This program performs the following operations:
- Writing data to a file
- Reading data from a file
- Modifying (appending) data to the file

## 4. Code Explanation
```java
import java.io.*;

public class filehandlingutility {
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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.newLine();
            writer.write("This is an appended line.");
            System.out.println("\nFile modified successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
5. How to Run the Program
Save the file as filehandlingutility.java.
Open a terminal or command prompt.
Navigate to the directory where the Java file is saved.
Compile the program using:

javac filehandlingutility.java
Run the program using:
java filehandlingutility
6. Sample Output
File written successfully.

Reading from file:
Hello, this is a test file.
This is a second line.

File modified successfully.
7. Conclusion
This program effectively demonstrates Java's file handling capabilities, including writing, reading, and modifying files. It is a fundamental operation for applications requiring data persistence
