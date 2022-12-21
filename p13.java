import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Meminta input tinggi segitiga dari user
    System.out.print("Masukkan tinggi segitiga: ");
    int tinggi = scanner.nextInt();

    // Perulangan untuk membuat segitiga
    for (int brs = 1; brs <= tinggi; brs++) {
      // Menampilkan spasi sebelum bintang
      for (int spasi = 30; spasi >= brs; spasi--) {
        System.out.print(" ");
      }
      // Menampilkan bintang pada bagian kiri segitiga
      for (int klm = 1; klm <= brs; klm++) {
        System.out.print("*");
      }
      // Menampilkan bintang pada bagian kanan segitiga
      for (int klm = brs - 1; klm >= 0; klm--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
