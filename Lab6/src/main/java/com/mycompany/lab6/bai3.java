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

class SinhVien {
    String hoTen;
    String email;
    String sdt;
    String cmnd;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();

        while (true) {
            System.out.print("Nhap email: ");
            email = sc.nextLine();
            if (email.matches("\\w+@\\w+\\.\\w+")) break;
            System.out.println("❌ Email khong hop le!");
        }

        while (true) {
            System.out.print("Nhap so dien thoai: ");
            sdt = sc.nextLine();
            if (sdt.matches("0\\d{9,10}")) break;
            System.out.println("❌ SDT khong hop le! (VD: 0912345678)");
        }

        while (true) {
            System.out.print("Nhap so CMND: ");
            cmnd = sc.nextLine();
            if (cmnd.matches("\\d{9}|\\d{12}")) break;
            System.out.println("❌ CMND khong hop le! (9 hoac 12 chu so)");
        }
    }

    public void xuat() {
        System.out.printf("%-20s | %-25s | %-12s | %-12s\n", hoTen, email, sdt, cmnd);
    }
}

public class bai3 {
    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<>();
        System.out.println("=== NHAP DANH SACH 5 SINH VIEN ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("Sinh vien thu " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhap();
            list.add(sv);
        }

        System.out.println("\n=== DANH SACH SINH VIEN ===");
        System.out.printf("%-20s | %-25s | %-12s | %-12s\n", "Ho Ten", "Email", "SDT", "CMND");
        for (SinhVien sv : list) {
            sv.xuat();
        }
    }
}
