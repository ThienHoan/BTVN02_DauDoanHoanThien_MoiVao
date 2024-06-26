/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoscanner;

import java.util.Scanner;

/**
 *
 * @author hoan6
 */
public class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Moi ban nhap tuoi: ");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("Moi ban nhap SDT: ");
        int soDT = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap chuyen nghanh: ");
        String cN = sc.nextLine();
        
        System.out.println("------------------");
        System.out.println("Thong tin cua ban vua nhap: ");
        System.out.println("Ten: " +ten + " Tuoi: "+tuoi+ " Dia chi: "+diaChi+ " So Dien Thoai: "+soDT+ " Chuyen Nganh: "+cN);
        
        
    }
}
