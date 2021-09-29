import java.util.ArrayList;

public class twoDimensionallyArrayLists {
    public static void main(String[] args){
        // 2D ArrayList = a dynamic list of lists
        // You can change the size of them during runtime

        ArrayList<ArrayList<String>> entireList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Cheese");
        bakeryList.add("Doritos");
        bakeryList.add("Doughnuts");

        System.out.println(bakeryList.get(0));

        ArrayList<String> cheeseShopping = new ArrayList<>();

        cheeseShopping.add("Cheddar");
        cheeseShopping.add("Mozzarella");
        cheeseShopping.add("Halloumi");

        ArrayList<String> drinksShopping = new ArrayList<>();

        cheeseShopping.add("Coke");
        cheeseShopping.add("Fanta");
        cheeseShopping.add("Water");

        System.out.println(drinksShopping);
        entireList.add(bakeryList);
        entireList.add(cheeseShopping);
        entireList.add(drinksShopping);
        System.out.println(entireList.get(1));

    }
}
