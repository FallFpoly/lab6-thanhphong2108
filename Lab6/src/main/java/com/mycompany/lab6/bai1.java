/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String fullName = sc.nextLine().trim();

        int firstSpace = fullName.indexOf(" ");
        int lastSpace = fullName.lastIndexOf(" ");

        String ho = fullName.substring(0, firstSpace).toUpperCase();
        String ten = fullName.substring(lastSpace + 1).toUpperCase();
        String tenDem = fullName.substring(firstSpace + 1, lastSpace);

        System.out.println("Ho: " + ho);
        System.out.println("Ten dem: " + tenDem);
        System.out.println("Ten: " + ten);
    }
}
