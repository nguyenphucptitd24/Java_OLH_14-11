package javacore.btvn.tuan11112025;

import java.util.Scanner;

public class B2IsDivisibleBy3And5 {

  public static int check(int a) {
    if (a % 3 == 0 || a % 5 == 0) {
      return a;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int dem = 0;
    for (int i = 1; i <= a; i++) {
      if (check(i) == i) {
        dem+= i;
      }
    }
    System.out.println(dem);
  }
}
