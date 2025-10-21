/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

/**
 *
 * @author ICT
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SanPham {
    String tenSp;
    double donGia;
    String hang;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSp = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap hang: ");
        hang = sc.nextLine();
    }

    public void xuat() {
        System.out.printf("Ten: %-15s | Gia: %-10.2f | Hang: %-10s\n", tenSp, donGia, hang);
    }
}

public class bai2 {
    public static void main(String[] args) {
        List<SanPham> list = new ArrayList<>();
        System.out.println("=== Nhap danh sach 5 san pham ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("San pham thu " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
        }

        System.out.println("\n=== Danh sach san pham cua hang Nokia ===");
        for (SanPham sp : list) {
            if (sp.hang.equalsIgnoreCase("Nokia")) {
                sp.xuat();
            }
        }
    }
}
