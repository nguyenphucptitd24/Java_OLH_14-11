package javacore.btvn.tuan11112025;

import java.util.Scanner;

public class B8_TongLe {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // 1. Tính số lượng các số lẻ từ 1 đến n
    // (n + 1) / 2 sử dụng phép chia số nguyên
    int m = (n + 1) / 2;

    // 2. Tổng là bình phương của số lượng đó
    int sum = m * m;

    System.out.println(sum);
  }
}