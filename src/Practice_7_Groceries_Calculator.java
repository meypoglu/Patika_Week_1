import java.util.Scanner;

public class Practice_7_Groceries_Calculator {
    public static void main(String[] args) {
        String[] groceries = {"Armut", "Elma", "Domates", "Muz", "Patlıcan"};
        double[] prices = {2.14d, 3.67d, 1.11d, 0.95d, 5.0d};
        double total = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0;i<5;i++) {
            System.out.print(groceries[i] + " Kaç Kilo ?: ");
            double v1 = input.nextDouble();
            total += prices[i] * v1;
        }
        System.out.println("Toplam tutar: " + total + "TL");
    }
}
