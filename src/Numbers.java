import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int i = 0;
        while (i<5) {
            System.out.println("Kolejna liczba: " + i);
            int liczba = input.nextInt();
            sum = sum + liczba;
            System.out.println("Dalej:" + sum + liczba);
            i++;

        }

    }
}
