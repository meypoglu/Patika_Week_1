import java.util.Scanner;

public class Practice_3_Hypotenuse_and_Area_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin İki Kenarını Giriniz: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double hypo = Math.sqrt((side1 * side1) + (side2 * side2));
        System.out.println("Hipotenüs Uzunluğu: " + hypo);

        Scanner input2 = new Scanner(System.in);
        System.out.print("Üçgenin Üç Kenarını Giriniz: ");
        double sid1 = input2.nextDouble();
        double sid2 = input2.nextDouble();
        double sid3 = input2.nextDouble();

        double u = (sid1 + sid2 + sid3) / 2;
        double area = Math.sqrt(u * (u - sid1) * (u - sid2) * (u - sid3));
        System.out.println("Üçgenin Alanı: " + area);
    }
}
