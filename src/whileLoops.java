import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
        // while loop = executes code as long as condition is true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        do { // ensures that something will happen at least once then checks condition afterwards very similar to a normal while loop tho
            System.out.print("Enter your name");
            name = scanner.nextLine();
        }while(name.isBlank());
            System.out.println("Hello "+name);
    }

}
