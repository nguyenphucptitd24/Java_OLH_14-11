package javacore.btvn.tuan11112025;

import java.util.Scanner;

public class B1_isPrime {

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean KiemTraChanLe(int num) {
    if (num % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if (KiemTraChanLe(num)) {
      System.out.println("So chan");
    } else {
      System.out.println("So le");
    }
    if (isPrime(num)) {
      System.out.println("So nguyen to");
    } else {
      System.out.println("Khong Phai la so nguyen to");
    }
  }
}
