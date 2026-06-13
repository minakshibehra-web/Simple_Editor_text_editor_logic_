

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

 public class java{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Document doc = new Document();
