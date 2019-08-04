package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {1, 5, 4, 6, 7, 3, 2};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mang hien tai la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\t");
        System.out.println("Nhap gia tri muon them: ");
        int x = scanner.nextInt();
        System.out.println("Nhap vi tri muon chèn vào: ");
        int index = scanner.nextInt();
        try {
            int[] newArray = new int[arr.length + 1];
            for (int i = 0; i < newArray.length; i++) {
                if (index > i) {
                    newArray[i] = arr[i];
                } else if (index == i) {
                    newArray[i] = x;
                } else {
                    newArray[i] = arr[i - 1];
                }
            }
            System.out.println("mang sau khi them");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        } catch (Exception e) {
            System.err.println("vi tri nhap vao vuot qua gioi han mang");
        }
    }
}
