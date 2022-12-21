import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Deklarasi variabel mutu
        int mutu;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai mutu: ");
        mutu = scan.nextInt();

        // Percabangan if-else
        if (mutu <= 40) {
            System.out.println("Nilai mutu Anda: D");
        } else if (mutu <= 60) {
            System.out.println("Nilai mutu Anda: C");
        } else if (mutu <= 80) {
            System.out.println("Nilai mutu Anda: B");
        } else {
            System.out.println("Nilai mutu Anda: A");
        }
    }
}
