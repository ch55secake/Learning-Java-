import java.util.Locale;

public class stringMethods {
    public static void main(String[] args) {

        String name = "Joe";
        // returns a true or false value on whether they are the same, it is case-sensitive, but you can use .ignoreCase()
        boolean result = name.equals("Joe");
        // self-explanatory
        int resultDos = name.length();
        //prints the character at the number of that word
        char resultTres = name.charAt(0);
        // checks in what index a letter actually is
        int resultCuatro = name.indexOf("o");
        // checks to find out of the string is empty of not
        boolean resultCinco = name.isEmpty();
        // changes entire string to uppercase and can be done with lower also
        String resultSeis = name.toUpperCase();
        // removes any kind of empty space before or after the characters present in the strings
        String resultSiete = name.trim();
        // .replace() works exactly as it does in python
        String resultOcho = name.replace("o", "a");
    }
}
