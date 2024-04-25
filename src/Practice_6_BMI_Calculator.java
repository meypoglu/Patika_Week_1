// Kullanıcıdan boy ve kilo değerleri alıp vücut-kitle endeksini hesaplayan program

import java.util.Scanner;

public class Practice_6_BMI_Calculator {
    public static void main(String[] args) {
        // Kullanıcıdan girdilerin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinde giriniz: ");
        // Boy değişkeni
        double height = input.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        // Kilo değişkeni
        double weight = input.nextDouble();
        // Sonucun hesaplanarak ekrana verilmesi
        System.out.println("Vücut kitle endeksiniz: " + weight / (height * height));
    }
}
