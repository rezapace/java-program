import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan sudut: ");
    double sudut = input.nextDouble();

    double sin = Math.sin(sudut);
    double cos = Math.cos(sudut);
    double tan = Math.tan(sudut);

    System.out.println("Nilai sin adalah " + sin);
    System.out.println("Nilai cos adalah " + cos);
    System.out.println("Nilai tan adalah " + tan);
  }
}
