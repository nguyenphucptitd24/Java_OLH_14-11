package javacore.btvn.tuan14112025;
import java.util.Scanner;
public class B2_2DArray {

  public static int[][] nhap(int rows, int cols, Scanner sc) {
    int [][] arr =  new int[rows][cols];
    for(int i = 0; i < rows; i++) {
      for(int j = 0; j < cols; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    return arr;
  }
  public static void xuat(int arr[][]){
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int[][] arr = nhap(rows, cols, sc);
    xuat(arr);
    sc.close();
  }
}
