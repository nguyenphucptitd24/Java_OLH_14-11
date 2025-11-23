package javacore.btvn;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class tuan17112025 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int[] arr1 = new int[n];
    for (int i = 0; i < n; i++) {
      arr1[i] = scanner.nextInt();
    }

    int m = scanner.nextInt();

    int[] arr2 = new int[m];
    for (int i = 0; i < m; i++) {
      arr2[i] = scanner.nextInt();
    }

    printUnion(arr1, arr2);
    printIntersection(arr1, arr2);

    scanner.close();
  }

  public static void printUnion(int[] arr1, int[] arr2) {
    Set<Integer> unionSet = new TreeSet<>();

    for (int x : arr1) {
      unionSet.add(x);
    }

    for (int x : arr2) {
      unionSet.add(x);
    }

    StringBuilder sb = new StringBuilder();
    for (int x : unionSet) {
      sb.append(x).append(" ");
    }

    if (sb.length() > 0) {
      System.out.println(sb.toString().trim());
    } else {
      System.out.println("NO");
    }
  }

  public static void printIntersection(int[] arr1, int[] arr2) {
    Set<Integer> set1 = new HashSet<>();
    for (int x : arr1) {
      set1.add(x);
    }

    Set<Integer> intersectionSet = new TreeSet<>();

    for (int x : arr2) {
      if (set1.contains(x)) {
        intersectionSet.add(x);
      }
    }

    StringBuilder sb = new StringBuilder();
    if (intersectionSet.isEmpty()) {
      System.out.println("NO");
    } else {
      for (int x : intersectionSet) {
        sb.append(x).append(" ");
      }
      System.out.println(sb.toString().trim());
    }
  }

}
