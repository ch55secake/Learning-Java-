import java.util.ArrayList;

public class arrayLists {
    public static void main(String[] args) {
        // ArrayList = a resizable array, this means that elements can be added and removed after compilation but only to store reference data types
        ArrayList<String> food = new ArrayList<String>();

        food.add("Cheese");
        food.add("Bacon");
        food.add("Burger");

        food.set(0, "sushi");
        food.remove(2);
        //food.clear();

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
