
//My wife asked me to make something simple for her to calculate her candle wax recipe.

import java.util.Scanner;


class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the total in Oz?: ");
        Double total = scanner.nextDouble();
         
        Double soyWax = (total * 0.7);
        Double coconutOil = (total * 0.3);

        System.out.printf("Your recipe calls for %f oz of soy wax and %f oz of coconut oil.", soyWax, coconutOil);

        scanner.close();
    }

}
