import java.util.Scanner;

public class AritmatikaSederhana {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Mendapatkan input dari pengguna
    System.out.print("Masukkan angka pertama: ");
    int angka1 = input.nextInt();
    System.out.print("Masukkan angka kedua: ");
    int angka2 = input.nextInt();

    // Menghitung hasil
    int tambah = angka1 + angka2;
    int kurang = angka1 - angka2;
    int kali = angka1 * angka2;
    double bagi = (double) angka1 / angka2;

    // Menampilkan hasil
    System.out.println(angka1 + " + " + angka2 + " = " + tambah);
    System.out.println(angka1 + " - " + angka2 + " = " + kurang);
    System.out.println(angka1 + " * " + angka2 + " = " + kali);
    System.out.println(angka1 + " / " + angka2 + " = " + bagi);
  }
}
