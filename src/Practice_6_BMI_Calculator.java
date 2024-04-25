import java.util.Scanner;

public class Practice_6_BMI_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinde giriniz: ");
        double height = input.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        double weight = input.nextDouble();

        System.out.println("Vücut kitle endeksiniz: " + weight / (height * height));
    }
}
