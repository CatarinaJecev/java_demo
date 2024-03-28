package Homework;

class TextEditor {
    private StringBuilder text;

    // Constructor to initialize text string
    public TextEditor() {
        this.text = new StringBuilder();
    }

    // Method to append text to the current string
    public void appendText(String newText) {
        text.append(newText);
    }

    // Method to print the current string
    public void printCurrentText() {
        System.out.println("Current text: " + text.toString());
    }
}

public class TextEditorDemo {
    public static void main(String[] args) {
        // Create a TextEditor object
        TextEditor editor = new TextEditor();

        // Add multiple lines of text
        editor.appendText("Hello, ");
        editor.appendText("this is a ");
        editor.appendText("sample text.");

        // Print the current text
        editor.printCurrentText();
    }
}
