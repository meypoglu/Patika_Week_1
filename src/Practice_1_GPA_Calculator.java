import java.util.Scanner;

public class Practice_1_GPA_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] lessons = {"Matematik", "Fizik", "Kimya", "Türkçe",
                "Tarih", "Müzik"};
        int average = 0;
        for (int i=0;i<6;i++) {
            System.out.print(lessons[i] + " dersinin notunu giriniz: ");
            int var = input.nextInt();
            average += var;
        }
        String result = (average / 6) >= 60 ? ("Not Ortalaması: " + average / 6 + ", Öğrenci Sınıfı Geçti") : ("Not Ortalaması: " + average / 6 + ", Öğrenci Sınıfta Kaldı");
        System.out.println(result);
    }
}
