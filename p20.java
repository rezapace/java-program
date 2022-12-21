import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan sisi: ");
    double s = input.nextDouble();

    double luas = 6 * Math.pow(s, 2);
    System.out.println("Luas permukaan kubus adalah " + luas);
  }
}
