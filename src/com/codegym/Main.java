package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int size;
        int[][] matrix;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("size < 20");
            }
        } while (size > 20);
        // goi ham gan gia tri
        matrix = new int[size][size];
        addElement(matrix);
        System.out.println("Element is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        // tinh tong cot tuy chon
        System.out.print("Enter Col: ");
        int col = scanner.nextInt();
        System.out.println("Tổng của cột: "+col+" = "+sumCol(matrix,col));

    }


    // Xây dựng hàm gán giá trị cho mảng
    public static int[][] addElement(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (100 - 1) + 1);
            }
        }
        return arr;
    }

    // Xay dung ham tinh tong cot tuy chon
    public static int sumCol(int[][] arr, int col) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (j == col){
                    sum+= arr[i][j];
                }
            }
        }
        return sum;

    }
}
