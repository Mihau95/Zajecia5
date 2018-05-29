import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args) {

        double[] liczby = new double[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        liczby[0] = scanner.nextDouble();
        System.out.println("Podaj drugą liczbe: ");
        liczby[1] = scanner.nextDouble();
        System.out.println("Podaj trzecią liczbe: ");
        liczby[2] = scanner.nextDouble();

    double sum = liczby[0] + liczby[1] + liczby[2];
    System.out.println(liczby[0] + " + " + liczby[1] + " + " + liczby[2] + " = " + sum);
    }
}
