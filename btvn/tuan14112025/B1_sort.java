package javacore.btvn.tuan14112025;

import java.util.Scanner;

public class B1_sort {

  public static void selection(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min_idx = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min_idx]) {
          min_idx = j;
        }
      }
      int tmp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = tmp;
    }
  }

  public static void insertion(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
  }

  public static void buble(int[] arr) {
    int n = arr.length;
    boolean swapped;
    for (int i = 0; i < n - 1; i++) {
      swapped = false;
      for(int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
          swapped = true;
        }
      }
      if(!swapped) {
        break;
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr1 = new int[n];
    for (int i = 0; i < n; i++) {
      arr1[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    int[] arr2 = new int[m];
    for (int i = 0; i < m; i++) {
      arr2[i] = sc.nextInt();
    }
    int k  = sc.nextInt();
    int[] arr3 = new int[k];
    for (int i = 0; i < k; i++) {
      arr3[i] = sc.nextInt();
    }
    selection(arr1);
    insertion(arr2);
    buble(arr3);
    for (int i = 1; i <= n; i++) {
      System.out.print(arr1[i - 1] + " ");
    }
    System.out.println();
    for (int i = 1; i <= m; i++) {
      System.out.print(arr2[i - 1] + " ");
    }
    System.out.println();
    for (int i = 1; i <= k; i++) {
      System.out.print(arr3[i - 1] + " ");
    }
    System.out.println();
  }
}
