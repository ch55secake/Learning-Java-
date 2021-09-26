public class ifStatements {
    public static void main(String[] args) {
        // if statement performs block of code based on a condition

        int age = 75;

        if(age<=25) {
            System.out.println("You aren't 25");
        }
        else if(age>=75) {
            System.out.println("You are old!");
        }
        else if(age>=13){
            System.out.println("You are a teenager!");
        }
        else {
            System.out.println("You are nothing");
        }

    }
}
