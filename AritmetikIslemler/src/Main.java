import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,d;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen ilk sayı değerinizi giriniz: ");
        a = inp.nextInt();
        System.out.print("Lütfen ikinci sayı değerinizi giriniz: ");
        b = inp.nextInt();
        System.out.print("Lütfen üçüncü sayı değerinizi giriniz: ");
        c = inp.nextInt();

        d = d = (a + (b*c)-b);
        System.out.println(d);
    }
}