package javacore.btvn.tuan11112025;

import java.util.Scanner;

public class B3DigitSum {

  public static int digitSum(String s) {
    int len = s.length();
    int sum = 0;
    for (int i = 0; i < len; i++) {
      sum += s.charAt(i) - '0';
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int len = s.length();
    System.out.println(len);
    System.out.println(digitSum(s));
  }
}
