import java.util.Scanner;

public class SegitigaSiku {
  public static void main(String[] args) {
    // Deklarasi variabel tinggi
    int tinggi;

    // Membuat objek Scanner untuk meminta input dari user
    Scanner input = new Scanner(System.in);

    // Meminta input tinggi segitiga dari user
    System.out.print("Masukkan tinggi segitiga: ");
    tinggi = input.nextInt();

    // Perulangan untuk membuat segitiga siku-siku
    for (int i = 1; i <= tinggi; i++) {
      // Perulangan untuk menampilkan bintang pada setiap baris
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
