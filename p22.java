import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nama mahasiswa: ");
    String nama = input.nextLine();

    System.out.print("Masukkan NIM: ");
    String nim = input.nextLine();

    System.out.print("Masukkan alamat: ");
    String alamat = input.nextLine();

    System.out.println("Nama mahasiswa: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("Alamat: " + alamat);
  }
}
