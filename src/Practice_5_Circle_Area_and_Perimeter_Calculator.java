import java.util.Scanner;

public class Practice_5_Circle_Area_and_Perimeter_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz: ");
        double r = input.nextDouble();

        System.out.println("Dairenin alanı: " + r * r * Math.PI);
        System.out.println("Dairenin çevresi: " + 2 * Math.PI * r);

        Scanner input2 = new Scanner(System.in);
        System.out.println("Daire diliminin merkez açısını giriniz: ");
        double alpha = input2.nextDouble();

        System.out.println("Daire diliminin alanı: " + (3.14d * r * r * alpha) / 360.0d);
    }
}
