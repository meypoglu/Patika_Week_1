import java.util.Scanner;

public class Practice_2_VAT_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Para değerini giriniz: ");
        double money = input.nextDouble();
        double vat = money > 999 ? 0.08d : 0.18d;
        System.out.println("KDV'li tutar: " + (money + money * vat));
        System.out.println("KDV'nin tutarı: " + vat);
    }
}
