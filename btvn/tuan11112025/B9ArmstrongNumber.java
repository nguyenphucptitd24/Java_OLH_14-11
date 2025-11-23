package javacore.btvn.tuan11112025;

import java.util.Scanner;

public class B9ArmstrongNumber {
  public static boolean Amstrong(long n) {
    long res = 0;
    long tmp = n;
    while(n != 0) {
      res += (n % 10) * (n % 10) * (n % 10);
      n = n / 10;
    }
    return res == tmp;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(Amstrong(n)) {
      System.out.println("la so Amstrong");
    }
    else {
      System.out.println("khong phai la so Amstrong");
    }
  }
}
