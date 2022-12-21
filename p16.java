import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan panjang persegi panjang: ");
    int panjang = input.nextInt();

    System.out.print("Masukkan lebar persegi panjang: ");
    int lebar = input.nextInt();

    int luas = panjang * lebar;
    System.out.println("Luas persegi panjang adalah " + luas);
  }
}
