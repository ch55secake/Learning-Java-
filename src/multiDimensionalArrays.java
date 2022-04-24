public class multiDimensionalArrays {
    public static void main(String[] args){
        // 2D array = an array of arrays

        String[][] cars = new String[3][3];
        // can be written as so String[][] cars = {{"Tesla","Ford","Mini"},{"Ka","Ranger","Fiesta"}};

        cars[0][0] = "Tesla";
        cars[0][1] = "Ford";
        cars[0][2] = "Mini";
        cars[1][0] = "Ka";
        cars[1][1] = "Ranger";
        cars[1][2] = "Mustang";
        cars[2][0] = "Fiesta";
        cars[2][1] = "BMW";
        cars[2][2] = "MarioKart";

        for(int i=0;i<cars.length;i++) {
            System.out.println();
            for(int j=0;j<cars[i].length;j++) {
                System.out.println(cars[i][j]);
            }

        }
    }
}
