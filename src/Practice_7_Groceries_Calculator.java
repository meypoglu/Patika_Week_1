// Satın alınan manav ürünlerinin miktarına göre ödenecek ücreti hesaplayan program

import java.util.Scanner;

public class Practice_7_Groceries_Calculator {
    public static void main(String[] args) {
        // Meyve ve sebzeleri tutan array
        String[] groceries = {"Armut", "Elma", "Domates", "Muz", "Patlıcan"};
        // Fiyatları tutan array, groceries ile aynı indeksteki ürünlerin fiyatları
        double[] prices = {2.14d, 3.67d, 1.11d, 0.95d, 5.0d};
        double total = 0;
        // Scanner oluşturulması
        Scanner input = new Scanner(System.in);
        // Aynı işlem tekrar tekrar yapılacağı için bütün ürünleri sırayla alan for döngüsü
        for (int i = 0;i<5;i++) {
            System.out.print(groceries[i] + " Kaç Kilo ?: ");
            double v1 = input.nextDouble();
            // Her döngüde toplam ücrete alınan ürün ve miktarına göre ekleme yapılır
            total += prices[i] * v1;
        }
        // Sonucun ekrana verilmesi
        System.out.println("Toplam tutar: " + total + "TL");
    }
}
