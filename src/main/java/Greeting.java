import java.util.Scanner;

/**
 * Created by jonathanleczner on 9/9/16.
 */
public class Greeting {
    public static void main(String[] args) {
        Greeting g = new Greeting();
        g.promptUser();
        String inputName = g.getInput();
        String greeting = g.greetingCheck(inputName);
        g.printGreeting(greeting);
    }

    public void promptUser() {
        System.out.println("Enter your name:");
    }

    public String getInput() {
        Scanner s = new Scanner(System.in);
        String name = s.next();
        return name;
    }
    public String greetingCheck(String name) {
        String greetingString = "";
        String nameCaps = name.toUpperCase(); // to accept any capitalization format
        switch (nameCaps) {
            case "BOB":
                greetingString = "Hey, Bob.";
                break;
            case "ALICE":
                greetingString = "Hey, Alice.";
                break;
            default: // do nothing
                break;
        }
        return greetingString;
    }

    public void printGreeting(String greeting) {
        System.out.println(greeting);
    }
}
