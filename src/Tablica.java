public class Tablica {
    public static void main(String[] args) {
        double[][] liczba = new double[4][];
        liczba[0] = new double[3];
        liczba[1] = new double[2];
        liczba[2] = new double[4];
        liczba[3] = new double[1];

        liczba [0][0] = 1;
        liczba [0][1] = 2;
        liczba [0][2] = 3;

        liczba[1][0] = 1;
        liczba[1][1] = 2;

        liczba[2][0] = 1;
        liczba[2][1] = 2;
        liczba[2][2] = 3;
        liczba[2][3] = 4;

        liczba[3][0] = 1;

        double sum1 = liczba[0][0] + liczba[0][1] + liczba[0][2];
        System.out.println(sum1 + " ");

        double sum2 = liczba[1][0] +liczba[1][1];
        System.out.println(sum2 + " ");

        double sum3 = liczba[2][0] + liczba[2][1] + liczba[2][2] + liczba[2][3];
        System.out.println(sum3 + " ");

        double sum4 = liczba[3][0];
        System.out.println(sum4 + " ");
    }
}
