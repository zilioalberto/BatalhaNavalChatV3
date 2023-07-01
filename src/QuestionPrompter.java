import java.util.Scanner;

public class QuestionPrompter {
    private Scanner scanner;

    public QuestionPrompter() {
        scanner = new Scanner(System.in);
    }

    public String askQuestion(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }

}
