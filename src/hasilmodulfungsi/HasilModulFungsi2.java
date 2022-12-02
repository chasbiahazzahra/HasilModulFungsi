/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasilmodulfungsi;

import java.util.Scanner;

/**
 *
 * @author moklet gaming 1
 */
public class HasilModulFungsi2 {

    public static void hitung(int a, int b, int c) {
        Math.max(a,c);
        int maks;
        System.out.print("Nilai tertinggi: ");
        maks = Math.max(a, b);
        if (c > maks) {
            maks = c;
        }
        System.out.println(maks);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("Masukan nilai a: ");
        a = input.nextInt();

        System.out.print("Masukan nilai b: ");
        b = input.nextInt();

        System.out.print("Masukan nilai c: ");
        c = input.nextInt();
        
        hitung(a,b,c);

    }
}

