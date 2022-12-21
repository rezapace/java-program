import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan massa: ");
    int massa = input.nextInt();

    System.out.print("Masukkan volume: ");
    int volume = input.nextInt();

    double masaJenis = (double) massa / volume;

    System.out.println("Masa jenis adalah " + masaJenis);
  }
}
