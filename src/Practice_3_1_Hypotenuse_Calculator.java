import java.util.Scanner;

public class Practice_3_1_Hypotenuse_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin İki Kenarını Giriniz: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double hypo = Math.sqrt((side1 * side1) + (side2 * side2));
        System.out.println("Hipotenüs Uzunluğu: " + hypo);
    }
}
