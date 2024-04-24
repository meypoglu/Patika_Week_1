import java.util.Scanner;

public class Practice_3_2_Triangle_Area_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin Üç Kenarını Giriniz: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        double u = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));
        System.out.println("Üçgenin Alanı: " + area);
    }
}
