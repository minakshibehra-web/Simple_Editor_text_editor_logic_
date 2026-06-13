// Minakshi Behra
// ERP:- RU-25-10821
import java.util.Scanner;

class Document {
    private StringBuffer textBuffer;

    // Constructor
    public Document() {
        textBuffer = new StringBuffer();
    }

    // Add text
    public void addText(String input) {
        textBuffer.append(input);
        System.out.println("Text added!");
    }

    // Clear text
    public void clearText() {
        textBuffer.setLength(0);
        System.out.println("Text cleared!");
    }

    // Reverse text
    public void reverseText() {
        textBuffer.reverse();
        System.out.println("Text reversed!");
    }

    // Delete text
    public void deleteText(int start, int end) {
        try {
            textBuffer.delete(start, end);
            System.out.println("Text deleted!");
        } catch (Exception e) {
            System.out.println("Invalid range!");
        }
    }

    // Display text
    public void displayText() {
        if (textBuffer.length() == 0) {
            System.out.println("Text is empty.");
        } else {
            System.out.println("Current Text: " + textBuffer.toString());
        }
    }
}

 public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Document doc = new Document();

        int choice;

        do {
            System.out.println("\n--- Simple Text Editor ---");
            System.out.println("1. Add Text");
            System.out.println("2. Clear Text");
            System.out.println("3. Reverse Text");
            System.out.println("4. Delete Text");
            System.out.println("5. Display Text");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next();
            }

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    String input = sc.nextLine();
                    doc.addText(input);
                    break;

                case 2:
                    doc.clearText();
                    break;

                case 3:
                    doc.reverseText();
                    break;

                case 4:
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    sc.nextLine(); // consume newline
                    doc.deleteText(start, end);
                    break;

                case 5:
                    doc.displayText();
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}