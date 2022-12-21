import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Deklarasi variabel nilai
        int nilai;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai Anda: ");
        nilai = scan.nextInt();

        // Cek apakah nilai lebih besar atau sama dengan 50
        if (nilai >= 50) {
            System.out.println("Nilai Anda: " + nilai);
        } else {
            System.out.println("Maaf, Anda tidak lulus");
        }
    }
}
