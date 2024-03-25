import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
public class RandomAccessFileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Create a new file");
            System.out.println("2. Delete a file");
            System.out.println("3. Write to file");
            System.out.println("4. Append to file");
            System.out.println("5. Read from file");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    createFile(scanner);
                    break;
                case 2:
                    deleteFile(scanner);
                    break;
                case 3:
                    writeToFile(scanner);
                    break;
                case 4:
                    appendToFile(scanner);
                    break;
                case 5:
                    readFromFile(scanner);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
        scanner.close();
    }
    private static void createFile(Scanner scanner) {
        System.out.print("Enter file name to create: ");
        String fileName = scanner.nextLine();
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
    private static void deleteFile(Scanner scanner) {
        System.out.print("Enter file name to delete: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
    private static void writeToFile(Scanner scanner) {
        System.out.print("Enter file name to write to: ");
        String fileName = scanner.nextLine();
       RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(fileName, "rw");
            System.out.print("Enter content to write: ");
            String content = scanner.nextLine();
            raf.writeBytes(content);
            System.out.println("Content written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }

    private static void appendToFile(Scanner scanner) {
        System.out.print("Enter file name to append to: ");
        String fileName = scanner.nextLine();
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(fileName, "rw");
            raf.seek(raf.length());
            System.out.print("Enter content to append: ");
            String content = scanner.nextLine();
            raf.writeBytes(content);
            System.out.println("Content appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
    private static void readFromFile(Scanner scanner) {
        System.out.print("Enter file name to read from: ");
        String fileName = scanner.nextLine();
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(fileName, "r");
            byte[] buffer = new byte[(int) raf.length()];
            raf.readFully(buffer);
            System.out.println("Content of file:");
            System.out.println(new String(buffer));
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
}
