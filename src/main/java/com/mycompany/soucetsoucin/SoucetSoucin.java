package com.mycompany.soucetsoucin;

import java.util.Scanner;

public class SoucetSoucin {
    
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.print("Zadejte 1. cislo: ");
        int i = sc.nextInt();
        
        System.out.print("Zadejte 2. cislo: ");
        int j = sc.nextInt();
        
        int soucet = i + j;
        int soucin = i * j;
        
        System.out.println("Soucet: " + soucet);
        System.out.println("Soucin: " + soucin);
        
    }
}
