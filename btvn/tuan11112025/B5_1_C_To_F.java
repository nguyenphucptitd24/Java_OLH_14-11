package javacore.btvn.tuan11112025;

import java.util.Scanner;

public class B5_1_C_To_F {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
      System.out.println("=== CHUYEN DOI NHIET DO ===");
      System.out.println("1. C SANG F");
      System.out.println("2. F SANG C");
      System.out.println("3. THOAT");

      choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println("NHAP C");
          double doC = sc.nextDouble();
          double doF = (doC * 9.0 / 5.0) + 32;
          System.out.printf("%.1f C = %.1f F\n", doC, doF);
          break;
        case 2:
          System.out.println("NHAP F");
          double doF_input = sc.nextDouble();
          double doC_input = (doF_input - 32) * 5.0 / 9.0;
          System.out.printf("%.1f F = %.1f C\n", doF_input, doC_input);
          break;
        case 3:
          System.out.println("Tam biet");
          break;
      }
      System.out.println();
    } while (choice != 3);
    sc.close();
  }
}
