import java.util.Scanner;

public class Practice_4_Taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi giriniz: ");
        double dist = input.nextDouble();

        double priceKm = 2.20d;
        double total = (dist * priceKm) + 10 < 20.0d ? 20.0d : (dist * priceKm) + 10;
        System.out.println("Toplam Tutar: " + total);
    }
}
