/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHienScanner;

import java.util.Scanner;

/**
 *
 * @author hoan6
 */
public class BT01 {
    static boolean checkPerfectNum(int n){
        
        int sum = 0;
        for (int i = 1; i <= n /2 ; i++) {
            if(n % i == 0){
                sum += i;
            }
        }
        if(sum == n)
            return true;
        
        
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap so nguyen 1: ");
        int n = sc.nextInt();
        System.out.println("Nhap so nguyen 2: ");
        int m = sc.nextInt();
        
        if(checkPerfectNum(n) == true)
            System.out.println("So hoan hao");
        else 
            System.out.println("Kp so hoan hao");
        if(checkPerfectNum(m) == true)
            System.out.println("So hoan hao");
        else 
            System.out.println("Kp so hoan hao");
        
        
    }
}
