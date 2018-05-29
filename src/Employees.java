//import java.util.Scanner;
//
//public class EmployeeTest {
//    public static void main(String[] args) {
//        Employee[] employees = new Employee[2];
//        employees[0]=new Employee();
//        employees[1]=new Employee();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj imie 1 pracownika: ");
//        employees[0].setImie(scan.nextLine());
//        System.out.println("Podaj nazwisko 1 pracownika: ");
//        employees[0].setNaziwsko(scan.nextLine());
//        System.out.println("Podaj wypłate 1 pracownika: ");
//        employees[0].setWyplata(scan.nextInt());
//        scan.nextLine();
//        System.out.println("Podaj imie 2 pracownika: ");
//        employees[1].setImie(scan.nextLine());
//        System.out.println("Podaj nazwisko 2 pracownika: ");
//        employees[1].setNaziwsko(scan.nextLine());
//        System.out.println("Podaj wypłate 2 pracownika: ");
//        employees[1].setWyplata(scan.nextInt());
//
//        int wyplata = employees[0].getWyplata() + employees[1].getWyplata();
//        System.out.println(employees[0].showInfo());
//        System.out.println(employees[1].showInfo());
//        System.out.println("Firma przeznacza na wyplaty " + wyplata);
//
//    }
//}