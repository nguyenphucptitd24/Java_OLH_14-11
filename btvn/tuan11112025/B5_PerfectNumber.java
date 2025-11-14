package javacore.btvn.tuan11112025;

import java.util.Scanner;

public class B5_PerfectNumber {
  public static int isPerfectNumber(int num) {
    int sum = 1;
    for(int i = 2; i <= Math.sqrt(num); i++) {
      if(num % i == 0) {
        sum =  sum + i;
        if(i != num / i) {
          sum += num / i;
        }
      }
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num == isPerfectNumber(num)) {
      System.out.println("Perfect Number");
    }
    else {
      System.out.println("Not Perfect Number");
    }
  }
}
