/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rsoftware.if1.latihan11;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF1
 * NIM   : 10119038
 * Deskripsi Program : Formatting
 * 
 */

public class IF110119038Latihan11Formatting {
   
    public static void main(String[] args) {
        
        int i = 3546764;
        int iMinus = -i;
        System.out.printf("i : " + i);
        System.out.printf("%%d : %d%n", i);
        System.out.printf("%%10d : %10d%n", i);
        System.out.printf("%%+10d : %+10d%n", i);
        System.out.printf("%%+10d : %+10d%n", iMinus);
        System.out.printf("%%,10d : %,10d%n", i);
        System.out.printf("%%-10d : %-10d%n", i);
        
        double f = 5675482.982;
        System.out.printf("f : " + f);
        System.out.printf("%%f : %f%n", f);
        System.out.printf("%%.2f : %.2f%n", f);
        System.out.printf("%%12.2f : %12.2f%n", f);
        System.out.printf("%%,12.2f : %,12.2f%n", f);
    }
}