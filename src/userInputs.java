import java.util.Scanner;


public class userInputs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        // sometimes when using nextline you will skip the input can be fixed if you put in scanner.nextLine()
        System.out.println("Hello " +name);
        System.out.println("You're "+age+" years old");
    }
}
